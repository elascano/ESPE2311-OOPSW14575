
package ec.edu.espe.apartments.model;

/**
 *
 * @author Carlos
 */
public class Apartment {
    private int id;
    private int sizeInMeters;
    private String MainStreet;
    private int priceByMeter;
    private int totalPrice;

    public Apartment(int id, int sizeInMeters, String MainStreet, int priceByMeter, int totalPrice) {
        this.id = id;
        this.sizeInMeters = sizeInMeters;
        this.MainStreet = MainStreet;
        this.priceByMeter = priceByMeter;
        this.totalPrice = totalPrice;
    }


    
    public Apartment(){}

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
     * @return the sizeInMeters
     */
    public int getSizeInMeters() {
        return sizeInMeters;
    }

    /**
     * @param sizeInMeters the sizeInMeters to set
     */
    public void setSizeInMeters(int sizeInMeters) {
        this.sizeInMeters = sizeInMeters;
    }

    /**
     * @return the MainStreet
     */
    public String getMainStreet() {
        return MainStreet;
    }

    /**
     * @param MainStreet the MainStreet to set
     */
    public void setMainStreet(String MainStreet) {
        this.MainStreet = MainStreet;
    }

    /**
     * @return the priceByMeter
     */
    public int getPriceByMeter() {
        return priceByMeter;
    }

    /**
     * @param priceByMeter the priceByMeter to set
     */
    public void setPriceByMeter(int priceByMeter) {
        this.priceByMeter = priceByMeter;
    }

    /**
     * @return the totalPrice
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
