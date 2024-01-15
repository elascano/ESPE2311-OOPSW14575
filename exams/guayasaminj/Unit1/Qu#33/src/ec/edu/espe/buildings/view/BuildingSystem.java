
package ec.edu.espe.buildings.view;


import ec.edu.espe.buildings.model.Building;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author JosuéG
 */
public class BuildingSystem {
    private static ArrayList<Building> buildings = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Building System Menu:");
            System.out.println("1. Add Building");
            System.out.println("2. Show Buildings");
            System.out.println("3. Export to JSON");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBuilding();
                    break;
                case 2:
                    showBuildings();
                    break;
                case 3:
                    exportToJson();
                    break;
                case 0:
                    System.out.println("Exiting Building System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

    private static void addBuilding() {
        System.out.print("Enter building ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter building color: ");
        String color = scanner.nextLine();
        System.out.print("Enter number of floors: ");
        int floors = scanner.nextInt();

        Building newBuilding = new Building(id, color, floors);
        buildings.add(newBuilding);

        System.out.println("Building added successfully!");
    }

    private static void showBuildings() {
        System.out.println("List of Buildings:");
        for (Building building : buildings) {
            System.out.println(building);
        }
    }

    private static void exportToJson() {
        try (FileWriter writer = new FileWriter("buildings.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(buildings, writer);
            System.out.println("Buildings exported to buildings.json successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
         
         
       


