package ec.espe.edu.SoccerTeam.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.espe.edu.SoccerTeam.model.Teams;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamsData {
    private static final String FILE_NAME = "teams.json";
    private List<Teams> teamsList;
    private Gson gson;

    public TeamsData() {
        this.teamsList = new ArrayList<>();
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Main Menu:");
            System.out.println("1. Add Team");
            System.out.println("2. Delete Team");
            System.out.println("3. Show Teams");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTeam();
                    break;
                case 2:
                    deleteTeam();
                    break;
                case 3:
                    showTeams();
                    break;
                case 4:
                    saveTeamsToJson();
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void addTeam() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teams you want to add: ");
        int numTeams = scanner.nextInt();

        for (int i = 0; i < numTeams; i++) {
            System.out.println("Enter details for Team " + (i + 1) + ":");
            System.out.print("Enter team ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter team name: ");
            String name = scanner.nextLine();
            System.out.print("Enter team color: ");
            String color = scanner.nextLine();

            Teams team = new Teams(id, name, color);
            teamsList.add(team);
        }

        System.out.println("Teams added successfully!");
    }

    private void deleteTeam() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ID of the team you want to delete: ");
        int idToDelete = scanner.nextInt();

        teamsList.removeIf(team -> team.getId() == idToDelete);

        System.out.println("Team deleted successfully!");
    }

    private void showTeams() {
        if (teamsList.isEmpty()) {
            System.out.println("No teams to display.");
        } else {
            for (Teams team : teamsList) {
                System.out.println(team);
            }
        }
    }

    private void saveTeamsToJson() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(teamsList, writer);
            System.out.println("Teams saved to " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TeamsData teamsData = new TeamsData();
        teamsData.runMenu();
    }
}
