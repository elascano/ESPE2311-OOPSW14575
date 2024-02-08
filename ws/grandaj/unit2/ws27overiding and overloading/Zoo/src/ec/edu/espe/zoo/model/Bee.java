
package ec.edu.espe.zoo.model;

import java.util.Date;


/**
 *
 * @author Juan Granda
 */
public class Bee extends Arthropods {
    private int wing;
    private boolean sting;

    public Bee(int wing, boolean sting, int legs, int eyes, int athens, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(legs, eyes, athens, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.wing = wing;
        this.sting = sting;
    }

   

    @Override
    public String toString() {
        return "Bee{" + super.toString() + ", wing=" + wing + ", sting=" + sting + '}';
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }

    public boolean isSting() {
        return sting;
    }

    public void setSting(boolean sting) {
        this.sting = sting;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Bee with Flowers");
    }
    
}
