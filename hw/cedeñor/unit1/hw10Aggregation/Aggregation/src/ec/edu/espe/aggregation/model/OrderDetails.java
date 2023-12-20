
package ec.edu.espe.aggregation.model;

/**
 *
 * @author RC_558
 */
public class OrderDetails {
    private int orderId;
    private int productId;
    private String productName;
    private int quantity;
    private double unitCoast;
    private double subTotal;

    @Override
    public String toString() {
        return "OrderDetails{" + "orderId=" + getOrderId() + ", productId=" + getProductId() + ", productName=" + getProductName() + ", quantity=" + getQuantity() + ", unitCoast=" + getUnitCoast() + ", subTotal=" + getSubTotal() + '}';
    }

    public OrderDetails(int orderId, int productId, String productName, int quantity, double unitCoast, double subTotal) {
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitCoast = unitCoast;
        this.subTotal = subTotal;
    }

    /**
     * @return the orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
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
     * @return the unitCoast
     */
    public double getUnitCoast() {
        return unitCoast;
    }

    /**
     * @param unitCoast the unitCoast to set
     */
    public void setUnitCoast(double unitCoast) {
        this.unitCoast = unitCoast;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    
  
}
