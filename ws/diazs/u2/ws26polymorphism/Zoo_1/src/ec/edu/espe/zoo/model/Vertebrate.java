package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public abstract class Vertebrate extends Animal{
    private String spine;
    private int numberOfBones;

    @Override
    public String toString() {
        return "Vertebrate{"+ super.toString() + "spine=" + spine + ", numberOfBones=" + numberOfBones + '}';
    }

    public Vertebrate(String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(id, scientificName, bornDate, cageId);
        this.spine = spine;
        this.numberOfBones = numberOfBones;
    }

    /**
     * @return the spine
     */
    public String getSpine() {
        return spine;
    }

    /**
     * @param spine the spine to set
     */
    public void setSpine(String spine) {
        this.spine = spine;
    }

    /**
     * @return the numberOfBones
     */
    public int getNumberOfBones() {
        return numberOfBones;
    }

    /**
     * @param numberOfBones the numberOfBones to set
     */
    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }
    
}
