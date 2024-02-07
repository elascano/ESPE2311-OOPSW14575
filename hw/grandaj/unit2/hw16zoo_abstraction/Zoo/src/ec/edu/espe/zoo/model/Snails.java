
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Snails extends Mollusks {
    private boolean slime;
    private String color;

    public Snails(boolean slime, String color, String shell, boolean mucousGland, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(shell, mucousGland, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.slime = slime;
        this.color = color;
    }

    

    @Override
    public String toString() {
        return "Snails{" + super.toString() + "slime=" + slime + ", color=" + color + '}';
    }

    public boolean isSlime() {
        return slime;
    }

    public void setSlime(boolean slime) {
        this.slime = slime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
