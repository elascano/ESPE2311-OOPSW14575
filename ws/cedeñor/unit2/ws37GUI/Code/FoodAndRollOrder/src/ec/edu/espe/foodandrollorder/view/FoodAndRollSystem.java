package ec.edu.espe.foodandrollorder.view;

import ec.edu.espe.foodandrollorder.model.Customer;
import ec.edu.espe.foodandrollorder.model.Manager;
import ec.edu.espe.foodandrollorder.model.Menu;
import ec.edu.espe.foodandrollorder.model.RestaurantInformation;
import ec.edu.espe.foodandrollorder.model.ShoppingCart;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.Date;
import java.util.Scanner;

public class FoodAndRollSystem {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int option = 0;
        int menuSize;
        
        while(option !=4){
            
            RestaurantInformation restaurantInfo = new RestaurantInformation(
                "Luis Francisco Lopez",
                "555-1234",
                "chifamichelena@gmail.com",
                "Next to the Pichincha Bank");
            restaurantInfo.showSpecificLocation();
            printMenu();
            menuSize=4;
            option=validateOptionMenu(option,menuSize);
        
            switch (option) {
                case 1:
                    if(!validatePasswordRestaurant()){
                        System.out.println("Incorrect Password");
                        break;
                    }
                    manager();
                    break;
                case 2:
                    if(!validatePasswordRestaurant()){
                        System.out.println("Incorrect Password");
                        break;
                    }
                    chef();
                    break; 
                case 3:
                    customer();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    throw new AssertionError();
            }
        }
        scann.close();
    }
    
    public static boolean validatePasswordRestaurant(){
        Scanner scanner = new Scanner(System.in);
        String password="Claverestaurante";
        String enterPassword;
        
        boolean passwordCorrect = false;
        
        do{
            System.out.println("Enter the restaurant password: ");
            enterPassword= scanner.nextLine();
        
        if(enterPassword.equals(password)){
            System.out.println("Correct password. Press Enter to continue...");
            scanner.nextLine();
            passwordCorrect = true;
        }else{
            System.out.println("Incorrect password.");
        }
    }while(!passwordCorrect);
        return true;
        
    }  
     
    private static int validateOptionMenu(int option, int menuSize) {
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Select an option:");
        try {
            option = scanner.nextInt();
            if (option < 1 || option > menuSize) {
                System.out.println("Incorrect option, Try Again.");

                option = scanner.nextInt();
                if (option<=(menuSize-menuSize)||(option>(menuSize))) {
                    System.out.println("Incorrect option, Try Again.");
                }      
            }
        } catch (Exception e) {
            System.out.println("Enter only numbers: ");
            scanner.nextLine();
            option = 0;
        }
    } while (option < 1 || option > menuSize);
    return option;
}


 
    public static void printMenu(){
        System.out.println("1. Select Login to Manager");
        System.out.println("2. Select Login to Chef");
        System.out.println("3. Select Login to Customer");
        System.out.println("4. Exit");
        System.out.println("*=======================================*");
    }
    
    public static void printManager(){
        System.out.println("*=======================================*");
        System.out.println("Manager Option");
        System.out.println("1. Register new manager");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }
    
    public static void printChef(){
        System.out.println("*=======================================*");
        System.out.println("Chef Option");
        System.out.println("1. Register new chef");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }
    
    public static void printCustomer(){
        System.out.println("*=======================================*");
        System.out.println("Customer Option");
        System.out.println("1. Register new customer");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }
    
    public static void manager(){
        int option = 0;
        int menuSize;
        Manager manager = new Manager("userId", "password", "loginStatus", new Date());
        do{
        printManager();
        menuSize=3;
        option=validateOptionMenu(option,menuSize);
        switch (option) {
            case 1:     
                registerNewManager();
                break;
            case 2:            
                validateManagerLogin();
                Manager.managerOptions();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Try again.");
                }
            } while (option != 3);
        }
    
    public static void chef(){
        int option = 0;
        int menuSize;
        while(option!=3){
        printChef();
        menuSize=3;
        option=validateOptionMenu(option,menuSize);
        switch (option) {
            case 1:   
                break;
            case 2:                  
                break;
            case 3:
                
                break;
            default:
                throw new AssertionError();
            }
        }
    }

    public static void customer() {
    int option = 0;
    int menuSize;
    Customer customer = new Customer("userId", "password", "loginStatus", new Date());
    customer.setMenuOfRestaurant(new Menu());
    
    ShoppingCart cart = new ShoppingCart();
    cart.setMenuOfRestaurant(customer.getMenuOfRestaurant());
    do {
        printCustomer();
        menuSize = 3;
        option = validateOptionMenu(option, menuSize);
        switch (option) {
            case 1:
                registerNewCustomer();                
                break;
            case 2:
                validateCustomerLogin();
                customer.customerOptions();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    } while (option != 3);
}

    
    
    public static void registerNewCustomer(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== We need some information about yourself, please provide us with correct and real data to proceed with the delivery ==");
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter customer email: ");
        String customerEmail = scanner.nextLine();
        
        System.out.println("Enter customer phone number: ");
        String customerPhoneNumber = scanner.nextLine();
        
        System.out.println("Enter customer address: ");
        String customerAddress = scanner.nextLine();
        
        System.out.println(" == Information for Login ==");
        System.out.println("Enter customer ID: ");
        String userId = scanner.nextLine();
        
        System.out.println("Enter customer password: ");
        String password = scanner.nextLine();
        
        Customer customer = new Customer(customerName, customerEmail, customerPhoneNumber, null, userId, password, "active", new Date());
        saveToCSVCustomer(customer);
        
    }
    
     private static void saveToCSVCustomer(Customer customer) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("customers.csv", true))) {
            if (customer != null) {
                writer.println(customer.toCSVCustomer());
                System.out.println("Customer registered successfully!");
            }
        } catch (IOException e) {
            System.err.println("Error registering Customer: " + e.getMessage());
        }
    }
     
    public static boolean validateLoginCustomer(String enteredUserId, String enteredPassword) {
        ArrayList<Customer> customers;
        customers = Customer.readCustomersFromCSV("customers.csv");

    for (Customer customer : customers) {
        if (customer.validateLoginForCustomers(enteredUserId, enteredPassword)) {
            return true; 
        }
    }

    return false; 
}

private static boolean validateCustomerLogin() {
    Scanner scanner = new Scanner(System.in);

    String enteredUserId;
    String enteredPassword;
    boolean loginSuccessful = false;

    do {
        System.out.println("Enter customer ID: ");
        enteredUserId = scanner.nextLine();

        System.out.println("Enter customer password: ");
        enteredPassword = scanner.nextLine();

        ArrayList<Customer> customers = Customer.readCustomersFromCSV("customers.csv");

        for (Customer customer : customers) {
            if (customer.validateLoginForCustomers(enteredUserId, enteredPassword)) {
                System.out.println("Login successful for customer: " + customer.getCustomerName());
                loginSuccessful = true;
                break;
            }
        }

        if (!loginSuccessful) {
            System.out.println("Login failed. No matching customer found. Try again.");
        }

    } while (!loginSuccessful);

    return true;
}
 
    public static void registerNewManager(){
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("=== We need some information about yourself, please provide us with correct and real data to proceed with the delivery ==");
        System.out.println("Enter manager name: ");
        String managerName = scanner.nextLine();
        System.out.println("Enter manager email: ");
        String managerEmail = scanner.nextLine();

        System.out.println(" == Information for Login ==");
        System.out.println("Enter manager ID: ");
        String userId = scanner.nextLine();
        
        System.out.println("Enter manager password: ");
        String password = scanner.nextLine();
        
        Manager managers = new Manager(managerName, managerEmail, userId, password, "Active", new Date());
        saveToCSVManager(managers);
    }                

    private static void saveToCSVManager(Manager managers) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("managers.csv", true))) {
            if (managers != null) {
                writer.println(managers.toCSVManager());
                System.out.println("Manager registered successfully!");
            }
        } catch (IOException e) {
            System.err.println("Error registering Manager: " + e.getMessage());
        }
    }
    
    public static boolean validateLoginManager(String enteredUserId, String enteredPassword) {
        ArrayList<Manager> managers;
        managers = Manager.readManagersFromCSV("manager.csv");

    for (Manager manager : managers) {
        if (manager.validateLoginForManagers(enteredUserId, enteredPassword)) {
            return true; 
        }
    }

    return false; 
}
    private static boolean validateManagerLogin() {
    Scanner scanner = new Scanner(System.in);

    String enteredUserId;
    String enteredPassword;
    boolean loginSuccessful = false;

    do {
        System.out.println("Enter manager ID: ");
        enteredUserId = scanner.nextLine();

        System.out.println("Enter manager password: ");
        enteredPassword = scanner.nextLine();

        ArrayList<Manager> managers = Manager.readManagersFromCSV("managers.csv");

        for (Manager manager : managers) {
            if (manager.validateLoginForManagers(enteredUserId, enteredPassword)) {
                System.out.println("Login successful for manager: " + manager.getManagerName());
                loginSuccessful = true;
                break;
            }
        }

        if (!loginSuccessful) {
            System.out.println("Login failed. No matching manager found. Try again.");
        }

    } while (!loginSuccessful);

    return true;
}
    }
        