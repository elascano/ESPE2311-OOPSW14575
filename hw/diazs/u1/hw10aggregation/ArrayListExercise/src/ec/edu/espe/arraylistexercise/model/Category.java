package ec.edu.espe.arraylistexercise.model;

import java.util.ArrayList;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class Category {
    private String name;
    private String description;
    private ArrayList<Product> products;

    @Override
    public String toString() {
        return "Category{" + "name=" + getName() + ", description=" + getDescription() + ", products=" + getProducts() + '}';
    }

    public Category(String name, String description, ArrayList<Product> products) {
        this.name = name;
        this.description = description;
        this.products = products;
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
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    
    
}
