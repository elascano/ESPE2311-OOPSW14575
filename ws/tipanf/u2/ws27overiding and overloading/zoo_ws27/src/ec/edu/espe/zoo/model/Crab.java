package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Crab extends Arthropod {
    private float clampSize;

    public Crab(float clampSize, boolean developsMetamorphosis, int numberOfArticulations, float size, String habitat, int id, String scientificName, Date bornDate, int cageId) {
        super(developsMetamorphosis, numberOfArticulations, size, habitat, id, scientificName, bornDate, cageId);
        this.clampSize = clampSize;
    }

    @Override
    public String toString() {
        return "Crab{" + super.toString() + "clampSize=" + clampSize + '}';
    }

    /**
     * @return the clampSize
     */
    public float getClampSize() {
        return clampSize;
    }

    /**
     * @param clampSize the clampSize to set
     */
    public void setClampSize(float clampSize) {
        this.clampSize = clampSize;
    }
    
    
}
