
package ec.edu.espe.zoo.model;
import java.util.Date;

/**
 *
 * @author Ilhan
 */
public abstract class Animal {
    
    private int id;
    private String scientificName;
    private Date bornDate;
    private int cageId;

    public Animal(int id, String scientificName, Date borndateM, int cageId) {
        this.id = id;
        this.scientificName = scientificName;
        this.bornDate = borndateM;
        this.cageId = cageId;
    }

    public void assignCage(int id){
        System.out.println("The cage id is --->"+ id);
        cageId = id;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", scientificName=" + scientificName + ", borndateM=" + bornDate + ", cageId=" + cageId + '}';
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
