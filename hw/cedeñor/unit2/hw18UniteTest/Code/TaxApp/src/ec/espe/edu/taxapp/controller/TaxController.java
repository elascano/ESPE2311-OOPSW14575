package ec.espe.edu.taxapp.controller;

/**
 *
 * @author RC_558
 */
public class TaxController {

    static float ivaPercentage = 12.0f;

    public static float computeIva(float amount) {
        float iva;
        iva = amount * (ivaPercentage / 100);
        return iva;
    }

    public static float computePVP(float amount) {
        float total;
        total = amount + computeIva(amount);
        return total;
    }

}
