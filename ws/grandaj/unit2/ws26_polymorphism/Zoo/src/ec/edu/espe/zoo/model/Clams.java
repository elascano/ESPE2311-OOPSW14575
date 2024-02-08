
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Clams extends Mollusks {
    private String color;
    private String weight;

    public Clams(String color, String weight, String shell, boolean mucousGland, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(shell, mucousGland, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.color = color;
        this.weight = weight;
    }

    

    @Override
    public String toString() {
        return "Clams{" + super.toString() + ", color=" + color + ", weight=" + weight + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

 
}
