package ec.edu.espe.universities.model;



/**
 *
 * @author Juan Granda
 */
public class Universities {
    private int id ;
    private String name;
    private String location;

    public Universities(int id, String name, String lacation) {
        this.id = id;
        this.name = name;
        this.location = lacation;
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

    public String getLacation() {
        return location;
    }

    public void setLacation(String lacation) {
        this.location = lacation;
    }

    @Override
    public String toString() {
        return "Universities{" + "id=" + id + ", name=" + name + ", location=" + location + '}';
    }
    
}
