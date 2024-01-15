package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Tuna extends Fish{
    private int swimSpeed;
    
    public void thermoregulate(){
        System.out.println("The Tuna is thermoregulating");
    }

    public Tuna(int swimSpeed, boolean itHasScales, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(itHasScales, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public String toString() {
        return "Tuna{" +super.toString() + "swimSpeed=" + getSwimSpeed() + '}';
    }

    /**
     * @return the swimSpeed
     */
    public int getSwimSpeed() {
        return swimSpeed;
    }

    /**
     * @param swimSpeed the swimSpeed to set
     */
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

}
