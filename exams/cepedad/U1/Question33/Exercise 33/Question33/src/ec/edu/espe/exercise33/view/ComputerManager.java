package ec.edu.espe.exercise33.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exercise33.model.Computer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ComputerManager {

    private static final String JSON_FILE_PATH = "computers.json";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Computer> computers = loadFromJson();

        int choice;
        do {
            System.out.println("Welcome to Computer Manager:");
            System.out.println("1. Enter Computer Data");
            System.out.println("2. Count Entered Objects");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Computer newComputer = inputComputerData();
                    computers.add(newComputer);
                    saveToJson(computers);
                    break;

                case 2:
                    int totalObjects = countObjects();
                    System.out.println("Total number of computers: " + totalObjects);
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please enter a valid number.");
            }

        } while (choice != 3);
    }

    private static Computer inputComputerData() {
        System.out.print("Enter the computer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter the computer brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter the computer color: ");
        String color = scanner.nextLine();

        return new Computer(id, brand, color);
    }

    private static void saveToJson(ArrayList<Computer> computers) {
        try (Writer writer = new FileWriter(JSON_FILE_PATH)) {
            Gson gson = new Gson();
            gson.toJson(computers, writer);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Computer> loadFromJson() {
        try (Reader reader = new FileReader(JSON_FILE_PATH)) {
            Gson gson = new Gson();

            Type listType = new TypeToken<ArrayList<Computer>>() {
            }.getType();
            return gson.fromJson(reader, listType);

        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private static int countObjects() {
        return loadFromJson().size();
    }
}
