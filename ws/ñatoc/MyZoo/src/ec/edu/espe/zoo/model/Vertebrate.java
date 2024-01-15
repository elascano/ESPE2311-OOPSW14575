
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Vertebrate extends Animal{
    private String spine;
    private int numberOfBones;

    public Vertebrate(String spine, int nomberOfBones, int id, String cientificName, Date bornDate, int cageId) {
        super(id, cientificName, bornDate, cageId);
        this.spine = spine;
        this.numberOfBones = nomberOfBones;
    }

    @Override
    public String toString() {
        return "Vertebrate{" + super.toString() +"spine=" + spine + ", nomberOfBones=" + numberOfBones + '}';
    }

    public String getSpine() {
        return spine;
    }

    public void setSpine(String spine) {
        this.spine = spine;
    }

    public int getNomberOfBones() {
        return numberOfBones;
    }

    public void setNomberOfBones(int nomberOfBones) {
        this.numberOfBones = nomberOfBones;
    }
    
 
    
}
