package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Canary extends Birds {
    private boolean hasMelodiousSong;
    private String cageType;

    public Canary(boolean hasMelodiousSong, String cageType, String speciesName, boolean isMigratory, String birdColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(speciesName, isMigratory, birdColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.hasMelodiousSong = hasMelodiousSong;
        this.cageType = cageType;
    }

    @Override
    public String toString() {
        return "Canary{" + super.toString() + "hasMelodiousSong=" + hasMelodiousSong + ", cageType=" + cageType + '}';
    }

    /**
     * @return the hasMelodiousSong
     */
    public boolean isHasMelodiousSong() {
        return hasMelodiousSong;
    }

    /**
     * @param hasMelodiousSong the hasMelodiousSong to set
     */
    public void setHasMelodiousSong(boolean hasMelodiousSong) {
        this.hasMelodiousSong = hasMelodiousSong;
    }

    /**
     * @return the cageType
     */
    public String getCageType() {
        return cageType;
    }

    /**
     * @param cageType the cageType to set
     */
    public void setCageType(String cageType) {
        this.cageType = cageType;
    }

    @Override
    public void feed() {
        System.out.println("Feeding Canary with grains and seeds");
    }
    
}
