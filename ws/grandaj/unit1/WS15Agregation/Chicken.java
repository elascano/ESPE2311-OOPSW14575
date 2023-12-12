
package ec.edu.espe.chickenfarm.model;

import java.util.Date;

/**
 *
 * @author IMG_NUC
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date borOnDate;

    public Chicken(int id, String name, String color, int age, boolean isMolting, Date borOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.borOnDate = borOnDate;
        this.age = computeAge();
        //hacer esta funcion en la casa
    }

    public void doStuff(int forTime){
        cluck();
        eat();
        drink();
        poop();
        wander();
        layAnEgg();
        
        
        
        
    }
    private void cluck(){
        System.out.println("chiken" + id + "is clucking");
    }
    private void eat(){
        System.out.println("chiken" + id + "is eating");
    }
    private void wander(){
        System.out.println("chiken" + id + "is wandering");
    }
    private void drink(){
        System.out.println("chiken" + id + "is drinking");
    }
    private Poop poop(){
        Poop poop;
        poop = new Poop(id);
        System.out.println("Pooping-->" + poop);
        return new Poop(id);
    }
    private Egg layAnEgg(){
        Egg egg;
        egg = new Egg(1);
        return new Egg(id);
    }
    private int computeAge(){
        return 2;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", borOnDate=" + borOnDate + '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public Date getBorOnDate() {
        return borOnDate;
    }

    public void setBorOnDate(Date borOnDate) {
        this.borOnDate = borOnDate;
    }
    
}
