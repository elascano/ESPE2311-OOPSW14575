package ec.edu.espe.listarrayhw.model;

/**
 *
 * @author David
 */
public class Order {
    private int id;
    private String productName;
    private int quantity;
    private float unitCost;
    private float total;

    public Order(int id, String productName, int quantity, float unitCost, float total) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", productName=" + productName + ", quantity=" + quantity + ", unitCost=" + unitCost + ", total=" + total + '}';
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
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
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

    /**
     * @return the unitCost
     */
    public float getUnitCost() {
        return unitCost;
    }

    /**
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
    
}
