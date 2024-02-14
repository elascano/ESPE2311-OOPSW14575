package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Centipede extends Arthropod{
    private float length;
    private int legSegments;
    private boolean isCarnivouros;

    public Centipede(float length, int legSegments, boolean isCarnivouros, int legsNumber, boolean hasVenom, String exoskeleton, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(legsNumber, hasVenom, exoskeleton, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.length = length;
        this.legSegments = legSegments;
        this.isCarnivouros = isCarnivouros;
    }
    
    public void capturePrey(){}
}
