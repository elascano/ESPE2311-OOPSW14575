
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public abstract class Animal {
    private int id;
    private String scientificName;
    private Date bornOnDate;
    private int cageId;
    
    public abstract void feed();
    
    public void assignCage(int id){
        System.out.println("assign cage number -->" + id);
        cageId = id;
    }
    
    @Override
    public String toString() {
        return "\n -Animal{" + "id=" + getId() + ", scientificName=" + getScientificName() + ", bornOnDate=" + getBornOnDate() + ", cageId=" + getCageId() + "}";
    }

    public Animal(int id, String scientificName, Date bornOnDate, int cageId) {
        this.id = id;
        this.scientificName = scientificName;
        this.bornOnDate = bornOnDate;
        this.cageId = cageId;
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
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
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
