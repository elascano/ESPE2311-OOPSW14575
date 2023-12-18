
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Juan Granda
 */
public class Poop {
    private int id;

    public Poop(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
    }
    
}
