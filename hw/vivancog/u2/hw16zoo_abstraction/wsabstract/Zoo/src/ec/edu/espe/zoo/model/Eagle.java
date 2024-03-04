package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Eagle extends Birds{
    private float wingsLength;
    private String visionQuality;

    public Eagle(float wingsLength, String visionQuality, int wings, String feathers, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(wings, feathers, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.wingsLength = wingsLength;
        this.visionQuality = visionQuality;
    }

    @Override
    public String toString() {
        return "Eagle{" +super.toString()+ "wingsLength=" + wingsLength + ", visionQuality=" + visionQuality + '}';
    }

    /**
     * @return the wingsLength
     */
    public float getWingsLength() {
        return wingsLength;
    }

    /**
     * @param wingsLength the wingsLength to set
     */
    public void setWingsLength(float wingsLength) {
        this.wingsLength = wingsLength;
    }

    /**
     * @return the visionQuality
     */
    public String getVisionQuality() {
        return visionQuality;
    }

    /**
     * @param visionQuality the visionQuality to set
     */
    public void setVisionQuality(String visionQuality) {
        this.visionQuality = visionQuality;
    }

    @Override
    public void vocalization() {
        System.out.println("The eagle squawks");
    }

    
    
}
