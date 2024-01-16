package espe.edu.ec.zooabstraction.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Tarantula extends Arachnids {

    private boolean isPoisonous;

    public Tarantula(boolean isPoisonous, int numberOfEyes, int numberOfLegs, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(numberOfEyes, numberOfLegs, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.isPoisonous = isPoisonous;
    }

    @Override
    public String toString() {
        return "Tarantula{" + super.toString() + "isPoisonous=" + isIsPoisonous() + '}';
    }

    @Override
    public void move() {
        System.out.println("The tarantula is moves smoothly ");
    }

    public void weaveSpiderWeb() {

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
