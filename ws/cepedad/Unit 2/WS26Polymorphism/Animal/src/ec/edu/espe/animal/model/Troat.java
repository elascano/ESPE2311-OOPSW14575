package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Troat extends Fish {
    private boolean isFreshwater;
    private double averageTemperature;

    public Troat(boolean isFreshwater, double averageTemperature, String habitatType, boolean isSaltwater, String speciesName, String fishColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(habitatType, isSaltwater, speciesName, fishColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.isFreshwater = isFreshwater;
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String toString() {
        return "Troat{" + super.toString() + "isFreshwater=" + isFreshwater + ", averageTemperature=" + averageTemperature + '}';
    }

    /**
     * @return the isFreshwater
     */
    public boolean isIsFreshwater() {
        return isFreshwater;
    }

    /**
     * @param isFreshwater the isFreshwater to set
     */
    public void setIsFreshwater(boolean isFreshwater) {
        this.isFreshwater = isFreshwater;
    }

    /**
     * @return the averageTemperature
     */
    public double getAverageTemperature() {
        return averageTemperature;
    }

    /**
     * @param averageTemperature the averageTemperature to set
     */
    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Troat with worms");
    }
}
