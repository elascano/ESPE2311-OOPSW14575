package ec.edu.espe.chickenfarm.model;


/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private int BornOnDay;
    private int BornOnMonth;
    private int BornOnYear;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", BornOnDay=" + BornOnDay + ", BornOnMonth=" + BornOnMonth + ", BornOnYear=" + BornOnYear + '}';
    }

    public Chicken(int id, String name, String color, int age, boolean isMolting, int BornOnDay, int BornOnMonth, int BornOnYear) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
        this.BornOnDay = BornOnDay;
        this.BornOnMonth = BornOnMonth;
        this.BornOnYear = BornOnYear;
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

    public boolean getIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public int getBornOnDay() {
        return BornOnDay;
    }

    public void setBornOnDay(int BornOnDay) {
        this.BornOnDay = BornOnDay;
    }

    public int getBornOnMonth() {
        return BornOnMonth;
    }

    public void setBornOnMonth(int BornOnMonth) {
        this.BornOnMonth = BornOnMonth;
    }

    public int getBornOnYear() {
        return BornOnYear;
    }

    public void setBornOnYear(int BornOnYear) {
        this.BornOnYear = BornOnYear;
    }

    
    
    
    
    
    public void doStuff(int forTime){
        
    }
    private void cluck(){
        
    }
    private void wander(){
        
    }
    private void eat(){
        
    }
    private void drink(){
        
    }
    private Poop poop(){
        return null;
    }
    private Egg layAnEgg(){
        return null;
    }
}
