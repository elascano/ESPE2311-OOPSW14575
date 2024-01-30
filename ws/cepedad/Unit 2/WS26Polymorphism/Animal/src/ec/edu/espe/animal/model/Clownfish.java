package ec.edu.espe.animal.model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Clownfish extends Fish {
    private boolean hasAnemoneSymbiosis;
    private String stripeColor;

    public Clownfish(boolean hasAnemoneSymbiosis, String stripeColor, String habitatType, boolean isSaltwater, String speciesName, String fishColor, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(habitatType, isSaltwater, speciesName, fishColor, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.hasAnemoneSymbiosis = hasAnemoneSymbiosis;
        this.stripeColor = stripeColor;
    }

    @Override
    public String toString() {
        return "Clownfish{" + super.toString() + "hasAnemoneSymbiosis=" + hasAnemoneSymbiosis + ", stripeColor=" + stripeColor + '}';
    }

    /**
     * @return the hasAnemoneSymbiosis
     */
    public boolean isHasAnemoneSymbiosis() {
        return hasAnemoneSymbiosis;
    }

    /**
     * @param hasAnemoneSymbiosis the hasAnemoneSymbiosis to set
     */
    public void setHasAnemoneSymbiosis(boolean hasAnemoneSymbiosis) {
        this.hasAnemoneSymbiosis = hasAnemoneSymbiosis;
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

    @Override
    public void feed() {
        System.out.println("Feeding Clownfish with algae");
    }
    
}
