package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Shark extends Fish {
    private boolean hasSharpTeeth;
    private double averageSpeed;

    public Shark(boolean hasSharpTeeth, double averageSpeed, String habitatType, boolean isSaltwater, String speciesName, String fishColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(habitatType, isSaltwater, speciesName, fishColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.hasSharpTeeth = hasSharpTeeth;
        this.averageSpeed = averageSpeed;
    }

    @Override
    public String toString() {
        return "Shark{"+ super.toString() + "hasSharpTeeth=" + hasSharpTeeth + ", averageSpeed=" + averageSpeed + '}';
    }

    /**
     * @return the hasSharpTeeth
     */
    public boolean isHasSharpTeeth() {
        return hasSharpTeeth;
    }

    /**
     * @param hasSharpTeeth the hasSharpTeeth to set
     */
    public void setHasSharpTeeth(boolean hasSharpTeeth) {
        this.hasSharpTeeth = hasSharpTeeth;
    }

    /**
     * @return the averageSpeed
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * @param averageSpeed the averageSpeed to set
     */
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Shark with fish");
    }

}
