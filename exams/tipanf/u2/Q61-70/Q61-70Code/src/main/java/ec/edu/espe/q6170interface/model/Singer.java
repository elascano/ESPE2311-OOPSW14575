package ec.edu.espe.q6170interface.model;

/**
 *
 * @author Frederick
 */
public class Singer {
    private int id;
    private String name;
    private float hiringCost;
    private int presentedHours;

    public Singer(int id, String name, float hiringCost, int presentedHours) {
        this.id = id;
        this.name = name;
        this.hiringCost = hiringCost;
        this.presentedHours = presentedHours;
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
     * @return the hiringCost
     */
    public float getHiringCost() {
        return hiringCost;
    }

    /**
     * @param hiringCost the hiringCost to set
     */
    public void setHiringCost(float hiringCost) {
        this.hiringCost = hiringCost;
    }

    /**
     * @return the presentedHours
     */
    public int getPresentedHours() {
        return presentedHours;
    }

    /**
     * @param presentedHours the presentedHours to set
     */
    public void setPresentedHours(int presentedHours) {
        this.presentedHours = presentedHours;
    }
}
