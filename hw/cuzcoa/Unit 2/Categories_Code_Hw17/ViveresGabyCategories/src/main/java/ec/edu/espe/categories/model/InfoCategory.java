   
package ec.edu.espe.categories.model;

public class InfoCategory {
    private static int nextId = 1;

    private int id;
    private String categoryName;
    private String description;
    private Product product;

    public InfoCategory(String categoryName, String description, Product product) {
        this.id = nextId++;
        this.categoryName = categoryName;
        this.description = description;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
