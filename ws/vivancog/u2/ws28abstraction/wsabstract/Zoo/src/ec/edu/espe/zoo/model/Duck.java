package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Duck extends Birds{
    private String color;
    private int pups;

    public Duck(String color, int pups, int wings, String feathers, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(wings, feathers, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.color = color;
        this.pups = pups;
    }

    @Override
    public String toString() {
        return "Duck{" +super.toString()+ "color=" + color + ", pups=" + pups + '}';
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
     * @return the pups
     */
    public int getPups() {
        return pups;
    }

    /**
     * @param pups the pups to set
     */
    public void setPups(int pups) {
        this.pups = pups;
    }

    @Override
    public void vocalization() {
        System.out.println("The duck quacks");
    }
    
    

}
