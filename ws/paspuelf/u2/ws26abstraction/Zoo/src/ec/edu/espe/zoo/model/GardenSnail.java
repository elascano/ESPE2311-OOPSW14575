package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public class GardenSnail extends Mollusk {

    private String shellColor;
    private float slimeTrailLength;

    @Override
    public void feed() {
        System.out.println("Feeding the garden snail with leaves and fruits");
    }

    @Override
    public void move() {
        System.out.println("The garden snail is slowly crawling.");
    }

    public GardenSnail(String shellColor, float slimeTrailLength, String shellType, int numberOfTentacles, String exoskeletonType, int numberOfLegs, int id, String scientificName, Date bornDate, int cageId) {
        super(shellType, numberOfTentacles, exoskeletonType, numberOfLegs, id, scientificName, bornDate, cageId);
        this.shellColor = shellColor;
        this.slimeTrailLength = slimeTrailLength;
    }

    @Override
    public String toString() {
        return "GardenSnail{" + super.toString() + "shellColor=" + shellColor + ", slimeTrailLength=" + slimeTrailLength + '}';
    }

    @Override
    public void produceMucus() {
        System.out.println("The garden snail is producing mucus");
    }

    public void produceMucus(int amount, String unit) {
        System.out.println("The garden snail is producing " + amount + " " + unit + " of mucus.");
    }

    public void retractIntoShell() {
        System.out.println("The garden snail is retracting into its shell");
    }

    public void graze() {
        System.out.println("The garden snail is grazing");
    }

    /**
     * @return the shellColor
     */
    public String getShellColor() {
        return shellColor;
    }

    /**
     * @param shellColor the shellColor to set
     */
    public void setShellColor(String shellColor) {
        this.shellColor = shellColor;
    }

    /**
     * @return the slimeTrailLength
     */
    public float getSlimeTrailLength() {
        return slimeTrailLength;
    }

    /**
     * @param slimeTrailLength the slimeTrailLength to set
     */
    public void setSlimeTrailLength(float slimeTrailLength) {
        this.slimeTrailLength = slimeTrailLength;
    }

}
