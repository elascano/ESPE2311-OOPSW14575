package ec.edu.espe.chickenfarm.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.utils.ConsoleMenu;
import ec.edu.espe.chickenfarm.utils.MessageBox;

/**
 * @author Andrés Romero
 */
public class ChickenFarmSystem {
    private static ArrayList<Chicken> allChickens = new ArrayList<>();
    private static final Scanner consoleInput = new Scanner(System.in);
    private static final String SAVE_FILE_NAME = "chickens.csv";

    public static void main(String[] args) {
        allChickens = loadFromCSV(SAVE_FILE_NAME);
        List<String> menuOptions = Arrays.asList("Create new chicken", "Edit a chicken", "Delete a chicken", "Print saved chickens", "Exit program");
        ConsoleMenu menu = new ConsoleMenu("Main Menu", menuOptions);
        while (true) {
            menu.displayMenu();
            int choice = menu.getUserChoice();
            switch (choice) {
                case 1:
                    Chicken newChicken = createChicken();
                    allChickens.add(newChicken);
                    MessageBox.printMessage("Chicken created successfully!");
                    saveToCSV(SAVE_FILE_NAME, allChickens);
                    break;
                case 2:
                    editChicken();
                    saveToCSV(SAVE_FILE_NAME, allChickens);
                    break;
                case 3:
                    deleteChicken();
                    saveToCSV(SAVE_FILE_NAME, allChickens);
                    break;
                case 4:
                    for (Chicken chicken : allChickens) {
                        if (chicken != null) {
                            System.out.println(chicken);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    consoleInput.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
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
            otherChickenId = consoleInput.nextInt();
            consoleInput.nextLine();
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

        int otherChickenBirthYear;
        int otherChickenBirthMonth;
        int otherChickenBirthDay;

        while (true) {
            System.out.println("Please enter the chicken born date (YYYY-MM-DD): ");
            final String otherChickenBornDate = consoleInput.nextLine();
            try {
                final String[] dateParts = otherChickenBornDate.split("-");
                otherChickenBirthYear = Integer.parseInt(dateParts[0]);
                otherChickenBirthMonth = Integer.parseInt(dateParts[1]);
                otherChickenBirthDay = Integer.parseInt(dateParts[2]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid date format. Please try again.");
            }
        }

        System.out.println("Is this chicken molting? (true/false): ");
        final boolean otherChickenIsMolting = consoleInput.nextBoolean();
        consoleInput.nextLine();

        return new Chicken(otherChickenId, otherChickenName, otherChickenColor, otherChickenBirthYear, otherChickenBirthMonth, otherChickenBirthDay, otherChickenIsMolting);
    }

    private static void editChicken() {
        System.out.println("Please enter the chicken ID: ");
        final int otherChickenId = consoleInput.nextInt();
        consoleInput.nextLine();

        Chicken chickenToEdit = null;
        for (Chicken chicken : allChickens) {
            if (chicken != null && chicken.getId() == otherChickenId) {
                chickenToEdit = chicken;
                break;
            }
        }

        if (chickenToEdit == null) {
            System.out.println("There is no chicken with this ID.");
            return;
        }

        List<String> editMenuOptions = Arrays.asList("Edit name", "Edit color", "Edit age", "Edit molting status", "Save and Exit");
        ConsoleMenu editMenu = new ConsoleMenu("Select an option to edit", editMenuOptions);
        while (true) {
            editMenu.displayMenu();
            int choice = editMenu.getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the new chicken name: ");
                    final String otherChickenName = consoleInput.nextLine();
                    chickenToEdit.setName(otherChickenName);
                    MessageBox.printMessage("Chicken name updated successfully!");
                    break;
                case 2:
                    System.out.println("Please enter the new chicken color: ");
                    final String otherChickenColor = consoleInput.nextLine();
                    chickenToEdit.setColor(otherChickenColor);
                    MessageBox.printMessage("Chicken color updated successfully!");
                    break;
                case 3:
                    while (true) {
                        System.out.println("Please enter the new chicken born date (YYYY-MM-DD): ");
                        try {
                            final String otherChickenBornDate = consoleInput.nextLine();
                            final String[] dateParts = otherChickenBornDate.split("-");
                            final int otherChickenBirthYear = Integer.parseInt(dateParts[0]);
                            final int otherChickenBirthMonth = Integer.parseInt(dateParts[1]);
                            final int otherChickenBirthDay = Integer.parseInt(dateParts[2]);
                            chickenToEdit.setAge(otherChickenBirthYear, otherChickenBirthMonth, otherChickenBirthDay);
                            MessageBox.printMessage("Chicken age updated successfully!");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid date format. Please try again.");
                        }
                    }
                    
                case 4:
                    System.out.println("Is this chicken molting? (true/false): ");
                    final boolean otherChickenIsMolting = consoleInput.nextBoolean();
                    consoleInput.nextLine();
                    chickenToEdit.setMolting(otherChickenIsMolting);
                    MessageBox.printMessage("Chicken molting status updated successfully!");
                    break;
                case 5:
                    System.out.println("Saving changes...");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void deleteChicken() {
        System.out.println("Please enter the chicken ID: ");
        final int otherChickenId = consoleInput.nextInt();
        consoleInput.nextLine();

        Chicken chickenToDelete = null;
        for (Chicken chicken : allChickens) {
            if (chicken != null && chicken.getId() == otherChickenId) {
                chickenToDelete = chicken;
                break;
            }
        }

        if (chickenToDelete == null) {
            System.out.println("There is no chicken with this ID.");
            return;
        }

        List<String> deleteMenuOptions = Arrays.asList("Delete chicken", "Cancel");
        ConsoleMenu deleteMenu = new ConsoleMenu("Are you sure you want to delete this chicken?", deleteMenuOptions);
        deleteMenu.displayMenu();
        int choice = deleteMenu.getUserChoice();

        switch (choice) {
            case 1:
                allChickens.remove(chickenToDelete);
                MessageBox.printMessage("Chicken deleted successfully!");
                break;
            default:
                break;
        }
    }

    private static void saveToCSV(String fileName, ArrayList<Chicken> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Chicken chicken : data) {
                bw.write(chicken.toCSVLine());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Chicken> loadFromCSV(String fileName) {
        ArrayList<Chicken> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                final int id = Integer.parseInt(values[0]);
                final String name = values[1];
                final String color = values[2];
                final int birthYear = Integer.parseInt(values[3]);
                final int birthMonth = Integer.parseInt(values[4]);
                final int birthDay = Integer.parseInt(values[5]);
                final boolean isMolting = Boolean.parseBoolean(values[6]);
                Chicken newChicken = new Chicken(id, name, color, birthYear, birthMonth, birthDay, isMolting);
                data.add(newChicken);
            }
        } catch (IOException e) {
        }
        return data;
    }

    private static void consolePause() {
        System.out.println("\nPress enter to continue...");
        consoleInput.nextLine();
        System.out.print("\033\143"); // Clear console
    }
}
