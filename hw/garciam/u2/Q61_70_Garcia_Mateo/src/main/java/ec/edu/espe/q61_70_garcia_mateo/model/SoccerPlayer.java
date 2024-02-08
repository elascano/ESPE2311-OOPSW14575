package ec.edu.espe.q61_70_garcia_mateo.model;

/**
 *
 * @author mateo
 */
public class SoccerPlayer {

    private int id;
    private String name;
    private String type;
    private int years;

    public SoccerPlayer(int id, String name, String type, int years) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.years = years;
    }

    public String computeSalary() {
        int salary = 100;
        switch (type) {
            case "pro":
                salary = (years * 2000);
                break;
            case "midLevel":
                salary = (years * 1000);
                break;

            case "amateur":
                salary = (years * 5000);
                break;
        }
        return String.valueOf(salary);
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public int getYears(){
        return this.years;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", type=" + type + '}';
    }

}
