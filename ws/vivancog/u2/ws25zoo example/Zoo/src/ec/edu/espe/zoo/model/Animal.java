package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
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

    @Override
    public String toString() {
        return "\n -Animal{" + "id=" + id + ", scientificName=" + scientificName + ", bornDate=" + bornDate + ", cageId=" + cageId + "}\n";
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public int getCageId() {
        return cageId;
    }

    public void setCageId(int cageId) {
        this.cageId = cageId;
    }
    
    
}
