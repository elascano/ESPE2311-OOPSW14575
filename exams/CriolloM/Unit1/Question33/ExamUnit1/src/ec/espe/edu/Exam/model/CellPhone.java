
package ec.espe.edu.Exam.model;

/**
 *
 * @author MateoCriollo
 */
public class CellPhone {
    private int id;
    private String brand;
    private float price;

    public CellPhone(int id, String brand, float price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + getId() + ", brand=" + getBrand() + ", price=" + getPrice() + '}';
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
