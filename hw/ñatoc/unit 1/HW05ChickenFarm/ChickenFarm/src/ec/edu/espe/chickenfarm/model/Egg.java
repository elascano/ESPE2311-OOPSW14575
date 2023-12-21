
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author CarlosÑato,Error 404,DCCO-ESPE
 */
public class Egg {
    private int id;

    public Egg(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
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
