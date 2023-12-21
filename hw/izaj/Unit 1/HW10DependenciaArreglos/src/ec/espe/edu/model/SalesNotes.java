
package ec.espe.edu.model;



/**
 *
 * @author mateo
 */
public class SalesNotes {
    private float totalValue;
    private String product;
    private Client client[];

    @Override
    public String toString() {
            String salesNotes = null;
        salesNotes = "totalValue=" + totalValue + ", product=" + product + ", client=" + client + '}';
        for (Client client1 : client) {
            salesNotes = salesNotes + client1;        
        }
        salesNotes = salesNotes + "{";
     return salesNotes;
    }

    
    
    public SalesNotes(float totalValue, String product, Client[] client) {
        this.totalValue = totalValue;
        this.product = product;
        this.client = client;
    }

    
    /**
     * @return the totalValue
     */
    public float getTotalValue() {
        return totalValue;
    }

    /**
     * @param totalValue the totalValue to set
     */
    public void setTotalValue(float totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the client
     */
    public Client[] getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client[] client) {
        this.client = client;
    }


}
