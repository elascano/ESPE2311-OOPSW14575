
package ec.edu.espe.model;

import java.util.Date;
import ec.edu.espe.model.Animal;

/**
 *
 * @author Usuario
 */
public class Vertebrate extends Animal {
    private String spine;
    private int numberOfBones;

    public Vertebrate(int id, String scientificName, Date bornDate, int cageId, String cageId, String spine, int numberOfBones) {
        super(id, scientificName, bornDate, cageId);
        this.spine=spine;
        this.numberOfBones=numberOfBones;
    }

    @Override
    public String toString() {
        return "Vertebrate{"+super.toString() + "spine=" + spine + ", numberOfBones=" + numberOfBones + '}';
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
