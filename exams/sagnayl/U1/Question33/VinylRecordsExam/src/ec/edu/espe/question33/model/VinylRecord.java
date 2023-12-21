package ec.edu.espe.question33.model;

/**
 *
 * @author Luis Sagnay
 */
public class VinylRecord {
    private int id;
    private int diameter;
    private int memory;

    public VinylRecord(int id, int diameter, int memory) {
        this.id = id;
        this.diameter = diameter;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "VinylRecord{" + "id=" + getId() + ", diameter=" + getDiameter() + ", memory=" + getMemory() + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the diameter
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the memory
     */
    public int getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    
}
