package ec.edu.espe.actors.model;

/**
 *
 * @author G306M01
 */
public class Actor {
    private int id;
    private String name;
    private float HourlyWage;
    private int daysWork;
    private float totalCost;

    public Actor(int id, String name, float HourlyWage, int daysWork, float totalCost) {
        this.id = id;
        this.name = name;
        this.HourlyWage = HourlyWage;
        this.daysWork = daysWork;
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Actor{" + "id=" + id + ", name=" + name + ", HourlyWage=" + HourlyWage + ", daysWork=" + daysWork + ", totalCost=" + totalCost + '}';
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
     * @return the HourlyWage
     */
    public float getHourlyWage() {
        return HourlyWage;
    }

    /**
     * @param HourlyWage the HourlyWage to set
     */
    public void setHourlyWage(float HourlyWage) {
        this.HourlyWage = HourlyWage;
    }

    /**
     * @return the daysWork
     */
    public int getDaysWork() {
        return daysWork;
    }

    /**
     * @param daysWork the daysWork to set
     */
    public void setDaysWork(int daysWork) {
        this.daysWork = daysWork;
    }

    /**
     * @return the totalCost
     */
    public float getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
}
