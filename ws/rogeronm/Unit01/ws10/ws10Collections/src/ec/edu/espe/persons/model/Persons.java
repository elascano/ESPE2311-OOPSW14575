package ec.edu.espe.persons.model;


/**
 *
 * @author Mateo Rogeron, NullPointerException, DCCO - ESPE
 */
public class Persons {
    private int id;
    private String firtsName;
    private String lastName;

    @Override
    public String toString() {
        return "Persons{" + "id=" + id + ", firtsName=" + firtsName + ", lastName=" + lastName + ", contact=" + contact + '}';
    }
    private String contact;

    public Persons(int id, String firtsName, String lastName, String contact) {
        this.id = id;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
   
    
}


