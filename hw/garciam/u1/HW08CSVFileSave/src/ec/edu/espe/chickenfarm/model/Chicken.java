package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author mateo
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private String bornOnDate;
    
    DateHandler dateHandler = new DateHandler();

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + '}';
    }
    
    public String CSVObjectFormat(){
        return "" + id + "," + name + "," + color + "," + age + "," + isMolting + "," + bornOnDate + "\n" ;
    }

    public Chicken(int id, String name, String color, boolean isMolting, String bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = dateHandler.computeAge(bornOnDate);
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }




}
