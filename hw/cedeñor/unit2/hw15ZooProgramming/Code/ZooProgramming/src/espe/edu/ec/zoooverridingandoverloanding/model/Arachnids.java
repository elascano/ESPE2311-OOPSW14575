package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Arachnids extends Invertebrate {

    private int numberOfEyes;
    private int numberOfLegs;

    public Arachnids(int numberOfEyes, int numberOfLegs, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Arachnids{" + super.toString() + "numberOfEyes=" + getNumberOfEyes() + ", numberOfLegs=" + getNumberOfLegs() + '}';
    }

    public void sting() {

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
