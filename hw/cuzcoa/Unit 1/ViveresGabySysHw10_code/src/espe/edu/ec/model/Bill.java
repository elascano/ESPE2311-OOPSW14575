
package espe.edu.ec.model;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Bill {

    
    private int id;
    private String fullName;
    private String products;
    

    @Override
    public String toString() {
        return "Bill{" + "id=" + id + ", Full name=" + fullName + ", Products=" +products+'}';
    }

    public Bill(int id, String fullName, String products) {
        this.id = id;
        this.fullName = fullName;
        this.products = products;
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

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }
    
   
}
