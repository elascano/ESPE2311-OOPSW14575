
package ec.edu.espe.fandro.model;

/**
 *
 * @author RC_558
 */
public class Dishes {
    
    private String id;
    private String name;    
    private int price;

    public Dishes(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Dishes() {
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
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
