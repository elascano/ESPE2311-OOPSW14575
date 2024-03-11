package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Condor extends Birds{
    private float wingsLength;
    private float size;

    public Condor(float wingsLength, float size, int wings, String feathers, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(wings, feathers, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.wingsLength = wingsLength;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Condor{" +super.toString()+ "wingsLength=" + wingsLength + ", size=" + size + '}';
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
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }
   
    
}
