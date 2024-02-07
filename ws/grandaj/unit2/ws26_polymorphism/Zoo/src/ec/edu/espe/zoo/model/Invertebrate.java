
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public abstract class Invertebrate extends Animal {
    private int endoskeleton;
    private int quantityOfLegs;
    private String feedType;
    private String habitat;

    public Invertebrate(int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(id, scietificName, BornDate, cageld);
        this.endoskeleton = endoskeleton;
        this.quantityOfLegs = quantityOfLegs;
        this.feedType = feedType;
        this.habitat = habitat;
    }


    @Override
    public String toString() {
        return "Invertebrate{" + super.toString()+ "endoskeleton=" + endoskeleton + ", quantityOfLegs=" + quantityOfLegs + ", feedType=" + feedType + ", habitat=" + habitat + '}';
    }
    

    public int getEndoskeleton() {
        return endoskeleton;
    }

    public void setEndoskeleton(int endoskeleton) {
        this.endoskeleton = endoskeleton;
    }

    public int getQuantityOfLegs() {
        return quantityOfLegs;
    }

    public void setQuantityOfLegs(int quantityOfLegs) {
        this.quantityOfLegs = quantityOfLegs;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
}
