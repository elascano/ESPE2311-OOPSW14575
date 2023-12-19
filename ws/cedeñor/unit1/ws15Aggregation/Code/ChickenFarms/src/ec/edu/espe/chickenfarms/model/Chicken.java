package ec.edu.espe.chickenfarms.model;

import java.util.Date;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDay;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", isMolting=" + isIsMolting() + ", bornOnDay=" + getBornOnDay() + '}';
    }

    public void doStuff(int forTime) {
        cluck();
        wander();
        eat();
        drink();
        poop();
        layAnEgg();
    }

    public int computerAge() {
        return 2;
    }

    private void cluck() {
        System.out.println("Chicken " + getId() + " is clucking");
    }

    private void wander() {
        System.out.println("Chicken " + getId() + " is wandering");
    }

    private void eat() {
        System.out.println("Chicken " + getId() + " is eating");
    }

    private void drink() {
        System.out.println("Chicken " + getId() + " is drinking");
    }

    private Poop poop() {
        Poop poop;
        poop = new Poop(1);
        System.out.println("Chicken " + getId() + " is pooping");
        return poop;
    }

    private Egg layAnEgg() {
        Egg egg;
        egg = new Egg(1);
        return egg;
    }

    public Chicken(int id, String name, String color, int age, boolean isMolting, Date bornOnDay) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDay = bornOnDay;
        this.age = computerAge();
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
     * @return the bornOnDay
     */
    public Date getBornOnDay() {
        return bornOnDay;
    }

    /**
     * @param bornOnDay the bornOnDay to set
     */
    public void setBornOnDay(Date bornOnDay) {
        this.bornOnDay = bornOnDay;
    }

}
