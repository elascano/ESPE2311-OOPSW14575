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
    private int bornOnDay;
    private int bornOnMonth;
    private int bornOnYear;

    @Override
    public String toString() {
        return "\n * id = " + id + "\n * name = " + name + "\n * color = " + color + "\n * age = " + age + "\n * isMolting = " + isMolting + "\n * BornOnDay = " + bornOnDay + "\n * BornOnMonth = " + bornOnMonth + "\n * BornOnYear = " + bornOnYear + '}';
    }
    
    public String CSVObjectFormat() {
        return "" + id + ";" + name + ";" + color + ";" + age + ";" + isMolting + ";" + bornOnDay + ";" + bornOnMonth + ";" + bornOnYear + "\n";
    } 
    
    public Chicken(int id, String name, String color, int age, boolean isMolting, int BornOnDay, int BornOnMonth, int BornOnYear) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
        this.bornOnDay = BornOnDay;
        this.bornOnMonth = BornOnMonth;
        this.bornOnYear = BornOnYear;
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
        return bornOnDay;
    }

    public void setBornOnDay(int BornOnDay) {
        this.bornOnDay = BornOnDay;
    }

    public int getBornOnMonth() {
        return bornOnMonth;
    }

    public void setBornOnMonth(int BornOnMonth) {
        this.bornOnMonth = BornOnMonth;
    }

    public int getBornOnYear() {
        return bornOnYear;
    }

    public void setBornOnYear(int BornOnYear) {
        this.bornOnYear = BornOnYear;
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
