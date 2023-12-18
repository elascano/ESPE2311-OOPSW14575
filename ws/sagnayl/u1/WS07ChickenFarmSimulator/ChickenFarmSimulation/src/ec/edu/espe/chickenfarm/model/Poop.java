package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Luis Sagnay
 */
public class Poop {
    private int id;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poop{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    public Poop(int id) {
        
        this.id = id;
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
    
    
}
