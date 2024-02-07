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

public class Customer extends User {

    private String customerName;
    private String email;
    private String phoneNumber;
    private String address;
    private Menu menuOfRestaurant;

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + getCustomerName() + ", email=" + getEmail() + ", phoneNumber=" + getPhoneNumber() + ", address=" + getAddress() + '}';
    }

    public Customer(String customerName, String email, String phoneNumber, String address, String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.menuOfRestaurant = new Menu();
    }

    public Customer(String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.menuOfRestaurant = new Menu();
    }

    public static void customerOptions() {
        int option = 0;
        Customer customer = new Customer("userId", "password", "loginStatus", new Date());
        customer.setMenuOfRestaurant(new Menu());
        ShoppingCart cart = new ShoppingCart();
        cart.setMenuOfRestaurant(customer.getMenuOfRestaurant());
        while (option != 4) {
            printCustomerOptions();
            option = validateMenuCustomer(option);
            switch (option) {
                case 1:
                    customer.ShowFullMenu();
                    break;
                case 2:
                    cart.addDishToCart();
                    break;
                case 3:
                    cart.viewCartDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public String toCSVCustomer() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getCustomerName(), getEmail(), getPhoneNumber(), getAddress(), getUserId(), getPassword(), getLoginStatus(), getRegisterDate());
    }

    public boolean validateLoginForCustomers(String enteredUserId, String enteredPassword) {
        return getUserId().equals(enteredUserId) && getPassword().equals(enteredPassword);
    }

    public static ArrayList<Customer> readCustomersFromCSV(String csvFileName) {
        ArrayList<Customer> customers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String customerName = data[0];
                String email = data[1];
                String phoneNumber = data[2];
                String address = data[3];
                String userId = data[4];
                String password = data[5];
                String loginStatus = data[6];
                Date registerDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(data[7]);

                Customer customer = new Customer(customerName, email, phoneNumber, address, userId, password, loginStatus, registerDate);
                customers.add(customer);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return customers;
    }

    public static void printCustomerOptions() {
        System.out.println("*================Customer Options=======================*");
        System.out.println("1. Show Full Menu");
        System.out.println("2. Add Dish To Menu");
        System.out.println("3. View Cart Details");
        System.out.println("4. Return");
    }

    private static int validateMenuCustomer(int option) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select an option:");

            try {
                option = scanner.nextInt();
                if (option != 1 && option != 2 && option != 3 && option != 4) {
                    System.out.println("Incorrect option, Try Again.");
                }

            } catch (Exception e) {
                System.out.println("Enter only numbers: ");
                scanner.nextLine();
            }
        } while (option != 1 && option != 2 && option != 3 && option != 4);
        return option;
    }

    public void ShowFullMenu() {
        if (menuOfRestaurant != null) {
            menuOfRestaurant.setMenuFromJson("menu.json");
            menuOfRestaurant.displayFullMenu();
        } else {
            System.out.println("Error: Menu not initialized.");
        }
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the menuOfRestaurant
     */
    public Menu getMenuOfRestaurant() {
        return menuOfRestaurant;
    }

    /**
     * @param menuOfRestaurant the menuOfRestaurant to set
     */
    public void setMenuOfRestaurant(Menu menuOfRestaurant) {
        this.menuOfRestaurant = menuOfRestaurant;
    }
}
