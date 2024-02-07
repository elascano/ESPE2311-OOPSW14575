package ec.edu.espe.mongoconnection.util;

import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String message) {
        String input;
        while (true) {
            System.out.println(message);
            input = scanner.nextLine();
            String strippedInput = input.strip();
            if (strippedInput.equals("") || strippedInput.equals("\n")) {
                System.out.println("You must enter a valid value");
                continue;
            }
            break;
        }
        return input;
    }

    public static int getInt(String message) {
        int intInput;
        String input;
        while (true) {
            input = getString(message);
            try {
                intInput = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Your input is not a valid integer");
            }
        }
        return intInput;
    }

    public static int getInt(String message, int min) {
        int intInput;
        String input;
        while (true) {
            input = getString(message);
            try {
                intInput = Integer.parseInt(input);
                if (intInput < min) {
                    System.out.println("Only values greater than " + min + " are allowed");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Your input is not a valid integer");
            }
        }
        return intInput;
    }
    
    public static float getFloat(String message) {
        float floatInput;
        String input;
        while (true) {
            input = getString(message);
            try {
                floatInput = Float.parseFloat(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Your input is not a valid float");
            }
        }
        return floatInput;
    }
}
