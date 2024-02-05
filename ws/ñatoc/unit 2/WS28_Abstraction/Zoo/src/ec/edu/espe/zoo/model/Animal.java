
package ec.edu.espe.zoo.model;

import java.util.Date;


/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public abstract class Animal {
    private int id;
    private String cientificName;
    private Date bornDate;
    private int cageId;

    public Animal(int id, String cientificName, Date bornDate, int cageId) {
        this.id = id;
        this.cientificName = cientificName;
        this.bornDate = bornDate;
        this.cageId = cageId;
    }


    
    public abstract void feed();
    
    public int computerAgeMonths(){
        int age=3;
        return age;
    };
    
     public void assignCage(int id){
        System.out.println("assigning cage number " + id);
        cageId = id;
    }
     
    @Override
    public String toString() {
        return "\n-Animal{" + "id=" + id + ", cientificName=" + cientificName + ", bornDate=" + bornDate + ", cageId=" + cageId + "}\n";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCientificName() {
        return cientificName;
    }

    public void setCientificName(String cientificName) {
        this.cientificName = cientificName;
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
