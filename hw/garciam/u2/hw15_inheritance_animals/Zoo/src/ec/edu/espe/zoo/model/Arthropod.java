package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Arthropod extends Invertebrate{
    private int legsNumber;
    private boolean hasVenom;
    private String exoskeleton;

    public Arthropod(int legsNumber, boolean hasVenom, String exoskeleton, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.legsNumber = legsNumber;
        this.hasVenom = hasVenom;
        this.exoskeleton = exoskeleton;
    }
    
    
    
    public void shedSkin(){
    
    }
}
