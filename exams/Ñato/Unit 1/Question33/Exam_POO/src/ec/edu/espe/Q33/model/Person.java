
package ec.edu.espe.Q33.model;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Person {
    private int id;
    private String name;
    private String country;

    public Person(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
    

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", country=" + country + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    


    
    
    


 
    
}
