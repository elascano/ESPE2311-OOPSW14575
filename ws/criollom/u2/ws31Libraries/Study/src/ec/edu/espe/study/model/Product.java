
package ec.edu.espe.study.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + getName() + ", price=" + getPrice() + '}';
    }

    
    

    public float calculateTotal(){
        float total;
        total = price + calculateIva();
        return total;
        
    }
    
    public float calculateIva(){
        return (float) ((price)*0.12);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
}
