package ec.edu.espe.calculatetaxes.model;

/**
 *
 * @author Luis Sagnay
 */
public class CalculateTax {

    public static float calculateIVA(float price) {
        float porcentage = 12;
        return price * (porcentage/100);
    }

    public static float calculatePVP(float price) {
        return (price + calculateIVA(price));
    }
}
