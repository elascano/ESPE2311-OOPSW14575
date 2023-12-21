package ec.edu.espe.trucks.util;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    private final List<String> options;
    private final String title;
    private final Scanner scanner;

    public ConsoleMenu(String title, List<String> options) {
        this.title = title;
        this.options = options;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n" + title);
        System.out.println("=================================");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("=================================\n");
    }

    public int getUserChoice() { 
        int choice = -1;
        while (choice < 1 || choice > options.size()) {
            System.out.print("Enter your choice (1-" + options.size() + "): ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > options.size()) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return choice;
    }
}
