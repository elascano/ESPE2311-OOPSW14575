package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Mite extends Arachnids {

    private boolean isParasitic;

    public Mite(boolean isParasitic, int numberOfEyes, int numberOfLegs, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(numberOfEyes, numberOfLegs, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.isParasitic = isParasitic;
    }

    @Override
    public String toString() {
        return "Mite{" + super.toString() + "isParasitic=" + isIsParasitic() + '}';
    }

    public void parasitize() {

    }

    /**
     * @return the isParasitic
     */
    public boolean isIsParasitic() {
        return isParasitic;
    }

    /**
     * @param isParasitic the isParasitic to set
     */
    public void setIsParasitic(boolean isParasitic) {
        this.isParasitic = isParasitic;
    }

}
