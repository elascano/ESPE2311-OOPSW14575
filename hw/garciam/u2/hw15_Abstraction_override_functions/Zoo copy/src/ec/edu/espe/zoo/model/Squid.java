package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Squid extends Mollusk {

    private float tentacleLength;
    private String inkColor;

    public Squid(float tentacleLength, String inkColor, String shellType, float movementSpeed, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(shellType, movementSpeed, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.tentacleLength = tentacleLength;
        this.inkColor = inkColor;
    }

    @Override
    public boolean checkByAZoologist(int zoologistId) {
        System.out.println("The zoologist with the Id " + zoologistId + "determinate that the squid is healthy");
        return true;
    }

    public void ejectInk() {
        System.out.println("Squid is eject Ink");
    }

    @Override
    public String toString() {
        return "Squid{" + "tentacleLength=" + tentacleLength + ", inkColor=" + inkColor + '}';
    }

}
