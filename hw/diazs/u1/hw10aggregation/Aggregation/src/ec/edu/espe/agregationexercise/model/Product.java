package ec.edu.espe.agregationexercise.model;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class Product {
    private int id;
    private String description;
    private String name;
    private float cost;

    
    public Product(int id, String description, String name, float cost) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + getId() + ", description=" + getDescription() + ", name=" + getName() + ", cost=" + getCost() + '}';
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
    
    
}