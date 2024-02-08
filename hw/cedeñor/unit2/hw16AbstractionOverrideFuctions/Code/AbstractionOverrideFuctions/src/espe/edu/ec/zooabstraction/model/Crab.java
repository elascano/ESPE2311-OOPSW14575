package espe.edu.ec.zooabstraction.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Crab extends Crustaceans {

    private int clawSize;

    public Crab(int clawSize, boolean aquatic, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(aquatic, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.clawSize = clawSize;
    }

    @Override
    public String toString() {
        return "Crab{" + super.toString() + "clawSize=" + getClawSize() + '}';
    }

    @Override
    public void move() {
        System.out.println("The crab is moves with style");
    }

    public void pich() {

    }

    /**
     * @return the clawSize
     */
    public int getClawSize() {
        return clawSize;
    }

    /**
     * @param clawSize the clawSize to set
     */
    public void setClawSize(int clawSize) {
        this.clawSize = clawSize;
    }

}
