package ec.edu.espe.chickenfarmsimulator.model;

import java.util.Date;

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
    private Date bornOnDate;

    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = computeAge();
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
    }

    public void doStuff(int forTime) {
        cluck();
        eat();
        drink();
        poop();
        wander();
        layAnEgg();
    }

    private void cluck() {
        System.out.println("Chicken " + id + " is clucking");
    }

    private void wander() {
        System.out.println("Chicken " + id + " is wandering");
    }

    private void eat() {
        System.out.println("Chicken " + id + " is eating");
    }

    private void drink() {
        System.out.println("Chicken " + id + " is drinking");
    }
    
    private Poop poop(){
        Poop myPoop = new Poop(1);
        System.out.println("chicken " + id + " is pooping " + myPoop);
        return myPoop;
    }
    
    private Egg layAnEgg(){
        Egg egg = new Egg(1);
        return egg;
    }
    
    private int computeAge(){
        //TODO: 
        return 2;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

}
