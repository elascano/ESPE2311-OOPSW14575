package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Clam extends Mollusk{
    private float shellSize;
    private String shellColor;

    public Clam(float shellSize, String shellColor, String shellType, float movementSpeed, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(shellType, movementSpeed, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.shellSize = shellSize;
        this.shellColor = shellColor;
    }

    @Override
    public String toString() {
        return "Clam{" + "shellSize=" + shellSize + ", shellColor=" + shellColor + '}';
    }
    
    
    
    public void filterWater(){
    }
}
