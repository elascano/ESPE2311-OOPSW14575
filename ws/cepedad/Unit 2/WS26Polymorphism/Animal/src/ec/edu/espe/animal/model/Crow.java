package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Crow extends Birds {
    private boolean isClever;
    private String forageArea;

    public Crow(boolean isClever, String forageArea, String speciesName, boolean isMigratory, String birdColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(speciesName, isMigratory, birdColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.isClever = isClever;
        this.forageArea = forageArea;
    }

    @Override
    public void migrate(){
        System.out.println("Crow is migrating");
    }
    
    public void migrate(int id){
        System.out.println("Crow " + id + " is migrating");
    }
    
    @Override
    public String toString() {
        return "Crow{" + super.toString() + "isClever=" + isClever + ", forageArea=" + forageArea + '}';
    }

    /**
     * @return the isClever
     */
    public boolean isIsClever() {
        return isClever;
    }

    /**
     * @param isClever the isClever to set
     */
    public void setIsClever(boolean isClever) {
        this.isClever = isClever;
    }

    /**
     * @return the forageArea
     */
    public String getForageArea() {
        return forageArea;
    }

    /**
     * @param forageArea the forageArea to set
     */
    public void setForageArea(String forageArea) {
        this.forageArea = forageArea;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Crow with meat");
    }
    
}
