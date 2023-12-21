package ec.edu.espe.Chickenfarm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.Chickenfarm.model.Chicken;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class ChickenFarmSystem {
    private static final String JSON_FILE_PATH = "chickens.json";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Chicken> chickenList = new ArrayList<>();

        if (new File(JSON_FILE_PATH).exists()) {
            chickenList = loadChickensFromJSON();
            System.out.println("Chickens loaded from JSON.");
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add chicken");
            System.out.println("2. Print chickens");
            System.out.println("3. Save chickens to JSON");
            System.out.println("4. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    addChicken(scan, chickenList);
                    break;
                case 2:
                    printChickens(chickenList);
                    break;
                case 3:
                    saveChickensToJSON(chickenList);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addChicken(Scanner scan, ArrayList<Chicken> chickenList) {
        System.out.println("Enter id of the chicken");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the name of the chicken");
        String name = scan.nextLine();

        System.out.println("Enter the color of the chicken");
        String color = scan.nextLine();

        System.out.println("Enter the birth date of the chicken (yyyy-MM-dd)");
        String birthDateStr = scan.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        System.out.println("Is the chicken molting?");
        boolean isMolting = scan.hasNextBoolean();
        scan.nextLine();

        Chicken newChicken = new Chicken(id, name, color, birthDate, isMolting);
        chickenList.add(newChicken);
    }

    private static void printChickens(ArrayList<Chicken> chickenList) {
        System.out.println("List of Chickens:");
        for (Chicken chicken : chickenList) {
            System.out.println("Chicken: " + chicken.getId() +
                    ", Name: " + chicken.getName() +
                    ", Color: " + chicken.getColor() +
                    ", Age: " + calculateAge(chicken.getBirthDate()) +
                    ", Is Molting: " + chicken.isMolting());
        }
    }

    private static String calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        int ageYears = currentDate.getYear() - birthDate.getYear();
        int ageMonths = currentDate.getMonthValue() - birthDate.getMonthValue();
        int ageDays = currentDate.getDayOfMonth() - birthDate.getDayOfMonth();

        if (ageDays < 0) {
            ageMonths--;
            ageDays += birthDate.lengthOfMonth();
        }
        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }

        return ageYears + " years, " + ageMonths + " months, " + ageDays + " days";
    }

    private static void saveChickensToJSON(ArrayList<Chicken> chickenList) {
        try (Writer writer = new FileWriter(JSON_FILE_PATH)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(chickenList, writer);
            System.out.println("Chickens saved to JSON successfully.");
        } catch (IOException e) {
            System.err.println("Error while saving chickens to JSON: " + e.getMessage());
        }
    }

    private static ArrayList<Chicken> loadChickensFromJSON() {
        ArrayList<Chicken> loadedChickens = new ArrayList<>();

        try (Reader reader = new FileReader(JSON_FILE_PATH)) {
            Type type = new TypeToken<ArrayList<Chicken>>() {}.getType();
            Gson gson = new Gson();
            loadedChickens = gson.fromJson(reader, type);
            System.out.println("Chickens loaded from JSON successfully.");
        } catch (IOException e) {
            System.err.println("Error while loading chickens from JSON: " + e.getMessage());
        }

        return loadedChickens;
    }
}
