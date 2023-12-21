
package ec.edu.espe.model;

import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author mateo
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private LocalDate birthDate;
    private boolean isMolting;
    private int age;

    public Chicken(int id, String name, String color, LocalDate birthDate, boolean isMolting, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
        this.isMolting = isMolting;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", birthDate=" + birthDate + ", isMolting=" + isMolting + ", age=" + age + '}';
    }


   

   
       public int calculateAge() {
        // Obtener el año actual
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // Calcular la edad restando el año de nacimiento al año actual
        return currentYear - getAge();
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
     * @return the birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
 }
    
