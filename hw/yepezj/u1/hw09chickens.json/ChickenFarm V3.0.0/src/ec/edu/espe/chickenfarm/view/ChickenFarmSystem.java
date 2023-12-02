package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.time.LocalDate;
import java.io.File;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class ChickenFarmSystem {

    public static void main(String[] args) throws IOException {
        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "Brown", 2, true, 24, 11, 2022);
        Chicken chicken2 = new Chicken(2, "Juan", "Black", 3, true, 12, 10, 2021);

        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is --> Jefferson David Yepez Moran");
        System.out.println("poop -->" + poop);
        System.out.println("egg -->" + egg);
        System.out.println("chicken -->" + chicken);
        System.out.println("chicken2 -->" + chicken2);

        menu();

    }

    public static void createChickens() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chicken id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chicken name: ");
        String name = scanner.nextLine();
        System.out.println("Chicken color:");
        String color = scanner.nextLine();
        System.out.println("Chicken is molting: ");
        boolean isLayingEggs = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Day of birth of chicken: ");
        int day = scanner.nextInt();
        System.out.println("Month of birth of chicken: ");
        int month = scanner.nextInt();
        System.out.println("Year of birth of chicken: ");
        int year = scanner.nextInt();
        int age = calculateDate(day, month, year);
        Chicken chicken = new Chicken(id, name, color, age, isLayingEggs, day, month, year);

        System.out.println("Would you like to save your chicken? Yes(1) or no(2)");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Do you want to save in Csv(1) or Json(2) files?");
                int optionFile = scanner.nextInt();
                switch (optionFile) {
                    case 1:
                        saveChickensToCSV(chicken);
                        break;
                    case 2:
                        saveChickensToJson(chicken);
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
                break;

            case 2:
                System.out.println("Chicken is not saved");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }

    public static void saveChickensToCSV(Chicken chicken) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("chickens.csv", true))) {
            writer.write(chicken.getId() + ";"
                    + chicken.getName() + ";"
                    + chicken.getColor() + ";"
                    + chicken.getAge() + ";"
                    + chicken.getIsMolting() + ";"
                    + chicken.getBornOnDay() + ";"
                    + chicken.getBornOnMonth() + ";"
                    + chicken.getBornOnYear() + "\n");
            System.out.println("Chicken added to chickens.csv");
        } catch (IOException e) {
            System.out.println("Error adding the chicken to the CSV file.");
        }
    }

    public static void saveChickensToJson(Chicken chicken) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("chickens.json", true))) {

            JsonObject chickenObject = new JsonObject();
            chickenObject.addProperty("id", chicken.getId());
            chickenObject.addProperty("name", chicken.getName());
            chickenObject.addProperty("color", chicken.getColor());
            chickenObject.addProperty("age", chicken.getAge());
            chickenObject.addProperty("isMolting", chicken.getIsMolting());
            chickenObject.addProperty("BornOnDay", chicken.getBornOnDay());
            chickenObject.addProperty("BornOnMonth", chicken.getBornOnMonth());
            chickenObject.addProperty("BornOnYear", chicken.getBornOnYear());
            
            String jsonString = gson.toJson(chickenObject);
            writer.write(jsonString);
            writer.newLine(); 
            System.out.println("Chicken added to chickens.json");
        } catch (IOException e) {
            System.out.println("Error al añadir el pollo al archivo JSON.");
        }
    }



    public static void displayChickensToCsv() {
        String csvFileName = "chickens.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");

                Chicken chicken = new Chicken(
                        Integer.parseInt(fields[0]),
                        fields[1],
                        fields[2],
                        Integer.parseInt(fields[3]),
                        Boolean.parseBoolean(fields[4]),
                        Integer.parseInt(fields[5]),
                        Integer.parseInt(fields[6]),
                        Integer.parseInt(fields[7])
                );
                System.out.println(chicken);
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }

    public static void displayChickensToJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String JSON_FILE = "chickens.json";
        try (BufferedReader reader = new BufferedReader(new FileReader(JSON_FILE))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JsonObject chickensObject = gson.fromJson(jsonContent.toString(), JsonObject.class);
            for (String key : chickensObject.keySet()) {
                try {
                    JsonObject chickenObject = chickensObject.getAsJsonObject(key);
                    System.out.println("Chicken (ID: " + key + "):");
                    System.out.println(gson.toJson(chickenObject));
                    System.out.println("------------------------------");
                } catch (JsonSyntaxException e) {
                    System.out.println("Error processing the chicken with ID." + key);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the JSON file.");
        }
    }

    public static int calculateDate(int dayBirth, int monthBirth, int yearBirth) {
        LocalDate curretnDate = LocalDate.now();
        int currentDay = curretnDate.getDayOfMonth();
        int currentMonth = curretnDate.getMonthValue();
        int currentYear = curretnDate.getYear();

        int daysDifference = currentDay - dayBirth;
        int monthsDifference = currentMonth - monthBirth;
        int YearsDifference = currentYear - yearBirth;

        if (daysDifference < 0) {
            monthsDifference--;
            daysDifference += 30;
        }
        if (monthsDifference < 0) {
            YearsDifference--;
            monthsDifference += 12;
        }

        return YearsDifference;
    }

    public static void menu() throws IOException {
        int option = 0;
        while (option != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Chicken Menu -----");
            System.out.println("1.- Create new chicken");
            System.out.println("2.- Display information of the chickens from the CSV file ");
            System.out.println("3.- Display information of the chickens from the Json file");
            System.out.println("4.- Exit");
            System.out.print("Select an option (1-4): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    createChickens();
                    break;
                case 2:
                    displayChickensToCsv();
                    break;
                case 3:
                    displayChickensToJson();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

}
