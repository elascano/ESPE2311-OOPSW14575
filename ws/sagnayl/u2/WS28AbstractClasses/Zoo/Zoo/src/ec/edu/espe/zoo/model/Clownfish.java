package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Clownfish extends Fish{
    private String stripeColor;
    
    public void genderChange(){
        System.out.println("The Clownfish is changing if gender");
    }

    public Clownfish(String stripeColor, boolean itHasScales, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(itHasScales, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.stripeColor = stripeColor;
    }

    @Override
    public String toString() {
        return "Clownfish{" +super.toString() + "stripeColor=" + getStripeColor() + '}';
    }

    /**
     * @return the stripeColor
     */
    public String getStripeColor() {
        return stripeColor;
    }

    /**
     * @param stripeColor the stripeColor to set
     */
    public void setStripeColor(String stripeColor) {
        this.stripeColor = stripeColor;
    }

}
