
package ec.espe.edu.maze.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Movement {
    private int movementX;
    private int movementY;

    public Movement(int movementX, int movementY) {
        this.movementX = movementX;
        this.movementY = movementY;
    }

    /**
     * @return the movementX
     */
    public int getMovementX() {
        return movementX;
    }

    /**
     * @param movementX the movementX to set
     */
    public void setMovementX(int movementX) {
        this.movementX = movementX;
    }

    /**
     * @return the movementY
     */
    public int getMovementY() {
        return movementY;
    }

    /**
     * @param movementY the movementY to set
     */
    public void setMovementY(int movementY) {
        this.movementY = movementY;
    }
    
    
}
