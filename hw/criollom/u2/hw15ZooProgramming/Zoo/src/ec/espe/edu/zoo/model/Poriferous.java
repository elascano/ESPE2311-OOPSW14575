
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Poriferous extends Invertebrate {
    private int numberOfPore;

    public Poriferous(int numberOfPore, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.numberOfPore = numberOfPore;
    }

    @Override
    public String toString() {
        return "Poriferous{" +super.toString()+ "numberOfPore=" + getNumberOfPore() + '}';
    }

    /**
     * @return the numberOfPore
     */
    public int getNumberOfPore() {
        return numberOfPore;
    }

    /**
     * @param numberOfPore the numberOfPore to set
     */
    public void setNumberOfPore(int numberOfPore) {
        this.numberOfPore = numberOfPore;
    }
    
    public void setPoreFunction(){
        
    }
    
    public void filterWater(){
        
    }
}
