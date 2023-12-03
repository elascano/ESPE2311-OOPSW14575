package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author mateo
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }

    public Chicken(int id, String name, String color, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

}
