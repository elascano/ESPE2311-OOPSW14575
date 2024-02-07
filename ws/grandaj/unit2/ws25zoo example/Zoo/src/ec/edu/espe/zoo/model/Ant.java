
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Ant extends Arthropods{
    private String size;
    private String color;

    public Ant(String size, String color, int legs, int eyes, int athens, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(legs, eyes, athens, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.size = size;
        this.color = color;
    }

    

    @Override
    public String toString() {
        return "Ant{" + super.toString() + ", size=" + size + ", color=" + color + '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void feed() {
    }
    
    
}
