
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public abstract class Arthropods extends Invertebrate{
    private int legs;
    private int eyes;
    private int athens;

    public Arthropods(int legs, int eyes, int athens, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.legs = legs;
        this.eyes = eyes;
        this.athens = athens;
    }

    @Override
    public String toString() {
        return "Arthropods{" +super.toString()+ ", legs=" + legs + ", eyes=" + eyes + ", athens=" + athens + '}';
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getAthens() {
        return athens;
    }

    public void setAthens(int athens) {
        this.athens = athens;
    }
    
    
    
}
