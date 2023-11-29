package ec.edu.espe.chickenfFarm.view;

import ec.edu.espe.chickenfFarm.model.Chicken;
import ec.edu.espe.chickenfFarm.model.Egg;
import ec.edu.espe.chickenfFarm.model.Poop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio Revilla 
 */

/** 
public class ChickenFarmSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Poop poop = new Poop();
        Egg egg =  new Egg();
        Chicken[] chicken = new Chicken[5];
        
        for(int i=0;i<5;i++){
            
        System.out.println("Enter the chicken id");
        id=scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the name of the chicken");
        name=scan.nextLine();
        
        System.out.println("Enter the color of the chicken");
        color=scan.nextLine();
        
        System.out.println("Enter the age of the chikend");
        age=scan.nextInt();
        scan.nextLine();
        
        System.out.println("The chicken is moltinh? ");
        isMolting=scan.hasNextBoolean();
        scan.nextLine();
        
        chicken[i] = new Chicken(id,name,color,age,isMolting);
        System.out.println("Chicken number -> " + (i+1) + chicken[i]);
            
        }
    }
} */

public class ChickenFarmSystem {
    private static final String CSV_FILE_PATH = "chickens.csv";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Chicken> chickenList = new ArrayList<>();

        // Cargar pollos desde el archivo CSV si existe
        if (new File(CSV_FILE_PATH).exists()) {
            chickenList = loadChickensFromCSV();
            System.out.println("Chickens loaded from CSV.");
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new chicken");
            System.out.println("2. Print all chickens");
            System.out.println("3. Save chickens to CSV");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scan.nextInt();
            scan.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addNewChicken(scan, chickenList);
                    break;
                case 2:
                    printAllChickens(chickenList);
                    break;
                case 3:
                    saveChickensToCSV(chickenList);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addNewChicken(Scanner scan, ArrayList<Chicken> chickenList) {
        System.out.println("Enter the chicken id");
        int id = scan.nextInt();
        scan.nextLine();

        // Validar si el ID ya existe
        if (isIdExists(chickenList, id)) {
            System.out.println("Error: Chicken with the same ID already exists. Please choose a different ID.");
            return;
        }

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
        System.out.println("Chicken added: " + newChicken);
    }

    private static boolean isIdExists(ArrayList<Chicken> chickenList, int id) {
        for (Chicken chicken : chickenList) {
            if (chicken.getId() == id) {
                return true; // El ID ya existe
            }
        }
        return false; // El ID no existe
    }

    private static void printAllChickens(ArrayList<Chicken> chickenList) {
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

        // Ajustar los valores negativos de meses y días
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

    private static void saveChickensToCSV(ArrayList<Chicken> chickenList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH))) {
            // Escribir el encabezado
            writer.write("ID,Name,Color,BirthDate,IsMolting\n");

            // Escribir los datos de los pollos
            for (Chicken chicken : chickenList) {
                writer.write(String.format("%d,%s,%s,%s,%b\n",
                        chicken.getId(),
                        chicken.getName(),
                        chicken.getColor(),
                        chicken.getBirthDate(),
                        chicken.isMolting()));
            }

            System.out.println("Chickens saved to CSV successfully.");
        } catch (IOException e) {
            System.err.println("Error while saving chickens to CSV: " + e.getMessage());
        }
    }

    private static ArrayList<Chicken> loadChickensFromCSV() {
        ArrayList<Chicken> loadedChickens = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(CSV_FILE_PATH))) {
            scanner.nextLine(); // Consumir la primera línea (encabezado)

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String color = parts[2];
                LocalDate birthDate = LocalDate.parse(parts[3]);
                boolean isMolting = Boolean.parseBoolean(parts[4]);

                Chicken loadedChicken = new Chicken(id, name, color, birthDate, isMolting);
                loadedChickens.add(loadedChicken);
            }

            System.out.println("Chickens loaded from CSV successfully.");
        } catch (IOException e) {
            System.err.println("Error while loading chickens from CSV: " + e.getMessage());
        }

        return loadedChickens;
    }
}

