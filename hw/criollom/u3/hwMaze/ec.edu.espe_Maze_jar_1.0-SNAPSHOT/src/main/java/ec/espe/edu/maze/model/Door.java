
package ec.espe.edu.maze.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Door implements Square {
    private boolean isEntry;

    public Door(boolean isEntry) {
        this.isEntry = isEntry;
    }

    /**
     * @return the isEntry
     */
    public boolean isIsEntry() {
        return isEntry;
    }

    /**
     * @param isEntry the isEntry to set
     */
    public void setIsEntry(boolean isEntry) {
        this.isEntry = isEntry;
    }
    
    
}
