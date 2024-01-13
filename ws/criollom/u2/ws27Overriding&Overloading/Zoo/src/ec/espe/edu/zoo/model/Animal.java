
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Animal {
    private int id;
    private String ciemtificName;
    private Date bornOnDate;
    private int cageId;

    public Animal(int id, String ciemtificName, Date bornOnDate, int cageId) {
        this.id = id;
        this.ciemtificName = ciemtificName;
        this.bornOnDate = bornOnDate;
        this.cageId = cageId;
    }

    @Override
    public String toString() {
        return "\n-Animal{" + "id=" + id + ", ciemtificName=" + ciemtificName + ", bornOnDate=" + bornOnDate + ", cageId=" + cageId + "}\n";
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
     * @return the ciemtificName
     */
    public String getCiemtificName() {
        return ciemtificName;
    }

    /**
     * @param ciemtificName the ciemtificName to set
     */
    public void setCiemtificName(String ciemtificName) {
        this.ciemtificName = ciemtificName;
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
