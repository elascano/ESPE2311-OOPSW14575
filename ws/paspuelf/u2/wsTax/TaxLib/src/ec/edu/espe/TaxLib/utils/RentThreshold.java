package ec.edu.espe.TaxLib.utils;

/**
 *
 * @author Olivier Paspuel
 */
public class RentThreshold {

    private int basicFraction;
    private int basicFractionTax;
    private float excessFractionTax;

    public RentThreshold(int basicFraction, int basicFractionTax, float excessFractionTax) {
        this.basicFraction = basicFraction;
        this.basicFractionTax = basicFractionTax;
        this.excessFractionTax = excessFractionTax;
    }

    /**
     * @return the basicFraction
     */
    public int getBasicFraction() {
        return basicFraction;
    }

    /**
     * @param basicFraction the basicFraction to set
     */
    public void setBasicFraction(int basicFraction) {
        this.basicFraction = basicFraction;
    }

    /**
     * @return the basicFractionTax
     */
    public int getBasicFractionTax() {
        return basicFractionTax;
    }

    /**
     * @param basicFractionTax the basicFractionTax to set
     */
    public void setBasicFractionTax(int basicFractionTax) {
        this.basicFractionTax = basicFractionTax;
    }

    /**
     * @return the excessFractionTax
     */
    public float getExcessFractionTax() {
        return excessFractionTax;
    }

    /**
     * @param excessFractionTax the excessFractionTax to set
     */
    public void setExcessFractionTax(float excessFractionTax) {
        this.excessFractionTax = excessFractionTax;
    }

}
