
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Butterfly extends Arthropods{
    private String weight;
    private String color;

    public Butterfly(String weight, String color, int legs, int eyes, int athens, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(legs, eyes, athens, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.weight = weight;
        this.color = color;
    }

    

    @Override
    public String toString() {
        return "Butterfly{" + super.toString() + ", weight=" + weight + ", color=" + color + '}';
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
