
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Ilhan Rogel
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int birthday;
    private int birthmonth;
    private int birthyear;
    private int age;
    private boolean isMolting;
public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    public int getDay() {
        return birthday;
    }

    public int getMonth() {
        return birthmonth;
    }

    public int getYear() {
        return birthyear;
    }

    public int getAge() {
        return age;
    }

    public boolean isMolting() {
        return isMolting;
    }

    @Override
    public String toString() {
        return "Chicken{" + " id=" + id + ", name=" + name + ", color=" + color + ", birthdate= "+ birthday + " " + birthmonth + " " + birthyear  + ", age=" + age + ", isMolting=" + isMolting + '}';
    }

    public Chicken(int id, String name, String color,int day,int month,int year, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
        this.birthday = day;
        this.birthmonth = month;
        this.birthyear = year;
    }
    
}
