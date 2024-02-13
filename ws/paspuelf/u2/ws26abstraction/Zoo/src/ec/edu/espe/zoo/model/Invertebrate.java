
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public abstract class Invertebrate extends Animal{

    private String exoskeletonType;
    private int numberOfLegs;

    public Invertebrate(String exoskeletonType, int numberOfLegs, int id, String scientificName, Date bornDate, int cageId) {
        super(id, scientificName, bornDate, cageId);
        this.exoskeletonType = exoskeletonType;
        this.numberOfLegs = numberOfLegs;
    }
    
    @Override
    public String toString() {
        return "Invertebrate{" + super.toString() + "exoskeletonType=" + exoskeletonType + ", numberOfLegs=" + numberOfLegs + '}';
    }
    
    public void molt (){
        System.out.println("The invertebrate is molting");
    } 

    /**
     * @return the exoskeletonType
     */
    public String getExoskeletonType() {
        return exoskeletonType;
    }

    /**
     * @param exoskeletonType the exoskeletonType to set
     */
    public void setExoskeletonType(String exoskeletonType) {
        this.exoskeletonType = exoskeletonType;
    }

    /**
     * @return the numberOfLegs
     */
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    /**
     * @param numberOfLegs the numberOfLegs to set
     */
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    
}
