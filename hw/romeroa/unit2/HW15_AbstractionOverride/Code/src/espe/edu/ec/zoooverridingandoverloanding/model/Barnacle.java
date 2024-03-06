package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Barnacle extends Crustaceans {

    private boolean attached;

    public Barnacle(boolean attached, boolean aquatic, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(aquatic, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.attached = attached;
    }

    @Override
    public String toString() {
        return "Barnacle{" + super.toString() + "attached=" + isAttached() + '}';
    }

    public void filterFeed() {

    }

    /**
     * @return the attached
     */
    public boolean isAttached() {
        return attached;
    }

    /**
     * @param attached the attached to set
     */
    public void setAttached(boolean attached) {
        this.attached = attached;
    }

}
