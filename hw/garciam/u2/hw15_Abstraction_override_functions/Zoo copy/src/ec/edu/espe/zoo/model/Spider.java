package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Spider extends Arthropod {

    private String type;
    private float size;

    public Spider(int legsNumber, boolean hasVenom, String exoskeleton, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(legsNumber, hasVenom, exoskeleton, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
    }

    @Override
    public boolean checkByAZoologist(int zoologistId) {
        System.out.println("The zoologist with the Id " + zoologistId + "determinate that the spider is healthy");
        return true;
    }

    public void spinWeb() {
        System.out.println("Spider is spining web...");
    }
}
