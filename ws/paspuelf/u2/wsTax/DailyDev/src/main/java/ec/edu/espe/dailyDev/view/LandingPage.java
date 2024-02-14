package ec.edu.espe.dailyDev.view;

import ec.edu.espe.dailyDev.model.Administrator;
import ec.edu.espe.dailyDev.model.Developer;
import ec.edu.espe.dailyDev.model.Meeting;
import ec.edu.espe.dailyDev.model.Task;
import ec.edu.espe.dailyDev.model.User;
import ec.edu.espe.dailyDev.utils.GPTHandler;
//import ec.edu.espe.dailyDev.utils.GPTHandler;
import ec.edu.espe.dailyDev.utils.MenuUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author CodingNinjas
 */
public class LandingPage {

    private static final Scanner scanner = new Scanner(System.in);

    public static void showLandingPage() throws Exception {
        int option;

        System.out.println("Daily Dev System\n");
        System.out.println("Select one option please\n");
        System.out.println("1. Login to an existing account\n2. Create a new account");

        do {
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 1 && option != 2);

        for (int i = 0; i < 50; i++) {
            System.out.print("\n\n\n");
        }

        switch (option) {
            case 1 ->
                showLogin();
            case 2 ->
                showRegistration();
            default ->
                throw new AssertionError();
        }
    }

    private static void showLogin() throws Exception {
        User user = null;
        int option;

        do {
            System.out.println("Select your user type:\n");
            System.out.println("1. Developer\n2. Administrator");
            System.out.println("3. Back to top");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea pendiente después de nextInt

            if (option == 3) {
                try {
                    showLandingPage();
                } catch (Exception e) {
                    System.err.println("Error displaying Landing Page: " + e.getMessage());
                }
                return; // Salir del método showLogin si el usuario decide regresar al menú principal
            }

        } while (option != 1 && option != 2);

        do {
            System.out.println("Login\n");

            System.out.println("Username:\n");
            String username = scanner.nextLine();

            System.out.println("Password:\n");
            String password = scanner.nextLine();

            try {
                user = User.login(username, password, option == 1 ? "dev" : "admin");
                if (user != null) {
                    System.out.println("Login successful");
                    showMainMenu(); // Aquí deberías tener una función que muestre el menú principal para el usuario
                }
            } catch (User.InvalidCredentialsException e) {
                System.err.println(e.getMessage());
                System.out.println("Invalid username or password. Please try again.");
            }
        } while (user == null);
    }

    private static void showRegistration() {
        int option;

        System.out.println("Registration Menu\n");
        System.out.println("1. Register as an administrator");
        System.out.println("2. Register as a developer");
        System.out.println("3. Back to top\n");

        do {
            option = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea pendiente después de nextInt

            switch (option) {
                case 1:
                    showAdminRegistration();
                    break;
                case 2:
                    showDevRegistration();
                    break;
                case 3:
                try {
                    showLandingPage();
                } catch (Exception e) {
                    System.err.println("Error displaying Landing Page: " + e.getMessage());
                }
                return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 1 && option != 2);
    }

    private static void showAdminRegistration() {
        System.out.println("Username:\n");
        String username = scanner.nextLine();

        System.out.println("Password:\n");
        String password = scanner.nextLine();

        try {
            Administrator admin = Administrator.registerAdmin(username, password);
            if (admin != null) {
                System.out.println("Successful registration");
                showLogin();  // Después de registrar, permite iniciar sesión directamente
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void showDevRegistration() {
        System.out.println("Enter your organization code (your administrator should give it to you):\n");
        String orgCode = scanner.nextLine();

        System.out.println("Username:\n");
        String username = scanner.nextLine();

        System.out.println("Password:\n");
        String password = scanner.nextLine();

        try {
            Developer dev = Developer.registerDev(username, password, UUID.fromString(orgCode));
            if (dev != null) {
                System.out.println("Successful registration");
                showLogin();  // Después de registrar, permite iniciar sesión directamente
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void showMainMenu() throws Exception {
        int optionMain;

        do {
            System.out.println("\nMain Menu");

            ArrayList<Task> tasks = Task.getTasksFromFile("./db/tasks.json");
            List<Task> userTasks = tasks.stream()
                    .filter(task -> task.getUserId().equals(User.getCurrentUser().getId()))
                    .collect(Collectors.toList());

            System.out.println("\nSelect one option:\n");
            System.out.println("1. Task\n2. Meeting\n3. Create daily message\n4. Logout");

            optionMain = scanner.nextInt();
            scanner.nextLine();

            switch (optionMain) {
                case 1 ->
                    taskMenu();
                case 2 ->
                    meetingMenu();
                case 3 ->
                    System.out.println(GPTHandler.getDailyMessage(userTasks));
                case 4 ->
                    showLandingPage();
                default ->
                    System.out.println("Invalid option. Please try again.");
            }
        } while (optionMain != 3);
    }

    private static void taskMenu() {
        String[] taskOptions = {
            "Create Task",
            "Show Tasks",
            "Show today's pending tasks",
            "Back to Main Menu"
        };

        int optionTask;

        do {
            optionTask = MenuUtils.getUserOption("Task", taskOptions);

            switch (optionTask) {
                case 1 ->
                    Task.create();
                case 2 ->
                    Task.show();
                case 3 ->
                    Task.showTasksTodays();
                case 4 ->
                    MenuUtils.backToMainMenu();
                default ->
                    System.out.println("Invalid option. Please try again.");
            }
        } while (optionTask != 4);
    }

    public static void meetingMenu() {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    Meeting.create();
                    break;
                case 2:
                    Meeting.show();
                    break;
                case 3:
                    Meeting.update();
                    break;
                case 4:
                    Meeting.delete();
                    break;
                case 5:
                    MenuUtils.backToMainMenu();
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Main Menu");
        System.out.println("1. Create a meeting");
        System.out.println("2. Show meetings");
        System.out.println("3. Update a meeting");
        System.out.println("4. Delete a meeting");
        System.out.println("5. Exit");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.print("Enter your choice: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
