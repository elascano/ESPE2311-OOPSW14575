package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Tuna extends Fish {
    private boolean isFastSwimmer;
    private double averageSize;

    public Tuna(boolean isFastSwimmer, double averageSize, String habitatType, boolean isSaltwater, String speciesName, String fishColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(habitatType, isSaltwater, speciesName, fishColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.isFastSwimmer = isFastSwimmer;
        this.averageSize = averageSize;
    }

    @Override
    public String toString() {
        return "Tuna{" + super.toString() + "isFastSwimmer=" + isFastSwimmer + ", averageSize=" + averageSize + '}';
    }

    /**
     * @return the isFastSwimmer
     */
    public boolean isIsFastSwimmer() {
        return isFastSwimmer;
    }

    /**
     * @param isFastSwimmer the isFastSwimmer to set
     */
    public void setIsFastSwimmer(boolean isFastSwimmer) {
        this.isFastSwimmer = isFastSwimmer;
    }

    /**
     * @return the averageSize
     */
    public double getAverageSize() {
        return averageSize;
    }

    /**
     * @param averageSize the averageSize to set
     */
    public void setAverageSize(double averageSize) {
        this.averageSize = averageSize;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Tuna with squid");
    }
    
}
