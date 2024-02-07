package ec.edu.espe.foodandrollorder.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Manager extends User {

    private String managerName;
    private String managerEmail;
    private static Menu menuOfRestaurant;

    @Override
    public String toString() {
        return "Manager{" + "name=" + getManagerName() + ", email=" + getManagerEmail() + "}";
    }

    public Manager(String managerName, String managerEmail, String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.menuOfRestaurant = new Menu();
    }
    
    public Manager(String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.menuOfRestaurant = new Menu();
    }

    
    public static void managerOptions() {
        Manager manager = new Manager("userId", "password", "loginStatus", new Date());
        Menu menu = new Menu();
        int option = 0;
        while (option != 5) {
            printManagerOptions();
            option = validateMenuManager(option);
            switch (option) {
                case 1:
                    //manager.addNewPlateOptions();
                    menu.createDishMongoDB();
                    break;
                case 2:
                   // removePlateOptions(manager);
                    menu.deleteDishMongoDB();
                    break;
                case 3:
                    menu.updateDishMongoDB();
                    /**
                    manager.updatePrices(manager);
                    menuOfRestaurant.saveMenuAsJson("menu.json");
                    Menu menuFromJson = manager.getMenuOfRestaurant().readMenuFromJson("menu.json");
                    if (menuFromJson != null) {
                        System.out.println("=======================================================================================");
                        menuFromJson.displayFullMenu();
                    } else {
                        System.out.println("Error reading JSON file or no content found.");
                    }
                    */
                    break;
                case 4:
                    menu.readMongoDBDataBaseAndDisplayTable();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public void addNewPlateOptions() {

        int option = 0;
        while (option != 3) {
            printAddNewPlateOptions();
            option = validateOptionMenu(option);
            switch (option) {
                case 1:
                    addTallarinPlate();
                    break;
                case 2:
                    addMariscosPlate();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public static void removePlateOptions(Manager manager) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
         do{
            printremovePlateOptions();
            option = validateOptionSubMenu(option);
          
            switch (option) {
                case 1:
                    manager.getMenuOfRestaurant().displayFullMenu();
                    System.out.println("Enter the plate ID to remove in the menu: ");
                    int plateIdToRemove = scanner.nextInt();
                    scanner.nextLine();
                    manager.removePlateById(plateIdToRemove);
                    break;
                case 2:
                    System.out.println("Exiting remove plate options...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 2);
}

    public String toCSVManager() {
        return String.format("%s,%s,%s,%s,%s,%s", getManagerName(), getManagerEmail(), getUserId(), getPassword(), getLoginStatus(), getRegisterDate());
    }

    public boolean validateLoginForManagers(String enteredUserId, String enteredPassword) {
        return getUserId().equals(enteredUserId) && getPassword().equals(enteredPassword);
    }

    public static ArrayList<Manager> readManagersFromCSV(String csvFileName) {
        ArrayList<Manager> managers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String managerName = data[0];
                String managerEmail = data[1];
                String userId = data[2];
                String password = data[3];
                String loginStatus = data[4];
                Date registerDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(data[5]);

                Manager manager = new Manager(managerName, managerEmail, userId, password, loginStatus, registerDate);
                managers.add(manager);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return managers;
    }
    
    public static void printManagerOptions() {
        System.out.println("*================Manager Options=======================*");
        System.out.println("1. Create new dish");
        System.out.println("2. Remove dish");
        System.out.println("3. Update Prices");
         System.out.println("4.Read Menu");
        System.out.println("5. Return");
    }

    public static void printAddNewPlateOptions() {
        System.out.println("*================Add New Plate Options=======================*");
        System.out.println("1. Add new dish in the Tallarin category ");
        System.out.println("2. Add new dish in the Mariscos category ");
        System.out.println("3. Return");
    }

    public static void printremovePlateOptions() {
        System.out.println("*================Remove Plate Options=======================*");
        System.out.println("1. Remove dish in the Menu by ID ");
        System.out.println("2. Return");
    }

    private static int validateOptionMenu(int option) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select an option:");

            try {
                option = scanner.nextInt();
                if (option != 1 && option != 2 && option != 3) {
                    System.out.println("Incorrect option, Try Again.");
                }

            } catch (Exception e) {
                System.out.println("Enter only numbers: ");
            }
        } while (option != 1 && option != 2 && option != 3);
        return option;
    }

    private static int validateOptionSubMenu(int option) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select an option:");

            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option != 1 && option != 2) {
                    System.out.println("Incorrect option, Try Again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter only numbers: ");
            }
        } while (option != 1 && option != 2);
        return option;
    }
    

    private static int validateMenuManager(int option) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select an option:");

            try {
                option = scanner.nextInt();
                if (option != 1 && option != 2 && option != 3 && option != 4 && option != 5) {
                    System.out.println("Incorrect option, Try Again.");
                }

            } catch (Exception e) {
                System.out.println("Enter only numbers: ");
                scanner.nextLine();
            }
        } while (option != 1 && option != 2 && option != 3 && option!=4 && option != 5);
        return option;
    }

    public void addTallarinPlate() {
        Plate addedPlate = registerNewPlate();
        menuOfRestaurant.addPlateToListTallarin(addedPlate);
        System.out.println("Dish successfully added to the Tallarines category");
    }

    public void addMariscosPlate() {
        Plate addedPlate = registerNewPlate();
        menuOfRestaurant.addPlateToListMariscos(addedPlate);
        System.out.println("Dish successfully added to the Mariscos category");
    }

    public Plate removePlateById(int plateId) {
        Plate removedPlate = menuOfRestaurant.removePlateById(plateId);

        if (removedPlate != null) {
            System.out.println("Successfully removed dish with ID " + plateId);
        } else {
            System.out.println("Plate with ID " + plateId + " does not exist. Nothing to remove.");
        }

        if (menuOfRestaurant.isEmpty()) {
            System.out.println("The menu is now empty.");
        }

        return removedPlate;
    }

    public Plate registerNewPlate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*================Add New Dish=======================*");
        System.out.println("Enter the name of the new dish: ");
        String name = scanner.nextLine();
        System.out.println("Enter the description of the new dish: ");
        String description = scanner.nextLine();

        double price = 0;
        boolean validPrice = false;
        while (!validPrice) {
            try {
                System.out.println("Enter the price of the new plate: ");
                price = Double.parseDouble(scanner.nextLine());
                validPrice = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter only numbers for the price, and you use '.' for decimals ");
            }
        }

        System.out.println("Enter availability (YES or NO) : ");
        String availability = scanner.nextLine();
        System.out.println("Enter the preparation time of the new dish in minutes: ");
        String preparationTime = scanner.nextLine();
        System.out.println("Dish added successfully");
        Plate addedPlate = new Plate(name, description, price, availability, preparationTime);

        return addedPlate;
    }

    public void updatePrices(Manager manager) {
        manager.menuOfRestaurant.displayFullMenu();
        Scanner scanner = new Scanner(System.in);

        int plateIdToUpdate = 0;
        boolean validId = false;
        while (!validId) {
            try {
                System.out.println("Enter the ID of the dish whose price you want to update: ");
                plateIdToUpdate = Integer.parseInt(scanner.nextLine());
                validId = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter only numbers for the dish ID.");
            }
        }

        Plate plateToUpdate = manager.menuOfRestaurant.getPlateById(plateIdToUpdate);
        if (plateToUpdate != null) {
            double newPrice = 0;
            boolean validNewPrice = false;
            while (!validNewPrice) {
                try {
                    System.out.println("Enter the new price of the dish: ");
                    newPrice = Double.parseDouble(scanner.nextLine());
                    validNewPrice = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter only numbers for the new price.");
                }
            }

            plateToUpdate.updatePrice(newPrice);
            System.out.println("Price successfully updated to: " + plateToUpdate.getPrice());
        } else {
            System.out.println("Dish ID does not exist");
        }
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String name) {
        this.managerName = name;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String email) {
        this.managerEmail = email;
    }

    public Menu getMenuOfRestaurant() {
        return menuOfRestaurant;
    }

    public void setMenuOfRestaurant(Menu menuOfRestaurant) {
        this.menuOfRestaurant = menuOfRestaurant;
    }

}
