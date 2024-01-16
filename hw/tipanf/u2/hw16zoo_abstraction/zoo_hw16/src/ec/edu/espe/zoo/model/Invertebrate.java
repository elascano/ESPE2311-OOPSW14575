package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public abstract class Invertebrate extends Animal {
    private float size;
    private String habitat;

    public Invertebrate(float size, String habitat, int id, String scientificName, Date bornDate, int cageId) {
        super(id, scientificName, bornDate, cageId);
        this.size = size;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Invertebrate{" + super.toString() + "size=" + size + ", habitat=" + habitat + '}';
    }
    
    

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
}
