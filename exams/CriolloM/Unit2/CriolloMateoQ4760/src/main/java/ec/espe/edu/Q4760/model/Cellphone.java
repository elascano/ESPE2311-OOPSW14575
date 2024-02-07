

package ec.espe.edu.Q4760.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Cellphone {
    private String id;
    private String name;
    private double priceSubtotal;
    private double priceTotal;

    public Cellphone(String id, String name, double priceSubtotal, double priceTotal) {
        this.id = id;
        this.name = name;
        this.priceSubtotal = priceSubtotal;
        this.priceTotal = priceTotal;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the priceSubtotal
     */
    public double getPriceSubtotal() {
        return priceSubtotal;
    }

    /**
     * @param priceSubtotal the priceSubtotal to set
     */
    public void setPriceSubtotal(double priceSubtotal) {
        this.priceSubtotal = priceSubtotal;
    }

    /**
     * @return the priceTotal
     */
    public double getPriceTotal() {
        return priceTotal;
    }

    /**
     * @param priceTotal the priceTotal to set
     */
    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }
    
    
    
}
