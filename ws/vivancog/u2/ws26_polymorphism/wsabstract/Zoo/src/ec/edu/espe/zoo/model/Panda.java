package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Panda extends Mammal{
    private boolean isFurry;
    private String lifeStage;

    public Panda(boolean isFurry, String lifeStage, int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGlands, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.isFurry = isFurry;
        this.lifeStage = lifeStage;
    }

    @Override
    public String toString() {
        return "Panda{"  + super.toString() + "isFurry=" + isFurry + ", lifeStage=" + lifeStage + '}';
    }
    
    

    /**
     * @return the isFurry
     */
    public boolean isIsFurry() {
        return isFurry;
    }

    /**
     * @param isFurry the isFurry to set
     */
    public void setIsFurry(boolean isFurry) {
        this.isFurry = isFurry;
    }

    /**
     * @return the lifeStage
     */
    public String getLifeStage() {
        return lifeStage;
    }

    /**
     * @param lifeStage the lifeStage to set
     */
    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    @Override
    public void feed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vocalization() {
        System.out.println("The panda have vocalization limited");
    }
    
    
}
