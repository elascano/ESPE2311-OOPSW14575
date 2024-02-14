package ec.edu.espe.unittest.controller;

/**
 *
 * @author Frederick
 */
public class Tax {
    static float ivaPercentage = 12.0f;
    public static float computeIVA(float amount){
        float iva;
        float realAmmount;
        
        iva=amount*ivaPercentage/100;
        
        realAmmount=amount+iva;
        
        return realAmmount;
    }
}
