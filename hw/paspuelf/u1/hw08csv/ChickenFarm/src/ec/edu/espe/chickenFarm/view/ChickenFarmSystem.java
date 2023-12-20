package ec.edu.espe.chickenFarm.view;

import ec.edu.espe.chickenFarm.model.Chicken;
import ec.edu.espe.chickenFarm.model.Egg;
import ec.edu.espe.chickenFarm.model.Poop;
import ec.edu.espe.chickenFarm.utils.Reader;
import ec.edu.espe.chickenFarm.utils.Writer;
import java.util.Scanner;

/**
 *
 * @author Olivier Paspuel
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {
        Poop poop = new Poop();
        Egg egg = new Egg();
        // Reader.writeFile(); 
//        Chicken chicken = new Chicken(1, "Lucy", "Black", true, 1970, 11, 28);
        Chicken chickens[] = new Chicken[5];
//        System.out.println("Welcome to the chicken farm system\n");
//        System.out.println("This is the first chicken, created from a constructor: " + chicken);
//        System.out.println(chicken.getAge());
//        System.out.println("\nEnter the data of the first chicken\n");
//        Chicken chicken1 = createChicken();
//        System.out.println("This is the second chicken, this one is crated with user input: " + chicken1);
//        System.out.println("Now lets create an array of chickens\n");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Chicken number " + (i + 1));
//            chickens[i] = createChicken();
//        }

        for (int i = 0; i < 5; i++) {
            chickens[i] = new Chicken(i, "olivier" + i, "white", false, 2004, 2004, 8);
        }

        System.out.println("\nList of chickens created:\n");
        for (int i = 0; i < chickens.length; i++) {

            System.out.println("\nChicken number " + (i + 1));
            System.out.println("\n" + chickens[i]);
        }

        Writer.writeFile(chickens);
        Reader.readFile();

    }

    public static Chicken createChicken() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chicken's id:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Chicken's name:");
        String name = scanner.nextLine();

        System.out.println("Chicken's color:");
        String color = scanner.nextLine();

        System.out.println("Is the chicken molting?:");
        boolean isMolting = scanner.nextBoolean();

        System.out.println("Enter its birth year:");
        int year = scanner.nextInt();

        System.out.println("Enter its birth month (1-12):");
        int month = scanner.nextInt();

        System.out.println("Enter its birth day:");
        int day = scanner.nextInt();

        return new Chicken(id, name, color, isMolting, year, month, day);
    }
}
