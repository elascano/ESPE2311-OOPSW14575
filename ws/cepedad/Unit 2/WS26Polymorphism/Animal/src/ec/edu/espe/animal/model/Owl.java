package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Owl extends Birds {
    private boolean nightVision;
    private String favoritePrey;

    public Owl(boolean nightVision, String favoritePrey, String speciesName, boolean isMigratory, String birdColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(speciesName, isMigratory, birdColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.nightVision = nightVision;
        this.favoritePrey = favoritePrey;
    }

    @Override
    public String toString() {
        return "Owl{" + super.toString() + "nightVision=" + nightVision + ", favoritePrey=" + favoritePrey + '}';
    }

    /**
     * @return the nightVision
     */
    public boolean isNightVision() {
        return nightVision;
    }

    /**
     * @param nightVision the nightVision to set
     */
    public void setNightVision(boolean nightVision) {
        this.nightVision = nightVision;
    }

    /**
     * @return the favoritePrey
     */
    public String getFavoritePrey() {
        return favoritePrey;
    }

    /**
     * @param favoritePrey the favoritePrey to set
     */
    public void setFavoritePrey(String favoritePrey) {
        this.favoritePrey = favoritePrey;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Owl with mouse");
    }
    
}
