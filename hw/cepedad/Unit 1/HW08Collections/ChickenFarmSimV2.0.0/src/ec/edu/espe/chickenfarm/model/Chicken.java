package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author IMG_NUC
 */
import java.time.LocalDate;
import java.time.Period;

public class Chicken {
    private int id;
    private String name;
    private String color;
    private LocalDate birthDate;
    private boolean isMolting;

    @Override
    public String toString() {
        int age = calculateAge();
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }
    
    public Chicken(int id, String name, String color, LocalDate birthDate, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
        this.isMolting = isMolting;
    }

    public String toCSV() {
    int age = calculateAge();    
    return id + "," + name + "," + color + "," + birthDate + "," + age + "," + isMolting;
}
     private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}