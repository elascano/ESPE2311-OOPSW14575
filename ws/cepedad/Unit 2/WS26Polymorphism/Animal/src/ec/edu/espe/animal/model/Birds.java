package ec.edu.espe.animal.model;

import java.util.Date;


/**
 *
 * @author David
 */
public abstract class Birds extends Vertebrate {
    private String speciesName;
    private boolean isMigratory;
    private String birdColor;

    public Birds(String speciesName, boolean isMigratory, String birdColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.speciesName = speciesName;
        this.isMigratory = isMigratory;
        this.birdColor = birdColor;
    }

    
    public void migrate(){
        System.out.println("Bird is migrating"); 
    }
    
    @Override
    public String toString() {
        return "Birds{" + super.toString() + "speciesName=" + speciesName + ", isMigratory=" + isMigratory + ", birdColor=" + birdColor + '}';
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
     * @return the isMigratory
     */
    public boolean isIsMigratory() {
        return isMigratory;
    }

    /**
     * @param isMigratory the isMigratory to set
     */
    public void setIsMigratory(boolean isMigratory) {
        this.isMigratory = isMigratory;
    }

    /**
     * @return the birdColor
     */
    public String getBirdColor() {
        return birdColor;
    }

    /**
     * @param birdColor the birdColor to set
     */
    public void setBirdColor(String birdColor) {
        this.birdColor = birdColor;
    }
}
