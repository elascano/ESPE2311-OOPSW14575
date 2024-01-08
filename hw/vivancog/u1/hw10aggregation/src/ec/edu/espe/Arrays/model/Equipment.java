package ec.edu.espe.Arrays.model;

/**
 *
 * @author Gabriel Vivanco
 */
public class Equipment {
    private int id;
    private String type;
    private float cost;
    private int quantity;

    public Equipment(int id, String type, float cost, int quantity) {
        this.id = id;
        this.type = type;
        this.cost = cost;
        this.quantity = quantity;
    }

    
    
    @Override
    public String toString() {
        return "Equipment{" + "id=" + id + ", type=" + type + ", cost=" + cost + ", quantity=" + quantity + '}';
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
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
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
