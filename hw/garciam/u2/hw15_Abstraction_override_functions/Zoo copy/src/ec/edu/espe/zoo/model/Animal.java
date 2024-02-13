
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
    
    public void cleanCage(){
        System.out.println("Clean cage --> " + this.cageId);
    }
    
    public abstract boolean checkByAZoologist (int zoologistId );

    @Override
    public String toString() {
        return "Animal{"  +  "id=" + id + ", scientificName=" + scientificName + ", bornDate=" + bornDate + ", cageId=" + cageId + '}';
    }
}
