package ec.espe.edu.controller;

/**
 *
 * @author Frederick
 */
public class TaxController {
    static float ivaPercentage = 12.0f;
    static float min = 1500.35f;
    
    public static float computeIVA(float amount){
        float iva;
        
        iva=amount*ivaPercentage/100;
        
        return iva;
    }
    
    public static float computePVP(float amount){
        float total;
        
        total = amount + computeIVA(amount);
        
        return total;
    }
    
}
