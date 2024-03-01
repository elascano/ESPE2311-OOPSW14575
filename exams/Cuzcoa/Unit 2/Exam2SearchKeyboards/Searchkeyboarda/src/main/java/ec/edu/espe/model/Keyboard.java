
package ec.edu.espe.model;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Keyboard {
    
    private int id;
    private String typeKeyboards;
    private float price;

    public Keyboard(int id, String typeKeyboards, float price) {
        this.id = id;
        this.typeKeyboards = typeKeyboards;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "id=" + getId() + ", typeKeyboards=" + getTypeKeyboards() + ", price=" + getPrice() + '}';
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
     * @return the typeKeyboards
     */
    public String getTypeKeyboards() {
        return typeKeyboards;
    }

    /**
     * @param typeKeyboards the typeKeyboards to set
     */
    public void setTypeKeyboards(String typeKeyboards) {
        this.typeKeyboards = typeKeyboards;
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
    public void setPrice(int price) {
        this.price = price;
    }

     
}
