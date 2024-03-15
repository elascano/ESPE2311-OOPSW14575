package ec.edu.espe.dailyDev.utils;

import java.util.Scanner;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class MenuUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getUserOption(String entityName, String[] options) {
        System.out.println("\n" + entityName + " Menu\n");

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Select an option: ");
        return scanner.nextInt();
    }

    public static void backToMainMenu() {
        System.out.println("Returning to Main Menu...");
    }
}