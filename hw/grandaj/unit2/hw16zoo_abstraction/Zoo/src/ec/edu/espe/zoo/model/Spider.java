
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Spider extends Arthropods{
    private String weight;
    private boolean hair;

    public Spider(String weight, boolean hair, int legs, int eyes, int athens, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(legs, eyes, athens, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.weight = weight;
        this.hair = hair;
    }

    

    @Override
    public String toString() {
        return "Spider{" + super.toString() + ", weight=" + weight + ", hair=" + hair + '}';
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Spider with flies");
    }
    
    
}
