package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author David
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
    
    public void assignCage(int id){
        System.out.println("assigning cage number " + id);
        cageId = id;
    }
    
    @Override
    public String toString() {
        return "\n - Animal{" + "id=" + id + ", scientificName=" + scientificName + ", bornDate=" + bornDate + ", cageId=" + cageId + '}';
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

    /**
     * @return the scientificName
     */
    public String getScientificName() {
        return scientificName;
    }

    /**
     * @param scientificName the scientificName to set
     */
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    /**
     * @return the bornDate
     */
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * @param bornDate the bornDate to set
     */
    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    /**
     * @return the cageId
     */
    public int getCageId() {
        return cageId;
    }

    /**
     * @param cageId the cageId to set
     */
    public void setCageId(int cageId) {
        this.cageId = cageId;
    }
    
    
    
}
