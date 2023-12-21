package ec.edu.espe.agregationexercise.model;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class Category {
    private String name;
    private String description;
    private Product[] products;

    public Category(String name, String description, Product[] products) {
        this.name = name;
        this.description = description;
        this.products = products;
    }

    @Override
    public String toString() {
        String category = null;
        category = "Category{" + "name=" + getName() + ", description=" + getDescription() +  ", product=";
        for (Product product: getProducts()){
            category += product;
        }
                category = category + "}";
        return category;
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
    public Product[] getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(Product[] products) {
        this.products = products;
    }

}