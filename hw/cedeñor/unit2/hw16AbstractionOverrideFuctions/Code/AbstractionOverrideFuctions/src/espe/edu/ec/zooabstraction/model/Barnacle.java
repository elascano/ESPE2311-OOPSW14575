package espe.edu.ec.zooabstraction.model;

import java.util.Date;

/**
 *
 * @author RC_558
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

    @Override
    public void move() {
        System.out.println("The barnacle is move discreet");
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
