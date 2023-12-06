package ec.edu.espe.chickenfFarm.view;

import ec.edu.espe.chickenfFarm.model.Chicken;
import ec.edu.espe.chickenFarm.utilities.AgeCalculator;
import ec.edu.espe.chickenFarm.utilities.FilesJson;  
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio Revilla 
 */

public class ChickenFarmSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Chicken> chickenList = FilesJson.loadChickensFromJSON();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new chicken");
            System.out.println("2. Print all chickens");
            System.out.println("3. Save chickens to JSON");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    addNewChicken(scan, chickenList);
                    break;
                case 2:
                    printAllChickens(chickenList);
                    break;
                case 3:
                    FilesJson.saveChickensToJSON(chickenList);
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
                return true; 
            }
        }
        return false; 
    }

    private static void printAllChickens(ArrayList<Chicken> chickenList) {
    System.out.println("List of Chickens:");
    for (Chicken chicken : chickenList) {
        System.out.println("Chicken: " + chicken.getId() +
                ", " + chicken.getName() +
                ", " + chicken.getColor() +
                ", " + chicken.getAge() +
                ", " + chicken.isIsMolting());
    }
    }
}