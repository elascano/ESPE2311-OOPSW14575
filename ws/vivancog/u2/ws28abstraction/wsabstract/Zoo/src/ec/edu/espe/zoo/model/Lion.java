package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Lion extends Mammal{
    private boolean haveMane;
    private String furPattern;

    public Lion(boolean haveMane, String furPattern, int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGlands, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.haveMane = haveMane;
        this.furPattern = furPattern;
    }

    @Override
    public String toString() {
        return "Lion{" +super.toString()+ "haveMane=" + haveMane + ", furPattern=" + furPattern + '}';
    }
    
    

    /**
     * @return the haveMane
     */
    public boolean isHaveMane() {
        return haveMane;
    }

    /**
     * @param haveMane the haveMane to set
     */
    public void setHaveMane(boolean haveMane) {
        this.haveMane = haveMane;
    }

    /**
     * @return the furPattern
     */
    public String getFurPattern() {
        return furPattern;
    }

    /**
     * @param furPattern the furPattern to set
     */
    public void setFurPattern(String furPattern) {
        this.furPattern = furPattern;
    }

    @Override
    public void feed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vocalization() {
        System.out.println("The lion roar");
    }
    
    
}
