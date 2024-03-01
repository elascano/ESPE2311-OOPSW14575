
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public abstract class Invertebrate extends Animal{

    private boolean hasExosqueleton;
    private String foodType;
    private String habitatType;

    public abstract void locomotion();
    
    public Invertebrate(int id, String scientificName, Date borndateM, int cageId) {
        super(id, scientificName, borndateM, cageId);
    }

    @Override
    public String toString() {
        return "Invertebrate{" + super.toString()+ "hasExosqueleton=" + hasExosqueleton + ", foodType=" + foodType + ", habitatType=" + habitatType + '}';
    }
    
    
    /**
     * @return the hasExosqueleton
     */
    public boolean isHasExosqueleton() {
        return hasExosqueleton;
    }

    /**
     * @param hasExosqueleton the hasExosqueleton to set
     */
    public void setHasExosqueleton(boolean hasExosqueleton) {
        this.hasExosqueleton = hasExosqueleton;
    }

    /**
     * @return the foodType
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * @param foodType the foodType to set
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
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
    
}
