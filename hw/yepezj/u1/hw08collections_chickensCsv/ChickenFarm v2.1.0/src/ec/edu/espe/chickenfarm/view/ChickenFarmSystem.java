package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import ec.edu.espe.chickenfarm.utility.Utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class ChickenFarmSystem {

    public static void main(String[] args){
        Poop poop = new Poop();
        Egg egg = new Egg();
        Utility utility = new Utility();
        ArrayList<Chicken> chickensList = utility.readFileJson("chickens.json");
        menu(chickensList);
        
        

    }
    
    public static void menu(ArrayList<Chicken> chickensList){
        Utility utility = new Utility();
        int option;
        do{
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
                    chickensList.add(createChickens());
                    saveChickenInFile(chickensList);
                    break;
                case 2:
                    utility.displayElementsFile(chickensList);
                    scanner.nextLine();
                    break;
                case 3:
                    utility.displayElementsFile(chickensList);
                    scanner.nextLine();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(option != 4);
    }
    
    public static Chicken createChickens(){
        Scanner scanner = new Scanner(System.in);
        Utility utility = new Utility();
        Chicken chicken;

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
        int age = utility.calculateYears(day, month, year);
        
        return chicken = new Chicken(id, name, color, age, isLayingEggs, day, month, year);
        
        }
    
    public static void saveChickenInFile(ArrayList<Chicken> chickenList){
        Scanner scanner = new Scanner(System.in);
        Utility utility = new Utility();
        
        System.out.println("Would you like to save your chicken? Yes(1) or no(2)");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Do you want to save in Csv(1) or Json(2) files?");
                int optionFile = scanner.nextInt();
                switch (optionFile) {
                    case 1:
                        utility.saveCSVFile(createChickens(),"Chickens.csv");
                        break;
                    case 2:
                        utility.writeFileJson("chickens.json", chickenList);
                        System.out.println("Chicken saved successfully.");
                        
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
    
    
}
    
    
    
    