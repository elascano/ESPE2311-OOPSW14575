
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author WILLIAM
 */
public abstract class Animal {
    private int id;
    private String scietificName;
    private Date BornDate;
    private int cageld;

    public Animal(int id, String scietificName, Date BornDate, int cageld) {
        this.id = id;
        this.scietificName = scietificName;
        this.BornDate = BornDate;
        this.cageld = cageld;
    }
    public abstract void feed();
    
    public void assignCageId(int id ){
        System.out.println("Assigning cage number --> "+ id );
        cageld = id;
    }

    @Override
    public String toString() {
        return "\nAnimal{" + "id=" + id + ", scietificName=" + scietificName + ", BornDate=" + BornDate + ", cageld=" + cageld + '}';
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScietificName() {
        return scietificName;
    }

    public void setScietificName(String scietificName) {
        this.scietificName = scietificName;
    }

    public Date getBornDate() {
        return BornDate;
    }

    public void setBornDate(Date BornDate) {
        this.BornDate = BornDate;
    }

    public int getCageld() {
        return cageld;
    }

    public void setCageld(int cageld) {
        this.cageld = cageld;
    }
    
    
    
}
