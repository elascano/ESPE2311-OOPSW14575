package ec.edu.espe.arraylist.model;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Employee {
    private int id;
    private String name;
    private float hourlyWage;

    @Override
    public String toString() {
        return "\n * id=" + id + "\n  name = " + name + "\n  hourlyWage = " + hourlyWage ;
    }

    public Employee(int id, String name, float hourlyWage) {
        this.id = id;
        this.name = name;
        this.hourlyWage = hourlyWage;
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
     * @return the hourlyWage
     */
    public float getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
    
}
