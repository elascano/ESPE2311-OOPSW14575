package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Octopus extends Mollusk{
    private String color;
    private int numberOfTentacles;

    public Octopus(String color, int numberOfTentacles, String shellType, float movementSpeed, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(shellType, movementSpeed, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.color = color;
        this.numberOfTentacles = numberOfTentacles;
    }
    
    
    public void catchPrey(){
    }
    
    public void changeColor(){
    }
}
