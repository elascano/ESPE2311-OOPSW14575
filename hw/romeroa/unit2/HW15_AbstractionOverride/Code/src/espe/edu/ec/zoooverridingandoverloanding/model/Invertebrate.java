package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Invertebrate extends Animal{
private String exoskeletonType ;

    public Invertebrate(String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(id, scientificName, bornOnDate, cageId);
        this.exoskeletonType = exoskeletonType;
    }

    @Override
    public String toString() {
        return "Invertebrate{" + super.toString() + "exoskeletonType=" + getExoskeletonType() + '}';
    }
    

    public void hunt(){
        System.out.println("invertebrate hunting");
    }
    
    /**
     * @return the exoskeletonType
     */
    public String getExoskeletonType() {
        return exoskeletonType;
    }

    /**
     * @param exoskeletonType the exoskeletonType to set
     */
    public void setExoskeletonType(String exoskeletonType) {
        this.exoskeletonType = exoskeletonType;
    }
    
    
    
}
