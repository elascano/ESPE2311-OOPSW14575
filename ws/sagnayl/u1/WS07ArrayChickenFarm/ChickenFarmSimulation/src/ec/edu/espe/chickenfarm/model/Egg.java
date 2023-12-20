package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Luis Sagnay
 */
public class Egg {
    private int id;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Egg{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
    
    public Egg(int id) {
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
