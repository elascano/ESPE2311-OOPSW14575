package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public class Mollusk extends Invertebrate {

    private String shellType;
    private int numberOfTentacles;

    public Mollusk(String shellType, int numberOfTentacles, String exoskeletonType, int numberOfLegs, int id, String scientificName, Date bornDate, int cageId) {
        super(exoskeletonType, numberOfLegs, id, scientificName, bornDate, cageId);
        this.shellType = shellType;
        this.numberOfTentacles = numberOfTentacles;
    }

    @Override
    public String toString() {
        return "Mollusk{" + super.toString() + "shellType=" + shellType + ", numberOfTentacles=" + numberOfTentacles + '}';
    }

    public void produceMucus() {
        System.out.println("The mollusk is producing mucus");
    }

    public void swim() {
        System.out.println("The mollusk is swimming");
    }

    /**
     * @return the shellType
     */
    public String getShellType() {
        return shellType;
    }

    /**
     * @param shellType the shellType to set
     */
    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    /**
     * @return the numberOfTentacles
     */
    public int getNumberOfTentacles() {
        return numberOfTentacles;
    }

    /**
     * @param numberOfTentacles the numberOfTentacles to set
     */
    public void setNumberOfTentacles(int numberOfTentacles) {
        this.numberOfTentacles = numberOfTentacles;
    }

}
