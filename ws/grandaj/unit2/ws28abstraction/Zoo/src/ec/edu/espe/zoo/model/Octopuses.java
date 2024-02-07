package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Octopuses extends Mollusks {

    private int tenculi;
    private String color;

    public Octopuses(int tenculi, String color, String shell, boolean mucousGland, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(shell, mucousGland, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.tenculi = tenculi;
        this.color = color;
    }
 @Override
    public void molluskLocation() {
        System.out.println("In the depths of the sea");

    }

   
    public void molluskLocation(int meters) {
        System.out.println("Sea ​​floor to " + meters + " meters");

    }

    @Override
    public String toString() {
        return "Octopuses{" + super.toString() + ", tenculi=" + tenculi + ", color=" + color + '}';
    }

    public int getTenculi() {
        return tenculi;
    }

    public void setTenculi(int tenculi) {
        this.tenculi = tenculi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
