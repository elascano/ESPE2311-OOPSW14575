
package ec.edu.espe.model;

/**
 *
 * @author Ilhan R
 */
public class Stadium {
    private int id;
    private String name;
    private int seat;
    private float seatsPrice = calculateSeatsPrice(seat);

    public Stadium(int id, String name, int seat, float seatsPrice) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.seatsPrice = seatsPrice;
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
     * @return the seat
     */
    public int getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(int seat) {
        this.seat = seat;
    }

    public float calculateSeatsPrice(int seat){
        float price = seat*2.5f;
        return price;
    }
    
}
