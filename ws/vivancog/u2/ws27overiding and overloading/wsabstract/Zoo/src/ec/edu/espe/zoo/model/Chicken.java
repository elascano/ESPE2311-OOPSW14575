package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Chicken extends Birds{
    private String color;
    private boolean isMolting;
    
    @Override
    public void vocalization() {
        System.out.println("The chicken is cackling"); 
    }

    public Chicken(String color, boolean isMolting, int wings, String feathers, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(wings, feathers, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.color = color;
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        return "Chicken{" +super.toString()+ "color=" + color + ", isMolting=" + isMolting + '}';
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
