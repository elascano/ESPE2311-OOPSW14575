
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;



public class ChickenFarmSystem {
    
    public static void main(String[] args) {

        Chicken[] chickens = new Chicken[1];
        initializeChickens(chickens);

        Scanner scanner = new Scanner(System.in);
         
        int option;
        do {
            System.out.println("Chicken Farm System Menu:");
            System.out.println("1. Save Chickens");
            System.out.println("2. Read Chickens and Export");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    saveChickens(chickens);
                    break;
                case 2:
                    readChickensandExport(chickens);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 3);

        scanner.close();
    }
        private static void initializeChickens(Chicken[] chickens) {
        for (int i = 0; i < 1; i++) {
            chickens[i] = new Chicken();
        }
        }

        private static void saveChickens(Chicken[] chickens ) {
        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for chicken #" + (i + 1));
            Chicken chicken = new Chicken();

        System.out.print("ID: ");
        chicken.setId(inputScanner.nextInt());

        inputScanner.nextLine();

        System.out.print("Name: ");
        chicken.setName(inputScanner.nextLine());

        System.out.print("Color: ");
        chicken.setColor(inputScanner.nextLine());
        
        System.out.print("Enter birth date (yyyy-MM-dd): ");
        String dateString = inputScanner.nextLine();
        chicken.setBirthDate(LocalDate.parse(dateString));

        System.out.print("Is molting? (true/false): ");
        chicken.setMolting(inputScanner.nextBoolean());

        chickens[i] = chicken;
        System.out.println("Chicken created: " + chicken.getName() + ", Age: " + chicken.calculateAge());
        }
    }

    private static void readChickensandExport(Chicken[] chickens) {
        System.out.println("Details of Chickens:");
        for (int i = 0; i < 1; i++) {
            System.out.println("Chicken #" + (i + 1) + ": ID=" + chickens[i].getId() +
                    ", Name=" + chickens[i].getName() + ", Color=" + chickens[i].getColor() +
                    ", Birth Date=" + chickens[i].getBirthDate() +
                    ", Age=" + chickens[i].calculateAge() + ", Is molting? " + chickens[i].isMolting());
        } 
        System.out.println("Export Options:");
        System.out.println("1. Export to CSV");
        System.out.println("2. Export to JSON");
        System.out.print("Enter export option: ");
        Scanner exportScanner = new Scanner(System.in);
        int exportOption = exportScanner.nextInt();

        if (exportOption == 1) {
            exportToCSV(chickens);
        } else if (exportOption == 2) {
            exportToJSON(chickens);
        } else {
            System.out.println("Invalid export option.");
        }

       
        exportScanner.close();
    }
      private static void exportToCSV(Chicken[] chickens) {
        try (FileWriter writer = new FileWriter("chickens.csv")) {
            writer.append("ID,Name,Color,Birth Date,Age,Is Molting\n");
            for (Chicken chicken : chickens) {
                writer.append(chicken.getId() + "," + chicken.getName() + "," + chicken.getColor() + ","
                        + chicken.getBirthDate() + "," + chicken.calculateAge() + "," + chicken.isMolting() + "\n");
            }
            System.out.println("Data exported to 'chickens.csv' successfully.");
        } catch (IOException e) {
            System.out.println("Error exporting to CSV: " + e.getMessage());
        }   
    } 
       private static void exportToJSON(Chicken[] chickens) {
        String jsonFilePath = "chickens.json";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(jsonFilePath)) {
            gson.toJson(chickens, writer);
            System.out.println("Data exported to 'chickens.json' successfully.");
        } catch (IOException e) {
            System.out.println("Error exporting to JSON: " + e.getMessage());
        }
    }
} 
  

