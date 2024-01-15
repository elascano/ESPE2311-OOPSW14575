package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Butterflie extends Arthropod{
    private String color;
    private float wingSize;

    public Butterflie(String color, float wingSize, int legsNumber, boolean hasVenom, String exoskeleton, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(legsNumber, hasVenom, exoskeleton, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.color = color;
        this.wingSize = wingSize;
    }
    
    
    
    public void migrate(){}

    @Override
    public String toString() {
        return "Butterflie{" + "color=" + color + ", wingSize=" + wingSize + '}';
    }
}
