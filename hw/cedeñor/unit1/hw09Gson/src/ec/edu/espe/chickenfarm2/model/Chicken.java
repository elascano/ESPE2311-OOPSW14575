
package ec.edu.espe.chickenfarm2.model;

import java.util.Date;

public class Chicken {
     private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + '\n' + "id=" + id + '\n' + "name=" + name +
                '\n' + "color=" + color + '\n' + "age=" + age + '\n' + "isMolting="
                + isMolting + '\n' + "bornOnDate=" + bornOnDate + '\n' + "}";
    }

    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        bornOnDate.setYear(bornOnDate.getYear()-1900);
        this.bornOnDate = bornOnDate;
        this.age=computeAge().getYear();
    }
    
    private Date computeAge(){
        // TODO code, compute agein years using the bornOnDate
        long timeDiff = new Date().getTime() - bornOnDate.getTime();
        Date ageDate = new Date();
        ageDate.setTime(timeDiff);
        ageDate.setYear(ageDate.getYear()-70);
        return ageDate;
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

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
}
