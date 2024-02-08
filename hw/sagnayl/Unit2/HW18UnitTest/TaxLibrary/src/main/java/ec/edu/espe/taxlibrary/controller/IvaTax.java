package ec.edu.espe.taxlibrary.controller;

/**
 *
 * @author Luis Sagnay
 */
public class IvaTax {
    public static float ivaPercentage = 12.0f;
    
    public static float computeIva(float amount){
        float iva;
        
        iva = amount * ivaPercentage/100;
        return iva;
    }
    
    public static float computePvP(float amount){
        float total;
        
        total = amount + computeIva(amount);
        return total;
    }
}
