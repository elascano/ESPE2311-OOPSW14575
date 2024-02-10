
package ec.edu.espe.TaxApp.controller;

/**
 *
 * @author Olivier Paspuel
 */
public class TaxCalculator {

    static float ivaValue = (float) 0.12;
    
    public static  float computeIVA(float price){
        return price * ivaValue;
    }
    
    public static void computePVP(float price){
//        return price + calculateIva(price);
        System.out.print(String.format("%.2f", price + computeIVA(price)));

    }
    
}
