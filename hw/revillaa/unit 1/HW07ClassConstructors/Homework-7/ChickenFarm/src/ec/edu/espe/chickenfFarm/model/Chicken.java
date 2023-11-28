package ec.edu.espe.chickenfFarm.model;

/**
 *
 * @author Antonio Revilla 
 */
public class Chicken {  
    int id;
    String name;
    String color;
    int age;
    boolean isMolting;

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
