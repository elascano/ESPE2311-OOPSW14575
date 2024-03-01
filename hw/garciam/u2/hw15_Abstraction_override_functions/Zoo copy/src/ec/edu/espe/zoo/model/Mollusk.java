package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public abstract class Mollusk extends Invertebrate{
    
    private String shellType;
    private float movementSpeed;

    public Mollusk(String shellType, float movementSpeed, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.shellType = shellType;
        this.movementSpeed = movementSpeed;
    }

    @Override
    public String toString() {
        return "Mollusk{" + "shellType=" + shellType + ", movementSpeed=" + movementSpeed + '}';
    }

    public String getShellType() {
        return shellType;
    }

    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    public float getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(float movementSpeed) {
        this.movementSpeed = movementSpeed;
    }
    
    
    
    
}
