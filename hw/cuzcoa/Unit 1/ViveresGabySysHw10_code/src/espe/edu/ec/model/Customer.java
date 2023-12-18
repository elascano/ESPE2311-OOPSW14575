
package espe.edu.ec.model;
import java.util.ArrayList;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Customer {
    
    private int id;
    private String fullName;
    private String email;
    //private Bill[] bills; 
    private ArrayList<Bill> bills;
    
    
    
    @Override
    public String toString() {
        String customer;
        customer= "customer{" + "id=" + id + ", fullname=" + fullName + ", email=" +email+", bills=" + bills + '}';
        for(Bill bill : bills){
            customer = customer + bills;
        }
       
        return customer;
    }

    public Customer(int id, String fullName, String email, ArrayList<Bill> bills) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.bills = bills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }
    
    

    
    

   
    
    
}
