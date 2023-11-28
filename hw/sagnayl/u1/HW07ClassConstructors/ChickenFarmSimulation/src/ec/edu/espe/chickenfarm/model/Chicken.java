package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Luis Sagnay
 */
public class Chicken {
    public int id;
    public String name;
    public String color;
    public int age;
    public boolean isMolting;

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
    
    
}
