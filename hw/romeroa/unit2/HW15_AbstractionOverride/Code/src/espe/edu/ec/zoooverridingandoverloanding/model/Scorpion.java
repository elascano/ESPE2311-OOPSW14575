package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Scorpion extends Arachnids {

    private int tailLenght;
    private boolean isPoisonous;

    public Scorpion(int tailLenght, boolean isPoisonous, int numberOfEyes, int numberOfLegs, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(numberOfEyes, numberOfLegs, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.isPoisonous = isPoisonous;
        this.tailLenght = tailLenght;
    }

    @Override
    public String toString() {
        return "Scorpion{" + super.toString() + "tailLenght=" + getTailLenght() + ", isPoisonous=" + isIsPoisonous() + '}';
    }

    public void hide() {

    }

    /**
     * @return the tailLenght
     */
    public int getTailLenght() {
        return tailLenght;
    }

    /**
     * @param tailLenght the tailLenght to set
     */
    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
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
