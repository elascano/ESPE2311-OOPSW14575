
package ec.edu.espe.dinosaur.model;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Dinosaur {
    private int id;
    private String name;
    private String color;
    private int age;
    

    @Override
    public String toString() {
        return "Dinosaur{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + '}';
    }
    
  
    public Dinosaur(int id, String name, String color, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
   
    
    
    
}
