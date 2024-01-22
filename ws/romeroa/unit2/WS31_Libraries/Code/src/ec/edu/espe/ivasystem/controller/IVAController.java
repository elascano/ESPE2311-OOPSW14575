package ec.edu.espe.ivasystem.controller;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class IVAController {
    static float ivaPercentage = 12;
    
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
