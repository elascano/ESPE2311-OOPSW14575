
package ec.espe.edu.Q4760.controller;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class CellphoneController {
    public static double calculatePriceTotal(double subtotal){
        double total;
        total = subtotal+ (subtotal*0.12);
        
        return total;
    }
}
