/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public abstract class Arthropods extends Invertebrate{
    
    private boolean isAquatic;
    private int numberOfLegs;

    @Override
    public String toString() {
        return "Arthropods{" + super.toString()+ "isAquatic=" + isAquatic + ", numberOfLegs=" + numberOfLegs + '}';
    }
    
    /**
     * @return the isAquatic
     */
    public boolean isIsAquatic() {
        return isAquatic;
    }

    /**
     * @param isAquatic the isAquatic to set
     */
    public void setIsAquatic(boolean isAquatic) {
        this.isAquatic = isAquatic;
    }

    /**
     * @return the numberOfLegs
     */
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    /**
     * @param numberOfLegs the numberOfLegs to set
     */
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    

    public Arthropods(int id, String scientificName, Date borndateM, int cageId) {
        super(id, scientificName, borndateM, cageId);
    }
   
}
