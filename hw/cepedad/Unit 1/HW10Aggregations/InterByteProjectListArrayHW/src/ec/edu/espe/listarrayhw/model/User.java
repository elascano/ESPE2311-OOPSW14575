package ec.edu.espe.listarrayhw.model;

import java.util.ArrayList;

/**
 *
 * @author David, InterByte, DCCO ESPE
 */
public class User {
    private int id;
    private String password;
    private int phoneNumber;
    private String email;
    private String address;
    private ArrayList<Order> orders; 

    public User(int id, String password, int phoneNumber, String email, String address, ArrayList<Order> orders) {
        this.id = id;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", password=" + password + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address + "], Orders --->" + orders + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * @return the orders
     */
    public ArrayList<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    
}
