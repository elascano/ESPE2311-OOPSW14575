package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Penguin extends Birds {
    private double flippersLength;
    private boolean isTolerantToCold;

    public Penguin(double flippersLength, boolean isTolerantToCold, String speciesName, boolean isMigratory, String birdColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(speciesName, isMigratory, birdColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.flippersLength = flippersLength;
        this.isTolerantToCold = isTolerantToCold;
    }

    @Override
    public String toString() {
        return "Penguin{" + super.toString() + "flippersLength=" + flippersLength + ", isTolerantToCold=" + isTolerantToCold + '}';
    }

    /**
     * @return the flippersLength
     */
    public double getFlippersLength() {
        return flippersLength;
    }

    /**
     * @param flippersLength the flippersLength to set
     */
    public void setFlippersLength(double flippersLength) {
        this.flippersLength = flippersLength;
    }

    /**
     * @return the isTolerantToCold
     */
    public boolean isIsTolerantToCold() {
        return isTolerantToCold;
    }

    /**
     * @param isTolerantToCold the isTolerantToCold to set
     */
    public void setIsTolerantToCold(boolean isTolerantToCold) {
        this.isTolerantToCold = isTolerantToCold;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Penguin with fish");
    }
    
}
