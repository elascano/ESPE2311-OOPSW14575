
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class TubeSponge extends Poriferous{
    private String hologramPattern;

    public TubeSponge(String hologramPattern, int numberOfPore, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfPore, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.hologramPattern = hologramPattern;
    }

    @Override
    public String toString() {
        return "TubeSponge{" +super.toString()+ "hologramPattern=" + getHologramPattern() + '}';
    }

    /**
     * @return the hologramPattern
     */
    public String getHologramPattern() {
        return hologramPattern;
    }

    /**
     * @param hologramPattern the hologramPattern to set
     */
    public void setHologramPattern(String hologramPattern) {
        this.hologramPattern = hologramPattern;
    }
    
    public void generateHologram(){
        
    }
    
    public void communicate(){
        
    }
    
    public void harvestEnergy(){
        
    }
}
