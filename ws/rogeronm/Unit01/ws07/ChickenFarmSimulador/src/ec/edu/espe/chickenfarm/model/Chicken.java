package ec.edu.espe.chickenfarm.model;

import java.util.Date;

/**
 *
 * @author Mateo Rogeron, NullPointerException, DCCO - ESPE
 */
public class Chicken {
   private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", isMolting=" + isIsMolting() + ", bornOnDate=" + getBornOnDate() + '}';
    }
    
    public void doStuff(int forTime){
        cluck();
        eat();
        drink();
        poop();
        wander();
        layAnEgg();
    }
    
    private int computeAge(){
        //Algoritmo para calcular edad 
        return 2;
    }

    private void cluck(){
        System.out.println("chicken " +id + " is clucking");
    
    }
    
    private void wander(){
        System.out.println("chicken " +id + " is wandering");
    }
    
    private void eat(){
        System.out.println("chicken " +id + " is eating");
    }
    
    private void drink(){
        System.out.println("chicken " +id + " is drinking");
    }
    
    private Poop poop(){
        Poop poop;
        poop = new Poop(1);
        System.out.println("is poooping -->" +poop);
        return poop;
    }
    
    private Egg layAnEgg(){
        Egg egg;
        egg = new Egg(1);
        return egg;
    }
    
    
    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        this.age = computeAge();
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

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
}
