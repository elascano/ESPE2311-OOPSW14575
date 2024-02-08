package ec.edu.espe.question33.utils;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Validator {

    private static Scanner scanner = new Scanner(System.in);

    public static int validateIntInput(String prompt) {
        int input = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(prompt);
                String inputStr = scanner.nextLine();
                input = Integer.parseInt(inputStr);
                if (input > 0) {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } while (!validInput);

        return input;
    }

    public static double validateDoubleInput(String prompt) {
        double input = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(prompt);
                String inputStr = scanner.nextLine();
                input = Double.parseDouble(inputStr);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!validInput);

        return input;
    }

    public static float validateFloatInput(String prompt) {
        float input = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(prompt);
                String inputStr = scanner.nextLine();
                input = Float.parseFloat(inputStr);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!validInput);

        return input;
    }

    public static String validateStringInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();

                if (!input.isEmpty() && input.matches("[a-zA-Z]+")) {
                    return input;
                } else {
                    System.out.println("Invalid input, please enter a non-empty string with only letters.");
                }
            } catch (Exception e) {
                System.out.print("Invalid entry, try again: ");
            }
        }
    }

    public static String validateStringInputWithSpaces(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();

                if (!input.isEmpty() && input.matches("[a-zA-Z\\s]+")) {
                    return input;
                } else {
                    System.out.println("Invalid input, please enter letters and spaces only.");
                }
            } catch (Exception e) {
                System.out.print("Invalid entry, try again: ");
            }
        }
    }

    public static boolean getYNOption(String prompt) {
        System.out.println(prompt);
        String option = "";
        while (true) {
            option = scanner.nextLine();
            if (option.equalsIgnoreCase("y")) {
                return true;
            } else if (option.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.print("Invalid option, try again: ");
            }
        }
    }

    public static String noValidation(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }

}
