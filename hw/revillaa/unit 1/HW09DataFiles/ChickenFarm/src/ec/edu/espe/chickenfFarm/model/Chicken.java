package ec.edu.espe.chickenfFarm.model;
import ec.edu.espe.chickenFarm.utilities.AgeCalculator;
import java.time.LocalDate;
/**
 *
 * @author Antonio Revilla 
 */

public class Chicken {
    private int id;
    private String name;
    private String color;
    private LocalDate birthDate;
    private String age;
    private boolean isMolting;

    public Chicken(int id, String name, String color, LocalDate birthDate, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
        this.age = AgeCalculator.calculateAgeFromBirthdate(birthDate);
        this.isMolting = isMolting;
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

    public String getAge() {
        return age;
    }

    public boolean isMolting() {
        return isMolting;
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

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        this.age = AgeCalculator.calculateAgeFromBirthdate(birthDate);
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        return "Chicken {" +
                "" + id +
                ", " + name + '\'' +
                ", " + color + '\'' +
                ", " + age + '\'' +
                ", " + isMolting +
                '}';
    }
}
