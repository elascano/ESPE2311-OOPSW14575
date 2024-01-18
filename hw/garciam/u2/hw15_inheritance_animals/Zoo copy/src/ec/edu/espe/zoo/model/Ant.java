package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Ant extends Arthropod{
    private String jobType;
    private int foodCarrying;

    public Ant(String jobType, int foodCarrying, int legsNumber, boolean hasVenom, String exoskeleton, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(legsNumber, hasVenom, exoskeleton, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.jobType = jobType;
        this.foodCarrying = foodCarrying;
    }
    
    public void gatherFood(){}

    @Override
    public boolean checkByAZoologist(int zoologistId) {
        System.out.println("The zoologist with the Id " + zoologistId + "determinate that the ant is healthy");
        return true;
    }
}
