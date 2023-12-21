package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Luis Sagnay
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int days;
    private int months;
    private int years;
    private boolean isMolting;

    public Chicken(int id, String name, String color, int days, int months, int years, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.days = days;
        this.months = months;
        this.years = years;
        this.isMolting = isMolting;
    }

  
    public String toCSVString() {
        return getId() + "," + getName() + "," + getColor() + "," + getDays()+ "," + getMonths()+ "," + getYears() + "," + isIsMolting();
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
     * @return the days
     */
    public int getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * @return the months
     */
    public int getMonths() {
        return months;
    }

    /**
     * @param months the months to set
     */
    public void setMonths(int months) {
        this.months = months;
    }

    /**
     * @return the years
     */
    public int getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(int years) {
        this.years = years;
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