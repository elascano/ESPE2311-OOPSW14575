package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author David Cepeda, DCCO ESPE
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class ChickenFarmSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Chicken[] chickens = new Chicken[1];
        
        int option;
        do {
        System.out.println("Hello Chickens from the Simulator");
        System.out.println("My name is --> David Cepeda");
        System.out.println("\nMenu");
        System.out.println("Select an option:");
        System.out.println("1. Enter a chicken");
        System.out.println("2. Show a chicken");
        System.out.println("3. Save chickens to CSV");
        System.out.println("4. Show GSON");
        System.out.println("5. Save GSON");
        System.out.println("6. Exit");
        option = scanner.nextInt();
        scanner.nextLine();
        
        switch (option) {
                case 1:
                    enterChicken(chickens);
                    break;
                case 2:
                    showChickens(chickens);
                    break;
                case 3:
                    saveToCSV(chickens);
                    break;
                 case 4:
                    showGson(chickens);
                    break;
                case 5:
                    saveGson(chickens);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 6);
    }

        
       
        
    private static void enterChicken(Chicken[] chickens) {
        for (int i = 0; i < chickens.length; i++) {
            System.out.println("Enter the ID of the chicken:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the name of the chicken:");
            String name = scanner.nextLine();

            System.out.println("Enter the color of the chicken:");
            String color = scanner.nextLine();

            System.out.println("Enter the birthdate of the chicken (yyyy-MM-dd):");
            String birthDateString = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(birthDateString);

            System.out.println("Is the chicken molting? (true/false):");
            boolean isMolting = scanner.nextBoolean();

            chickens[i] = new Chicken(id, name, color, birthDate, isMolting);

            if (i < chickens.length - 1) {
                System.out.println("Next Chicken");
            }
        }
    } 
       
    private static void showChickens(Chicken[] chickens) {
        System.out.println("Details of the chickens:");
        for (Chicken c : chickens) {
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }
    private static void saveToCSV(Chicken[] chickens) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("chickens.csv"))) {
            for (Chicken c : chickens) {
                if (c != null) {
                    writer.println(c.toCSV());
                }
            }
            System.out.println("Chickens saved to CSV file.");
        } catch (IOException e) {
            System.err.println("Error saving to CSV: " + e.getMessage());
        }
    }
    private static void showGson(Chicken[] chickens) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("JSON representation of chickens:");
        for (Chicken c : chickens) {
            if (c != null) {
                String json = gson.toJson(c);
                System.out.println(json);
            }
        }
    }

    private static void saveGson(Chicken[] chickens) {
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .create();

    try (PrintWriter writer = new PrintWriter(new FileWriter("chickens.json"))) {
        for (Chicken c : chickens) {
            if (c != null) {
                String json = gson.toJson(c);
                writer.println(json);
            }
        }
        System.out.println("Chickens saved to JSON file.");
    } catch (IOException e) {
        System.err.println("Error saving to JSON: " + e.getMessage());
    }
}
}

