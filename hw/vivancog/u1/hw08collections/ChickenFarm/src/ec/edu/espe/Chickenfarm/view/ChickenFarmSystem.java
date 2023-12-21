
package ec.edu.espe.Chickenfarm.view;

import ec.edu.espe.Chickenfarm.model.Chicken;
import ec.edu.espe.Chickenfarm.model.Egg;
import ec.edu.espe.Chickenfarm.model.Poop;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Gabriel Vivanco - Bit Coderz - DCCO ESPE
 */
public class ChickenFarmSystem {
    private static final String CSV_FILE_PATH = "chickens.csv";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Chicken> chickenList = new ArrayList<>();

        if (new File(CSV_FILE_PATH).exists()) {
            chickenList = loadChickensFromCSV();
            System.out.println("Chickens loaded from CSV.");
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add chicken");
            System.out.println("2. Print chickens");
            System.out.println("3. Save chickens to CSV");
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
                    saveChickensToCSV(chickenList);
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

    private static void saveChickensToCSV(ArrayList<Chicken> chickenList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH))) {
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
            scanner.nextLine();

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
