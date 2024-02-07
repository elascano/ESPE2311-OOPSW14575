package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Animal {
    private int id;
    private String scientificName;
    private Date bornOnDate;
    private int cageId;

    @Override
    public String toString() {
        return "\n - Animal{" + "id=" + id + ", scientificName=" + scientificName + ", bornOnDate=" + bornOnDate + ", cageId=" + cageId + "}\n";
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
