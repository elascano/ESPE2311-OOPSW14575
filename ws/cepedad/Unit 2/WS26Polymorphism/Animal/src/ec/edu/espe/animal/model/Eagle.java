package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Eagle extends Birds {
    private boolean hasSharpBeak;
    private String nestLocation;

    public Eagle(boolean hasSharpBeak, String nestLocation, String speciesName, boolean isMigratory, String birdColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(speciesName, isMigratory, birdColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.hasSharpBeak = hasSharpBeak;
        this.nestLocation = nestLocation;
    }

    @Override
    public String toString() {
        return "Eagle{" + super.toString() + "hasSharpBeak=" + hasSharpBeak + ", nestLocation=" + nestLocation + '}';
    }

    /**
     * @return the hasSharpBeak
     */
    public boolean isHasSharpBeak() {
        return hasSharpBeak;
    }

    /**
     * @param hasSharpBeak the hasSharpBeak to set
     */
    public void setHasSharpBeak(boolean hasSharpBeak) {
        this.hasSharpBeak = hasSharpBeak;
    }

    /**
     * @return the nestLocation
     */
    public String getNestLocation() {
        return nestLocation;
    }

    /**
     * @param nestLocation the nestLocation to set
     */
    public void setNestLocation(String nestLocation) {
        this.nestLocation = nestLocation;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Eagle with rabbit meat");
    }
    
    
}
