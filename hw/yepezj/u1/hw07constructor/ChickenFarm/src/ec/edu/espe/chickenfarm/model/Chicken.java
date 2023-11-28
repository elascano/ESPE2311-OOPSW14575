package ec.edu.espe.chickenfarm.model;


/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
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
    
    
    
    public void doStuff(int forTime){
        
    }
    private void cluck(){
        
    }
    private void wander(){
        
    }
    private void eat(){
        
    }
    private void drink(){
        
    }
    private Poop poop(){
        return null;
    }
    private Egg layAnEgg(){
        return null;
    }
}
