package ec.edu.espe.organivent.model;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO
 * ESPE
 */
public abstract class Person {
    
    private int id;
    private String name;
    private float wage;

    public Person(int id, String name, float wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }
    
    public Person(){}

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
     * @return the wage
     */
    public float getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(float wage) {
        this.wage = wage;
    }
    
    
    
}
