
package ec.edu.espe.contact.model;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class User {

    private int  id;
    private String Name;
    private String email;

    public User(int id, String Name, String email) {
        this.id = id;
        this.Name = Name;
        this.email = email;
    }
    

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", Name=" + Name + ", email=" + email + '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

 

    
    
    
    
}