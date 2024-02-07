
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Mateo Rogeron, NullPointerException, DCCO - ESPE
 */
public class Egg {
     private int Id;

    public Egg(int Id) {
        this.Id = Id;
    }
    
    @Override
    public String toString() {
        return "Egg{" + "Id=" + Id + '}';
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }
     
     
     
}


