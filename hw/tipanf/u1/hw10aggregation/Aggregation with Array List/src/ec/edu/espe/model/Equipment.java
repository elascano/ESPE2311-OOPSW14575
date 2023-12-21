
package ec.edu.espe.model;

/**
 *
 * @author Frederick
 */
public class Equipment {
    private int id;
    private String type;
    private float value;
    private int quantity;

    @Override
    public String toString() {
        return "\n   id ---> " + id + "\n   type ---> " + type + "\n   value ---> $" + value + "\n   quantity --- > " + quantity + " units";
    }
    
    
    

    public Equipment(int id, String type, float value, int quantity) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.quantity = quantity;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
