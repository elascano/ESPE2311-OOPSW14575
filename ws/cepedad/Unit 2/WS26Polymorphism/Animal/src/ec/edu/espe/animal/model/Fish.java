package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public abstract class Fish extends Vertebrate {
   private String habitatType;
   private boolean isSaltwater;
   private String speciesName;
   private String fishColor;

    public Fish(String habitatType, boolean isSaltwater, String speciesName, String fishColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.habitatType = habitatType;
        this.isSaltwater = isSaltwater;
        this.speciesName = speciesName;
        this.fishColor = fishColor;
    }

    public void swim(){
        System.out.println("The Fish is swimming");
    }
    
    @Override
    public String toString() {
        return "Fish{" + super.toString() + "habitatType=" + habitatType + ", isSaltwater=" + isSaltwater + ", speciesName=" + speciesName + ", fishColor=" + fishColor + '}';
    }

    /**
     * @return the habitatType
     */
    public String getHabitatType() {
        return habitatType;
    }

    /**
     * @param habitatType the habitatType to set
     */
    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }

    /**
     * @return the isSaltwater
     */
    public boolean isIsSaltwater() {
        return isSaltwater;
    }

    /**
     * @param isSaltwater the isSaltwater to set
     */
    public void setIsSaltwater(boolean isSaltwater) {
        this.isSaltwater = isSaltwater;
    }

    /**
     * @return the speciesName
     */
    public String getSpeciesName() {
        return speciesName;
    }

    /**
     * @param speciesName the speciesName to set
     */
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    /**
     * @return the fishColor
     */
    public String getFishColor() {
        return fishColor;
    }

    /**
     * @param fishColor the fishColor to set
     */
    public void setFishColor(String fishColor) {
        this.fishColor = fishColor;
    }
}
