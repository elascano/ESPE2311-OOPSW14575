
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public abstract class Vertebrate extends Animal{
    private String spine;
    private int numberOfBones;

    public Vertebrate(String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(id, scientificName, bornDate, cageId);
        this.spine = spine;
        this.numberOfBones = numberOfBones;
    }
    
    

    @Override
    public String toString() {
        return "Vertebrate{" + super.toString() + "spine=" + spine + ", numberOfBones=" + numberOfBones + '}';
    }

    public String getSpine() {
        return spine;
    }

    public void setSpine(String spine) {
        this.spine = spine;
    }

    public int getNumberOfBones() {
        return numberOfBones;
    }

    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }
    
    
}
