
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ChickenFarmSystem {
    public static void main(String[] args) {
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken[] chickens = new Chicken[5];
        int option;
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Chicken> chickenList = new ArrayList<>();
        System.out.println("Hello Chickens from the Simulator");

        do {
            System.out.println("Welcome to the Chicken Farm System");
            System.out.println("1. Save a chicken");
            System.out.println("2. Print chickens");
            System.out.println("3. Save and exit");
            System.out.println("What do you want to do");
            System.out.println("Enter option");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1 -> {
                    savechickens(chickens);
                    break;
                }
                case 2 -> {
                    readChickens(chickens);
                    break;
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    break;
                }
                default -> throw new AssertionError();
            }
        } while (option != 3);
        scan.close();
    }
   
    
    public static void savechickens(Chicken[] chickens){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Chicken chicken = new Chicken();
            System.out.println("Create a chicken #"+(i+1));
            chicken.setId(i+1);
            System.out.println("Id generated: "+(i+1));
            
            System.out.println("Enter Name");
            chicken.setName(scan.nextLine());
            
            System.out.println("Enter color");
            chicken.setColor(scan.nextLine());
            
            System.out.println("Enter bithday (YYYY-MM-DD)");
            String dateString=scan.nextLine();
            chicken.setBirthday(LocalDate.parse(dateString));
            
            System.out.println("Is molting (True/False)");
            chicken.setIsMolting(scan.nextBoolean());
            scan.nextLine();
            
            chickens[i]=chicken;
            System.out.println("Chicken created: " + chicken.getName() + ", Age: " + chicken.calculateAgeYear());
            
        }
    }
    
    public static void readChickens(Chicken[] chickens){
        System.out.println("Details of Chickens:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Chicken #" + (i + 1) + ": ID=" + chickens[i].getId() +
                    ", Name=" +chickens[i].getName() + ", Color=" + chickens[i].getColor() +
                    ", Birth Day=" + chickens[i].getBirthday() +
                    ", Age=" + chickens[i].calculateAgeYear() + ", Is molting? " + chickens[i].isIsMolting());
        }
        exportToCSV(chickens);
    }

    public static void exportToCSV(Chicken[] chickens){
        try (FileWriter writer = new FileWriter("chickens.csv")) {
            writer.append("ID,Name,Color,Birthday,Age,Is Molting\n");
            for (Chicken chicken : chickens) {
                writer.append(chicken.getId() + "," + chicken.getName() + "," + chicken.getColor() + ","
                        + chicken.getBirthday() + "," + chicken.calculateAgeYear() + "," + chicken.isIsMolting() + "\n");
            }
            System.out.println("Data exported to 'chickens.csv' successfully.");
        } catch (IOException e) {
            System.out.println("Error exporting to CSV: " + e.getMessage());
        }
    }
}