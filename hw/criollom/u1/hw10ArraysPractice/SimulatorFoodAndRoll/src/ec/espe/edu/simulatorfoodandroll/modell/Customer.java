
package ec.espe.edu.simulatorfoodandroll.modell;

import java.util.ArrayList;

/**
 *
 * @author MateoCriollo
 */
public class Customer {
    private String customerName;
    private String email;
    private float phoneNumber;
    private String addres;
    //private MenuDish[] dishes;
    private ArrayList<MenuDish>dishes;

    public Customer(String customerName, String email, float phoneNumber, String addres,ArrayList<MenuDish> dishes){//, MenuDish[] dishes) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addres = addres;
        this.dishes = dishes;
    }

    //@Override
    //public String toString() {
      //  String customer = null;
      //  customer="Customer{" + "customerName=" + customerName + ",email=" + email + ",phoneNumber="+phoneNumber+",addres="+addres+",dishes={" ;
      //  for (MenuDish dishe : dishes) {
       //     customer=customer + dishe;
       // }
       // customer= customer+ "}";
        
      //  return customer;
    //}

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + customerName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", addres=" + addres + ", dishes=" + dishes + '}';
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
    public float getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(float phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the addres
     */
    public String getAddres() {
        return addres;
    }

    /**
     * @param addres the addres to set
     */
    public void setAddres(String addres) {
        this.addres = addres;
    }

    /**
     * @return the dishes
     */
    public ArrayList<MenuDish> getDishes() {
        return dishes;
    }

    /**
     * @param dishes the dishes to set
     */
    public void setDishes(ArrayList<MenuDish> dishes) {
        this.dishes = dishes;
    }
    
    
    
}
