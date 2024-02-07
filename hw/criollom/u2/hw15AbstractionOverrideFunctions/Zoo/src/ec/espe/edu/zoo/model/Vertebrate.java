
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Vertebrate extends Animal {
    private String spine;
    private int numberOfbones;

    public Vertebrate(String spine, int numberOfbones, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(id, ciemtificName, bornOnDate, cageId);
        this.spine = spine;
        this.numberOfbones = numberOfbones;
    }

    @Override
    public String toString() {
        return "Vertebrate{" + super.toString()+ "spine=" + spine + ", numberOfbones=" + numberOfbones + '}';
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
     * @return the numberOfbones
     */
    public int getNumberOfbones() {
        return numberOfbones;
    }

    /**
     * @param numberOfbones the numberOfbones to set
     */
    public void setNumberOfbones(int numberOfbones) {
        this.numberOfbones = numberOfbones;
    }
    
    
}
