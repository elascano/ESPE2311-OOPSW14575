
package ec.espe.edu.maze.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Room implements Square{
    private boolean isWall;
    private boolean wasCrossed;

    public Room(boolean isWall, boolean wasCrossed) {
        this.isWall = isWall;
        this.wasCrossed = wasCrossed;
    }

    /**
     * @return the isWall
     */
    public boolean isIsWall() {
        return isWall;
    }

    /**
     * @param isWall the isWall to set
     */
    public void setIsWall(boolean isWall) {
        this.isWall = isWall;
    }

    /**
     * @return the wasCrossed
     */
    public boolean isWasCrossed() {
        return wasCrossed;
    }

    /**
     * @param wasCrossed the wasCrossed to set
     */
    public void setWasCrossed(boolean wasCrossed) {
        this.wasCrossed = wasCrossed;
    }
    
    
}
