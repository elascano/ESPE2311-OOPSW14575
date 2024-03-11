
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Ant extends Arthropods{
    
    private String colonyType;
    private String queenStatus;

    @Override
    public String toString() {
        return "Ant{" + super.toString() +"colonyType=" + colonyType + ", queenStatus=" + queenStatus + '}';
    }
    
    /**
     * @return the colonyType
     */
    public String getColonyType() {
        return colonyType;
    }

    /**
     * @param colonyType the colonyType to set
     */
    public void setColonyType(String colonyType) {
        this.colonyType = colonyType;
    }

    /**
     * @return the queenStatus
     */
    public String getQueenStatus() {
        return queenStatus;
    }

    /**
     * @param queenStatus the queenStatus to set
     */
    public void setQueenStatus(String queenStatus) {
        this.queenStatus = queenStatus;
    }

    public Ant(String colonyType, String queenStatus, int id, String scientificName, Date borndateM, int cageId) {
        super(id, scientificName, borndateM, cageId);
        this.colonyType = colonyType;
        this.queenStatus = queenStatus;
    }

    @Override
    public void locomotion() {
        System.out.println("Ants locomotion consist of alternating their legs while moving");
    }

}
