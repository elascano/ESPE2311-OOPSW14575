package ec.edu.espe.smartwatches.model;

/**
 * @author Andrés Romero - DCCO
 */
public class Smartwatch {
    private int id;
    private String brand;
    private String modelName;
    private String color;
    private float price;

    public Smartwatch(int id, String brand, String modelName, String color, float price) {
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
