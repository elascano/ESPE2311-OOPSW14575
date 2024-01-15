
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Squid extends Mollusk{
    private float limbSize;

    public Squid(float limbSize, boolean shell, String locomotion, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(shell, locomotion, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.limbSize = limbSize;
    }

    @Override
    public String toString() {
        return "Squid{" +super.toString()+ "limbSize=" + getLimbSize() + '}';
    }

    /**
     * @return the limbSize
     */
    public float getLimbSize() {
        return limbSize;
    }

    /**
     * @param limbSize the limbSize to set
     */
    public void setLimbSize(float limbSize) {
        this.limbSize = limbSize;
    }
    
    public void communicate(){
        
    }
}
