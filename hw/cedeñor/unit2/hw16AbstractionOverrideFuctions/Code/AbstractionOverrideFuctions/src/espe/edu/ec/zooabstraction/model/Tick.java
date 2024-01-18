package espe.edu.ec.zooabstraction.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Tick extends Arachnids {

    private boolean isBloodSucker;

    public Tick(boolean isBloodSucker, int numberOfEyes, int numberOfLegs, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(numberOfEyes, numberOfLegs, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.isBloodSucker = isBloodSucker;
    }

    @Override
    public String toString() {
        return "Tick{" + super.toString() + "isBloodSucker=" + isIsBloodSucker() + '}';
    }

    @Override
    public void move() {
        System.out.println("The tick is moves quickly");
    }

    public void suckBood() {

    }

    /**
     * @return the isBloodSucker
     */
    public boolean isIsBloodSucker() {
        return isBloodSucker;
    }

    /**
     * @param isBloodSucker the isBloodSucker to set
     */
    public void setIsBloodSucker(boolean isBloodSucker) {
        this.isBloodSucker = isBloodSucker;
    }

}
