package ec.edu.espe.dailyDevHM.model;

/**
 *
 * @author revil
 */
public class Developers {
    private int id;
    private String role = "Developer"; 
    private String name;
    private String programmingLenguaje;

    public Developers(int id, String name, String programmingLenguaje) {
        this.id = id;
        this.name = name;
        this.programmingLenguaje = programmingLenguaje;
    }

    @Override
    public String toString() {
        return "Developer{" + "id :" + id + ", role :" + role + ", name :" + name + ", programmingLenguaje :" + programmingLenguaje + '}';
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
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the programmingLenguaje
     */
    public String getProgrammingLenguaje() {
        return programmingLenguaje;
    }

    /**
     * @param programmingLenguaje the programmingLenguaje to set
     */
    public void setProgrammingLenguaje(String programmingLenguaje) {
        this.programmingLenguaje = programmingLenguaje;
    }
    
    
    
}
