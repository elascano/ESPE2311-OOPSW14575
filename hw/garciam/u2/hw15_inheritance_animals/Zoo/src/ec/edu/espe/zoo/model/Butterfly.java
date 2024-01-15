package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Butterfly extends Arthropod{
    private String color;
    private float wingSize;

    public Butterfly(String color, float wingSize, int legsNumber, boolean hasVenom, String exoskeleton, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(legsNumber, hasVenom, exoskeleton, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.color = color;
        this.wingSize = wingSize;
    }
    
    
    
    public void migrate(){
        System.out.println("butterfly has to migrate");
    }
    
    
    @Override
    public void shedSkin(){
        System.out.println("butterfly is sheding skin");
    }
    
    public void shedSkin(String color ){
        System.out.println("butterfly is sheding skin and it change to color " + color);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Butterflie{" + super.toString() + "color=" + color + ", wingSize=" + wingSize + '}';
    }
}
