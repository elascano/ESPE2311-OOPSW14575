package ec.edu.espe.smartwatches.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleUtil {
    public static void consolePause() {
        System.out.println("\nPress enter to continue...");
        try {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            stdin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        clearConsole();
    }

    public static void clearConsole() {
        System.out.print("\033\143");
    }
}