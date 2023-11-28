package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

import java.util.Scanner;

/**
 * @author Andrés Romero
 */
public class ChickenFarmSystem {
    private static Chicken[] allChickens = new Chicken[8];
    private static int allChickensIndex = 0;
    private static final Scanner consoleInput = new Scanner(System.in);
    public static void main(String[] args) {
        // Exercises in class
        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "White&Black", 2, true);
        allChickens[allChickensIndex] = chicken;
        allChickensIndex++;

        System.out.println("Hello chickens from the simulator!");
        System.out.println("My name is --> Andrés Romero");
        System.out.println("Poop: " + poop);
        System.out.println("Egg: " + egg);
        System.out.println("Chicken: " + chicken.toString());
        System.out.println();

        // Exercise 1: Create chicken2
        System.out.println("________ Homework exercise 1: ________");
        exercise1();
        consolePause();

        // Exercise 2: Create anotherChicken based on user's input
        System.out.println("________ Homework exercise 2: ________");
        exercise2();
        consolePause();

        // Exercise 3: Create 5 chickens based on user's input
        System.out.println("________ Homework exercise 3: ________");
        exercise3();
        consolePause();

        consoleInput.close();
    }

    private static void exercise1() {
        Chicken chicken2 = new Chicken(2, "Mary", "White", 3, false);
        System.out.println("Chicken 2: " + chicken2.toString());
        allChickens[allChickensIndex] = chicken2;
        allChickensIndex++;
    }

    private static void exercise2() {
        Chicken otherChicken = createChicken();
        System.out.println("Other chicken: " + otherChicken.toString());
        allChickens[allChickensIndex] = otherChicken;
        allChickensIndex++;
    }

    private static void exercise3() {
        Chicken[] chickens = new Chicken[5];


        for (int i = 0; i < chickens.length; i++) {
            System.out.println("[CHICKEN #" + (i+1) + "]");

            Chicken newChicken = createChicken();

            allChickens[allChickensIndex] = newChicken;
            allChickensIndex++;
            chickens[i] = newChicken;

            System.out.println();
        }

        System.out.println("These are the " + chickens.length + " chickens you entered: ");
        for (Chicken chicken : chickens) {
            System.out.println(chicken.toString());
        }
    }

    private static boolean isIdFree(int id) {
        for (Chicken chicken : allChickens) {
            if (chicken != null && chicken.getId() == id) {
                return false;
            }
        }
        return true;
    }

    private static Chicken createChicken() {
        int otherChickenId;
        while (true) {
            System.out.println("Please enter the chicken ID: ");
            otherChickenId = consoleInput.nextInt(); consoleInput.nextLine();
            if (isIdFree(otherChickenId)) {
                break;
            } else {
                System.out.println("This chicken ID is not available.");
            }
        }

        System.out.println("Please enter the chicken name: ");
        final String otherChickenName = consoleInput.nextLine();

        System.out.println("Please enter the chicken color: ");
        final String otherChickenColor = consoleInput.nextLine();

        System.out.println("Please enter the chicken age: ");
        final int otherChickenAge = consoleInput.nextInt(); consoleInput.nextLine();

        System.out.println("Is this chicken molting? (true/false): ");
        final boolean otherChickenIsMolting = consoleInput.nextBoolean(); consoleInput.nextLine();

        return new Chicken(otherChickenId, otherChickenName, otherChickenColor, otherChickenAge, otherChickenIsMolting);
    }

    private static void consolePause() {
        System.out.println("\nPress enter to continue...");
        consoleInput.nextLine();
        System.out.print("\033\143"); // Clear console
    }
}
