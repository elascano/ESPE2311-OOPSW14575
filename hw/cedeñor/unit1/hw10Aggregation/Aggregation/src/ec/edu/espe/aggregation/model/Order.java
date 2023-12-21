
package ec.edu.espe.aggregation.model;

/**
 *
 * @author RC_558
 */
public class Order {
    
    private int orderId;
    private String dateCreated;
    private String dateShipped;
    private String customerId;
    private String customerName;
    private String status;
    private String shippingId;
    private OrderDetails orderDetails [ ];
    

    @Override
    public String toString() {
        
        String order = null;
             
        order =  "Order{" + "orderId=" + orderId + ", dateCreated=" + dateCreated + ", dateShipped=" + dateShipped + ", customerId=" + customerId + ", customerName=" + customerName + ", status=" + status + ", shippingId=" + shippingId + ", ";                
        for  (OrderDetails orderDetail : orderDetails) {
            order = order + orderDetail + ", ";          
        }
         order = order +  "  } ";
    
         return order;
    }
    
    
    
    public Order(int orderId, String dateCreated, String dateShipped, String customerId, String customerName, String status, String shippingId, OrderDetails[] orderDetails) {
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerId = customerId;
        this.customerName = customerName;
        this.status = status;
        this.shippingId = shippingId;
        this.orderDetails = orderDetails;
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
     * @return the dateCreated
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the dateShipped
     */
    public String getDateShipped() {
        return dateShipped;
    }

    /**
     * @param dateShipped the dateShipped to set
     */
    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the shippingId
     */
    public String getShippingId() {
        return shippingId;
    }

    /**
     * @param shippingId the shippingId to set
     */
    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * @return the orderDetails
     */
    public OrderDetails[ ] getOrderDetails() {
        return orderDetails;
    }

    /**
     * @param orderDetails the orderDetails to set
     */
    public void setOrderDetails(OrderDetails[ ] orderDetails) {
        this.orderDetails = orderDetails;
    }

    
    
}
