
import java.util.Date;


/**
 *
 * @author Juan Granda
 */
public class Persons {
    private int id;
    private String firstName;
    private String lastName;
    private Date Birthirte;

    public Persons(int id, String firstName, String lastName, Date Birthirte) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Birthirte = Birthirte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthirte() {
        return Birthirte;
    }

    public void setBirthirte(Date Birthirte) {
        this.Birthirte = Birthirte;
    }
    
    
}
