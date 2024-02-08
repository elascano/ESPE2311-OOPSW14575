package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Trout extends Fish{
    private String spotColor;
    
    public void hide(){
        System.out.println("The trout is hidden");
    }

    public Trout(String spotColor, boolean itHasScales, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(itHasScales, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.spotColor = spotColor;
    }

    @Override
    public String toString() {
        return "Trout{" +super.toString() + "spotColor=" + getSpotColor() + '}';
    }

    /**
     * @return the spotColor
     */
    public String getSpotColor() {
        return spotColor;
    }

    /**
     * @param spotColor the spotColor to set
     */
    public void setSpotColor(String spotColor) {
        this.spotColor = spotColor;
    }
    
}
