package ec.edu.espe.child.model;

/**
 *
 * @author Luis Sagnay
 */
public class School {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "School{" + "id=" + getId() + ", name=" + getName() + '}';
    }

    public School(int id, String name) {
        this.id = id;
        this.name = name;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
