
package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Poop;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduag, honeybadgers,CCEO-ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        // Create an ArrayList to store chickens
        ArrayList<Chicken> chickenList = new ArrayList<>();

        // Create instances of other classes
        Poop poop = new Poop();
        Egg egg = new Egg(1);

        Scanner scanner = new Scanner(System.in);
        boolean addMoreChickens = true;

        while (addMoreChickens) {
            // Use a loop to input data for each chicken
            System.out.println("Enter data for the chicken:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the pending new line

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Color: ");
            String color = scanner.nextLine();

            System.out.print("Birth Year: ");
            int birthYear = scanner.nextInt();

            System.out.print("Birth Month: ");
            int birthMonth = scanner.nextInt();

            System.out.print("Birth Day: ");
            int birthDay = scanner.nextInt();

            System.out.print("Is Molting? (true/false): ");
            boolean isMolting = scanner.nextBoolean();

            // Create the Chicken object with the entered data
            Chicken chicken = createChicken(id, name, color, birthYear, birthMonth, birthDay, isMolting);
            chickenList.add(chicken);

            // Ask if more chickens should be entered
            System.out.print("Do you want to add more chickens? (true/false): ");
            addMoreChickens = scanner.nextBoolean();
        }

        // Print information
        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is --> Eduardo Garcia");
        System.out.println("Poop -->" + poop);
        System.out.println("Egg -->" + egg);

        // Print information for each chicken
        for (Chicken chicken : chickenList) {
            System.out.println("Chicken -->" + chicken);
        }

        // Save data to a CSV file
        try (PrintWriter writer = new PrintWriter(new FileWriter("chickens.csv"))) {
            for (Chicken chicken : chickenList) {
                writer.println(chicken.getId() + "," + chicken.getName() + "," + chicken.getColor() + "," +
                        chicken.getAge() + "," + chicken.isIsMolting());
            }
            System.out.println("Data saved in chickens.csv");
        } catch (IOException e) {
            System.err.println("Error saving data to CSV file: " + e.getMessage());
        }
    }

    private static Chicken createChicken(int id, String name, String color, int birthYear, int birthMonth, int birthDay, boolean isMolting) {
        // Calculate the age of the chicken based on the birthdate and the current date
        int currentYear = 2023; // Assuming the current year is 2023
        int ageInMonths = (currentYear - birthYear) * 12 + (birthMonth - 1);
        
        // Adjust the age based on the birth day
        if (birthDay > getCurrentDayOfMonth()) {
            ageInMonths--;
        }

        return new Chicken(id, name, color, ageInMonths, isMolting);
    }

    private static int getCurrentDayOfMonth() {
        // Simulate getting the current day of the month (for demo purposes)
        return 27; // Change this to the actual current day if needed
    }
}