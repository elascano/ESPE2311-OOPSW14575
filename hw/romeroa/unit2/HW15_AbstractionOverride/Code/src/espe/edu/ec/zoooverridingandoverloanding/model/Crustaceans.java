package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Crustaceans extends Invertebrate {

    private boolean aquatic;

    public Crustaceans(boolean aquatic, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.aquatic = aquatic;
    }

    @Override
    public String toString() {
        return "Crustaceans{" + super.toString() + "aquatic=" + isAquatic() + '}';
    }

    public void performAquaticBehavior() {

    }

    /**
     * @return the aquatic
     */
    public boolean isAquatic() {
        return aquatic;
    }

    /**
     * @param aquatic the aquatic to set
     */
    public void setAquatic(boolean aquatic) {
        this.aquatic = aquatic;
    }

}
