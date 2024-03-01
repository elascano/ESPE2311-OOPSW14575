package ec.edu.espe.organivent.model;


/**
 *
 * @author Gabriel Vivanco
 */
public class Actor  {
    String name;
    float wage;
    int id;

    public Actor(String name, float wage, int id) {
        this.name = name;
        this.wage = wage;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
