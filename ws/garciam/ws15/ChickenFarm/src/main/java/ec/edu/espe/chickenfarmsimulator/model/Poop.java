
package ec.edu.espe.chickenfarmsimulator.model;

/**
 *
 * @author mateo
 */
public class Poop {
    private int id;

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
    }

    public Poop(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
