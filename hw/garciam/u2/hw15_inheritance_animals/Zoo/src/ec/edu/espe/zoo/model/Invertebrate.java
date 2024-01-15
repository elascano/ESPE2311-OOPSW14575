package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Invertebrate extends Animal{
    
    private String AnatomyStructure;
    private String habitat;
    private String reproductionType;

    public Invertebrate(String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(id, scientificName, bornDate, cageId);
        this.AnatomyStructure = AnatomyStructure;
        this.habitat = habitat;
        this.reproductionType = reproductionType;
    }
    
    
    public void registerReproduction(){
        System.out.println("Reproduction");
    }

    @Override
    public String toString() {
        return "Invertebrate{" + super.toString()+"AnatomyStructure=" + AnatomyStructure + ", habitat=" + habitat + ", reproductionType=" + reproductionType + '}';
    }
    
    

    public String getAnatomyStructure() {
        return AnatomyStructure;
    }

    public void setAnatomyStructure(String AnatomyStructure) {
        this.AnatomyStructure = AnatomyStructure;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getReproductionType() {
        return reproductionType;
    }

    public void setReproductionType(String reproductionType) {
        this.reproductionType = reproductionType;
    }
    
    
}
