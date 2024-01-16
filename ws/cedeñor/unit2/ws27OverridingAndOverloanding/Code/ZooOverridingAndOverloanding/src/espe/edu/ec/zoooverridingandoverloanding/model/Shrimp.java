package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Shrimp extends Crustaceans {

    private int shellHardness;

    public Shrimp(int shellHardness, boolean aquatic, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(aquatic, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.shellHardness = shellHardness;
    }

    @Override
    public String toString() {
        return "Shrimp{" + "shellHardness=" + getShellHardness() + '}';
    }

    public void cleanAquarium() {

    }

    /**
     * @return the shellHardness
     */
    public int getShellHardness() {
        return shellHardness;
    }

    /**
     * @param shellHardness the shellHardness to set
     */
    public void setShellHardness(int shellHardness) {
        this.shellHardness = shellHardness;
    }

}
