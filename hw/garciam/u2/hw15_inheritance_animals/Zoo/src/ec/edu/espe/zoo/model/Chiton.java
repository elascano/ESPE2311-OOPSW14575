package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mateo
 */
public class Chiton extends Mollusk{
    private  ArrayList<String> shellComposition;
    private float size;
    private String locomotionType;

    public Chiton(ArrayList<String> shellComposition, float size, String locomotionType, String shellType, float movementSpeed, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(shellType, movementSpeed, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.shellComposition = shellComposition;
        this.size = size;
        this.locomotionType = locomotionType;
    }
    
    
    public void hardenShell(){
    }

    @Override
    public String toString() {
        return "Chiton{" + "shellComposition=" + shellComposition + ", size=" + size + ", locomotionType=" + locomotionType + '}';
    }
    
    
    
}
