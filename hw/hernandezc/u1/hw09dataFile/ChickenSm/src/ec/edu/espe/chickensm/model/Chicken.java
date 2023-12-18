package ec.edu.espe.chickensm.model;

/**
 *
 * @author Carlos
 */
public class Chicken {
     private int id;
    private String name;
    private String color;
    private Datee birthDate;
    private int age;
    private boolean isMolting;

    @Override
    public String toString() {
        return "\n   id ---> " + getId() + "\n   name ---> " + getName() + "\n   birth date ---> " + getBirthDate() +"\n   age ---> " + getAge() + "\n   color ---> " + getColor() + "\n   isMolting ---> " + getIsMolting() + "\n";
    }

    public Chicken(int id, String name, String color, Datee birthDate , int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate=birthDate;
        this.age = age;
        this.isMolting = isMolting;
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
    public boolean getIsMolting() {
        return isIsMolting();
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    /**
     * @return the birthDate
     */
    public Datee getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Datee birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }
}
