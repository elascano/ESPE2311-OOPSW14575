package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public abstract class Vertebrate extends Animal {
    private String sping;
    private int numberOfBones;

    public Vertebrate(String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(id, scientificName, bornDate, cageId);
        this.sping = sping;
        this.numberOfBones = numberOfBones;
    }
    
    public void move(){
        
    }

    @Override
    public String toString() {
        return "Vertebrates{" +super.toString() + "sping=" + sping + ", numberOfBones=" + numberOfBones + '}';
    }


    /**
     * @return the sping
     */
    public String getSping() {
        return sping;
    }

    /**
     * @param sping the sping to set
     */
    public void setSping(String sping) {
        this.sping = sping;
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
