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
        ArrayList<Chicken> chickensList = utility.readFile("chickens.json");
        menu(chickensList);
        
        

    }
    
    public static void menu(ArrayList<Chicken> chickensList){
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
                    displayChickensToCsv();
                    scanner.nextLine();
                    break;
                case 3:
                    displayChickensToJson(chickensList);
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
        
        System.out.println("Would you like to save your chicken? Yes(1) or no(2)");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Do you want to save in Csv(1) or Json(2) files?");
                int optionFile = scanner.nextInt();
                switch (optionFile) {
                    case 1:
                        saveChickensToCSV(createChickens());
                        break;
                    case 2:
                        Utility utility = new Utility();
                        utility.writeFile("chickens.json", chickenList);
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
    
    public static void displayChickensToJson(ArrayList<Chicken> chickensList){
        int i = 1;
        
        for(Chicken currentChicken : chickensList) {
            System.out.print("\nChicken [" + i + "]: " + currentChicken);
            i++;
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
    
}
    
    
    
    