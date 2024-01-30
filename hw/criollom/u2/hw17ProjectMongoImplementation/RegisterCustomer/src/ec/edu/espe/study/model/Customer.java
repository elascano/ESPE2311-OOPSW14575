
package ec.edu.espe.study.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Customer {
    private String customerName;
    private String email;
    private float phoneNumber;
    private String addres;

    public Customer(String customerName, String email, float phoneNumber, String addres) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + getCustomerName() + ", email=" + getEmail() + ", phoneNumber=" + getPhoneNumber() + ", addres=" + getAddres() + '}';
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
    
    
    
}
