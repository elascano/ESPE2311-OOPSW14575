package ec.edu.espe.faru.model;

import java.util.Date;
import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author David
 */
public class User implements Serializable {
    private String customerName;
    private String email;
    private String phoneNumber;
    private String address; 
    private String userId;
    private String password;
    private String loginStatus;
    private Date registerDate;

    public User(String customerName, String email, String phoneNumber, String address, String userId, String password, String loginStatus, Date registerDate) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" + "customerName=" + customerName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", userId=" + userId + ", password=" + password + ", loginStatus=" + loginStatus + ", registerDate=" + registerDate + '}';
    }

    public static void printUser() {
        System.out.println("*=======================================*");
        System.out.println("User Option");
        System.out.println("1. Register new user");
        System.out.println("2. View all users");
        System.out.println("3. Delete user by id");
        System.out.println("4. Update user by id");
        System.out.println("5. Exit");
    }
    
    public static void registerNewCustomer() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== We need some information about yourself, please provide us with correct and real data to proceed with the delivery ==");
        System.out.println("Enter user name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter user email: ");
        String email = scanner.nextLine();

        System.out.println("Enter user phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter user address: ");
        String address = scanner.nextLine();

        System.out.println(" == Information for Login ==");
        System.out.println("Enter user ID: ");
        String userId = scanner.nextLine();

        System.out.println("Enter user password: ");
        String password = scanner.nextLine();

        User user = new User(customerName, email, phoneNumber, address, userId, password, address, new Date());
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
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the loginStatus
     */
    public String getLoginStatus() {
        return loginStatus;
    }

    /**
     * @param loginStatus the loginStatus to set
     */
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * @return the registerDate
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate the registerDate to set
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    
    
}
