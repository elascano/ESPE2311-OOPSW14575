package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Mateo Rogeron, NullPointerException, DCCO - ESPE
 */
public class Chicken {
    private int Id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;

    @Override//clic derecho, generar codigo, toString(imprime atributos)
    public String toString() {
        return "Chicken{" + "Id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", isMolting=" + isIsMolting() + '}';
    }
   
    public Chicken(int Id, String name, String color, int age, boolean isMolting) {
        this.Id = Id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }
    
    public void setId(int Id){
        this.Id = Id;
    }
    
    public int getId(){
        return Id;
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
}
