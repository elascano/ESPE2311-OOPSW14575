package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
//import ec.edu.espe.chickenfarm.model.Egg;
//import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Sagnay
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Poop poop = new Poop();
        //Egg egg = new Egg();
        
        Chicken chickens[] = new Chicken[30];
        int chickenCount = 0;
        
         while (true) {
            System.out.println("\nChicken Farm System Menu:");
            System.out.println("1. Add a chicken");
            System.out.println("2. Print chickens");
            System.out.println("3. Save to CSV");
            System.out.println("4. Save to JSON");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    
                    if (chickenCount < 30) {
                        chickens[chickenCount++] = addChicken();
                        System.out.println("Chicken added successfully");
                    } else {
                        System.out.println("Cannot add more chickens. Limit reached");
                    }
                    break;
                case 2:
                    printChickens(chickens, chickenCount);
                    
                    break;
                case 3:
                    saveToCSV(chickens, chickenCount);
                    break;
                case 4:
                    saveToJson(chickens, chickenCount);
                    break;
                case 5:
                    System.out.println("Exiting Chicken Farm System. Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option");
            }
        }
    }

    public static Chicken addChicken() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the chicken id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of the chicken: ");
        String name = sc.nextLine();
        System.out.print("Enter the color of the chicken: ");
        String color = sc.nextLine();
        System.out.print("Enter the year of birth of the chicken: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the month of birth of the chicken: ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the day of birth of the chicken: ");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.print("Is the chicken molting? (true or false): ");
        boolean isMolting = sc.nextBoolean();

        LocalDate currentDate = LocalDate.now();
        LocalDate chickenBirthDate = LocalDate.of(year, month, day);

        int years = currentDate.getYear() - chickenBirthDate.getYear();
        int months = currentDate.getMonthValue() - chickenBirthDate.getMonthValue();
        int days = currentDate.getDayOfMonth() - chickenBirthDate.getDayOfMonth();

        if (days < 0) {
            months--;
            days += 30;
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        return new Chicken(id, name, color, days, months, years, isMolting);
    }
    
    public static void printChickens(Chicken[] chickens, int chickenCount) {
    System.out.println("\nList of Chickens:");
    for (int i = 0; i < chickenCount; i++) {
        System.out.println("Chicken " + (i + 1) + ":");
        System.out.println("Id: " + chickens[i].getId());
        System.out.println("Name: " + chickens[i].getName());
        System.out.println("Color: " + chickens[i].getColor());
        System.out.print("Age: " + chickens[i].getDays() + " days ");
        System.out.print(+ chickens[i].getMonths() + " months ");
        System.out.println(+ chickens[i].getYears() + " years");
        System.out.println("Is Molting: " + chickens[i].isIsMolting());
    }
}

    public static void saveToCSV(Chicken[] chickens, int chickenCount) {
        try (FileWriter writer = new FileWriter("chickens.csv")) {
            writer.append("Id,Name,Color,Day,Month,Year,IsMolting\n");
            for (int i = 0; i < chickenCount; i++) {
                writer.append(chickens[i].toCSVString() + "\n");
            }
            System.out.println("Chickens saved to CSV successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
    
    public static void saveToJson(Chicken[] chickens, int chickenCount) {
        Gson gson = new Gson();
        List<Chicken> chickenList = new ArrayList<>();

        for (int i = 0; i < chickenCount; i++) {
            chickenList.add(chickens[i]);
        }

        try (FileWriter writer = new FileWriter("chickens.json")) {
            gson.toJson(chickenList, writer);
            System.out.println("Chickens saved to JSON successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to JSON file: " + e.getMessage());
        }
    }

}
