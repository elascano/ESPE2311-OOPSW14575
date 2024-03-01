package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public class Arthropod extends Invertebrate{

    private boolean hasWings;
    private int numberOfEyes;

    public Arthropod(boolean hasWings, int numberOfEyes, String exoskeletonType, int numberOfLegs, int id, String scientificName, Date bornDate, int cageId) {
        super(exoskeletonType, numberOfLegs, id, scientificName, bornDate, cageId);
        this.hasWings = hasWings;
        this.numberOfEyes = numberOfEyes;
    }

    
    
    @Override
    public String toString() {
        return "Arthropod{" + super.toString() + "hasWings=" + hasWings + ", numberOfEyes=" + numberOfEyes + "}";
    }
    
    public void fly() {
        System.out.println("The arthropod is flying");
    }

    public void crawl() {
        System.out.println("The arthropod is crawling");
    }

    /**
     * @return the hasWings
     */
    public boolean isHasWings() {
        return hasWings;
    }

    /**
     * @param hasWings the hasWings to set
     */
    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    /**
     * @return the numberOfEyes
     */
    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    /**
     * @param numberOfEyes the numberOfEyes to set
     */
    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

}
