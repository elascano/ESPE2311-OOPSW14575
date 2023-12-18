
package ec.edu.espe.persons.model;

/**
 *
 * @author MateoCriollo/InterByte/DCCO-ESPE
 */
public class Person {
    private int id;
    private String Name;
    private String phoneNumber;
    private String email;

    public Person(int id, String Name, String phoneNumber, String email) {
        this.id = id;
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("id=").append(getId());
        sb.append(", Name=").append(getName());
        sb.append(", phoneNumber=").append(getPhoneNumber());
        sb.append(", email=").append(getEmail());
        sb.append('}');
        return sb.toString();
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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}