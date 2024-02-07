package espe.edu.ec.zooabstraction.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Spider extends Arachnids {

    private boolean isPoisonous;

    public Spider(boolean isPoisonous, int numberOfEyes, int numberOfLegs, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(numberOfEyes, numberOfLegs, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void move() {
        System.out.println("The spider is moves discreet");
    }

    @Override
    public void hunt() {
        System.out.println("Spider hunting");
    }

    public void hunt(int prey) {
        System.out.println("number of prey --> " + prey);
    }

    @Override
    public String toString() {
        return "Spider{" + super.toString() + "isPoisonous=" + isIsPoisonous() + '}';
    }

    public void weaveSpiderWeb() {
        System.out.println("Spider weaving web");
    }

    /**
     * @return the isPoisonous
     */
    public boolean isIsPoisonous() {
        return isPoisonous;
    }

    /**
     * @param isPoisonous the isPoisonous to set
     */
    public void setIsPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

}
