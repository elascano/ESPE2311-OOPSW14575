
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public abstract class Animal {
    private int id;
    private String scientificName;
    private Date bornDate;
    private int cageId;

    public Animal(int id, String scientificName, Date bornDate, int cageId) {
        this.id = id;
        this.scientificName = scientificName;
        this.bornDate = bornDate;
        this.cageId = cageId;
    }
    
    
    public abstract void feed();
    
    public void assignCage(int id ){
        System.out.println("assigned cage to " + id);
        this.cageId = id;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", scientificName=" + scientificName + ", bornDate=" + bornDate + ", cageId=" + cageId + '}' + '\n';
    }
    
    
    
}
