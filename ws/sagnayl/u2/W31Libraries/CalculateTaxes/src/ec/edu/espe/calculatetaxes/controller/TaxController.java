package ec.edu.espe.calculatetaxes.controller;

/**
 *
 * @author Luis Sagnay
 */
public class TaxController {
    static float ivaPercentage = 12.0f;
    static float min = 1500.35f;
    
    public float computeIva(float amount){
        float iva;
        
        iva = amount * ivaPercentage/100;
        return iva;
    }
    
    public float computePvP(float amount){
        float total;
        
        total = amount + computeIva(amount);
        return total;
    }
    
    public static float getIvaPercentage(){
        return ivaPercentage;
    }
    
    public static float getMin(){
        return min;
    }
    
    public static void setIvaPercentage(float ivaPercentage){
        TaxController.ivaPercentage = ivaPercentage;
    }

}
