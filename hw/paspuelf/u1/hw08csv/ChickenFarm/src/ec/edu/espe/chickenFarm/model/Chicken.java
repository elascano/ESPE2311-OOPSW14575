<<<<<<< HEAD
package ec.edu.espe.chickenFarm.model;

import ec.edu.espe.chickenFarm.utils.Date;



/**
 *
 * @author Olivier Paspuel
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private Date bornOn;
    private boolean isMolting;

    public Chicken(int id, String name, String color, boolean isMolting, int bornOnYears, int bornOnMonth, int bornOnDay) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOn = new Date(bornOnYears, bornOnMonth, bornOnDay);
        this.isMolting = isMolting;
                this.age = new Date().calculateAge(bornOn);

    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", bornOn=" + bornOn + ", isMolting=" + isMolting + '}';
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
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
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

    public String toCsvString() {
        return id +(",")+ name +(",")+  color +(",")+ age +(",")+ bornOn +(",")+ isMolting;
    }
    
    



}
=======
package ec.edu.espe.chickenFarm.model;

import ec.edu.espe.chickenFarm.utils.Date;



/**
 *
 * @author Olivier Paspuel
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private Date bornOn;
    private boolean isMolting;

    public Chicken(int id, String name, String color, boolean isMolting, int bornOnYears, int bornOnMonth, int bornOnDay) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOn = new Date(bornOnYears, bornOnMonth, bornOnDay);
        this.isMolting = isMolting;
                this.age = new Date().calculateAge(bornOn);

    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", bornOn=" + bornOn + ", isMolting=" + isMolting + '}';
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
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
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

    public String toCsvString() {
        return id +(",")+ name +(",")+  color +(",")+ age +(",")+ bornOn +(",")+ isMolting;
    }
    
    



}
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
