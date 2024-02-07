package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public abstract class Mollusk extends Invertebrate {
    private boolean hasShell;
    private String muscularFootType;

    public Mollusk(boolean hasShell, String muscularFootType, float size, String habitat, int id, String scientificName, Date bornDate, int cageId) {
        super(size, habitat, id, scientificName, bornDate, cageId);
        this.hasShell = hasShell;
        this.muscularFootType = muscularFootType;
    }

    @Override
    public String toString() {
        return "Mollusk{"+ super.toString() + "hasShell=" + hasShell + ", muscularFootType=" + muscularFootType + '}';
    }
    

    /**
     * @return the hasShell
     */
    public boolean isHasShell() {
        return hasShell;
    }

    /**
     * @param hasShell the hasShell to set
     */
    public void setHasShell(boolean hasShell) {
        this.hasShell = hasShell;
    }

    /**
     * @return the muscularFootType
     */
    public String getMuscularFootType() {
        return muscularFootType;
    }

    /**
     * @param muscularFootType the muscularFootType to set
     */
    public void setMuscularFootType(String muscularFootType) {
        this.muscularFootType = muscularFootType;
    }
    
    
}
