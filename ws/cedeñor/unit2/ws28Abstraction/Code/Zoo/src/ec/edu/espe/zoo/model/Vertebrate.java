
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public abstract class Vertebrate extends Animal{
    private String spine;
    private int numberOfBones;

    public Vertebrate(int id, String scientificName, Date bornOnDate, int cageId, String spine, int numberOfBones) {
        super(id, scientificName, bornOnDate, cageId);
        this.spine = spine;
        this.numberOfBones = numberOfBones;
    }

    @Override
    public String toString() {
        return "Vertebrate{" + super.toString() + "spine=" + spine + ", numberOfBones=" + numberOfBones + '}';
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
