package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Salmon extends Fish {
    private boolean hasSpawningSeason;
    private double averageWeight;

    public Salmon(boolean hasSpawningSeason, double averageWeight, String habitatType, boolean isSaltwater, String speciesName, String fishColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(habitatType, isSaltwater, speciesName, fishColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.hasSpawningSeason = hasSpawningSeason;
        this.averageWeight = averageWeight;
    }

    @Override
    public void swim(){
        System.out.println("Salmon is swimming");
    }
    
    public void swim(int id){
        System.out.println("Salmon " + id + " is swimming");
    } 
    
    @Override
    public String toString() {
        return "Salmon{" + super.toString() + "hasSpawningSeason=" + hasSpawningSeason + ", averageWeight=" + averageWeight + '}';
    }

    /**
     * @return the hasSpawningSeason
     */
    public boolean isHasSpawningSeason() {
        return hasSpawningSeason;
    }

    /**
     * @param hasSpawningSeason the hasSpawningSeason to set
     */
    public void setHasSpawningSeason(boolean hasSpawningSeason) {
        this.hasSpawningSeason = hasSpawningSeason;
    }

    /**
     * @return the averageWeight
     */
    public double getAverageWeight() {
        return averageWeight;
    }

    /**
     * @param averageWeight the averageWeight to set
     */
    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Salmon with little fish");
    }
    
}
