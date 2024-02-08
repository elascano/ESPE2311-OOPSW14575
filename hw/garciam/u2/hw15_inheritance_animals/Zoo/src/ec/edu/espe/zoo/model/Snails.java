package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Snails extends Mollusk{
    private String shellShape;
    private String smileTrailColor;

    public Snails(String shellShape, String smileTrailColor, String shellType, float movementSpeed, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(shellType, movementSpeed, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.shellShape = shellShape;
        this.smileTrailColor = smileTrailColor;
    }

    @Override
    public String toString() {
        return "Snails{" + "shellShape=" + shellShape + ", smileTrailColor=" + smileTrailColor + '}';
    }
    
    
    
    public void crawl(){
        System.out.println("is crawling");
    }
    
    public void produceSlimeTrail(){
    
    }
    
    public void senseEnvironment(){
    }
    
}
