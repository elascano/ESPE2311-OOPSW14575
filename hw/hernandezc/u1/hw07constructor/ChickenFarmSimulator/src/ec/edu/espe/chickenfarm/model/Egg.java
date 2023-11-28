
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Carlos
 */
public class Egg {
    private int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    
    
}
