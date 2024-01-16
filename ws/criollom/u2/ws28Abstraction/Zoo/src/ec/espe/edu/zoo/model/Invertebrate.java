
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Invertebrate extends Animal {
    private String symmetry;
    private int quantityOfLimbs;
    private String feedType;
    private String habitad;
    private String reproduction;

    public Invertebrate(String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(id, ciemtificName, bornOnDate, cageId);
        this.symmetry = symmetry;
        this.quantityOfLimbs = quantityOfLimbs;
        this.feedType = feedType;
        this.habitad = habitad;
        this.reproduction = reproduction;
    }

    @Override
    public String toString() {
        return "Invertebrate{" +super.toString()+ "symmetry=" + getSymmetry() + ", quantityOfLimbs=" + getQuantityOfLimbs() + ", feedType=" + getFeedType() + ", habitad=" + getHabitad() + ", reproduction=" + getReproduction() + '}';
    }

    /**
     * @return the symmetry
     */
    public String getSymmetry() {
        return symmetry;
    }

    /**
     * @param symmetry the symmetry to set
     */
    public void setSymmetry(String symmetry) {
        this.symmetry = symmetry;
    }

    /**
     * @return the quantityOfLimbs
     */
    public int getQuantityOfLimbs() {
        return quantityOfLimbs;
    }

    /**
     * @param quantityOfLimbs the quantityOfLimbs to set
     */
    public void setQuantityOfLimbs(int quantityOfLimbs) {
        this.quantityOfLimbs = quantityOfLimbs;
    }

    /**
     * @return the feedType
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * @param feedType the feedType to set
     */
    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    /**
     * @return the habitad
     */
    public String getHabitad() {
        return habitad;
    }

    /**
     * @param habitad the habitad to set
     */
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    /**
     * @return the reproduction
     */
    public String getReproduction() {
        return reproduction;
    }

    /**
     * @param reproduction the reproduction to set
     */
    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }
    
    public void specialMove(){
        
    }
    
    public void pair(){
        
    }  
            
    public void establishHabitat(){
        
    }

    @Override
    public void feed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
