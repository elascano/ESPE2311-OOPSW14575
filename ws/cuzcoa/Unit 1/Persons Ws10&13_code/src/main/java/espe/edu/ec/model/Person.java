
package espe.edu.ec.model;
import java.util.Date;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Person {  
    
    int id;
    String FirstName;
    String LastName;
    Date BirthDate;  
 
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", BirthDate=" + BirthDate + '}';
    }

    public Person(int id, String FirstName, String LastName, Date BirthDate) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date Birthday) {
        this.BirthDate = Birthday;
    }
                
    
    
}
