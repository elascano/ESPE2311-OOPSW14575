
package ec.edu.espe.chickenfarm.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author MateoCriollo,InterByte,DCCO-ESPE
 */
public class Chicken {

    public static int length() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int id;
    private String name;
    private String color;
    private LocalDate birthday;
    private boolean isMolting;

    public Chicken(int id, String name, String color, LocalDate birthday, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthday = birthday;
        this.isMolting = isMolting;
    }

    public Chicken() {
    
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", birthday=" + birthday + ", isMolting=" + isMolting + '}';
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

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public int  calculateAgeYear(){
        if(birthday !=null){
            LocalDate currentDate = LocalDate.now();
            return Period.between(birthday, currentDate).getYears();
        }else
            return -1;
    }
    
    
}
