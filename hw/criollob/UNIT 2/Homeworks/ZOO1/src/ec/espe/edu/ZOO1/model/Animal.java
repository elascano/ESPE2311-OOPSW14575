package ec.espe.edu.ZOO1.model;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Animal {
    private int id;
    private String scientificName;
    private Date bornDate;
    private int cageId;

    public Animal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + getId() + ", scientificName=" + getScientificName() + ", bornDate=" + getBornDate() + ", cageId=" + getCageId() + '}';
    }

    public Animal(int id, String scientificName, Date bornDate, int cageId) {
        this.id = id;
        this.scientificName = scientificName;
        this.bornDate = bornDate;
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
