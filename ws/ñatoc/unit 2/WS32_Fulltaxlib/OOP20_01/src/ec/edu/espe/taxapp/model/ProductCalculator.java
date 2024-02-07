
package ec.edu.espe.taxapp.model;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class ProductCalculator {
    public static float calculateTotalCost(float amount) {
       float total;
       total= amount + calculateIva(amount);
       return total;
    }

     public static float calculateIva(float amount) {
        float vatPercentage = 0.12f;
        return amount * vatPercentage;
     }
    
}
