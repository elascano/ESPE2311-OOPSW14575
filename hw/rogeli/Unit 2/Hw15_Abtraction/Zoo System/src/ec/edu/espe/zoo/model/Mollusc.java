
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public abstract class Mollusc extends Invertebrate {
    private String shellStatus;
    private String shellType;

    @Override
    public String toString() {
        return "Mollusc{" + super.toString()+"shellStatus=" + shellStatus + ", shellType=" + shellType + '}';
    }
    
    
    /**
     * @return the shellStatus
     */
    public String getShellStatus() {
        return shellStatus;
    }

    /**
     * @param shellStatus the shellStatus to set
     */
    public void setShellStatus(String shellStatus) {
        this.shellStatus = shellStatus;
    }

    /**
     * @return the shellType
     */
    public String getShellType() {
        return shellType;
    }

    /**
     * @param shellType the shellType to set
     */
    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    public Mollusc(String shellStatus, String shellType, int id, String scientificName, Date borndateM, int cageId) {
        super(id, scientificName, borndateM, cageId);
        this.shellStatus = shellStatus;
        this.shellType = shellType;
    }
    
    
}
