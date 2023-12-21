
package ec.edu.espe.chickenfarm.model;
import java.util.Date;
/**
 *
 * @author CarlosÑato,java,DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date borOnDate;
    
    public Chicken(int id, String name, String color, int age, boolean isMolting, Date borOnDate, int computerAge) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
        this.borOnDate = borOnDate;
        this.age = computeAge();
    }

    //Chcoop tenga varias gallinas
    public void doStuuf(int forTime){
        cluck();
        eat();
        wander();
        poop();
        layAnEgg();
   
    }
    
    private void cluck(){
        System.out.println("chicken" + id + "is clucking");

    }
    private void eat(){
        System.out.println("chicken" + id + "is  eating");

    }
    private void wander(){
        System.out.println("chicken" + id + "is wandering");

    }

    private void drink(){
        System.out.println("chicken" + id + "is drinking");

    }
    private Poop poop(){
        Poop  poop; 
        poop = new Poop(1);
        System.out.println("Pooping -->" + poop); //esta mal hacer esto
        return poop;

    }
    //´ruebas de unidad
    private Egg layAnEgg(){
        Egg egg;
        egg = new Egg(1);
        return egg;
    }
    
    private int computeAge(){
        return 2;
    
    
    }
        @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", borOnDate=" + '}';
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
     * @return the borOnDate
     */
    public Date getBorOnDate() {
        return borOnDate;
    }

    /**
     * @param borOnDate the borOnDate to set
     */
    public void setBorOnDate(Date borOnDate) {
        this.borOnDate = borOnDate;
    }

    

 
   
    
}
