
// WS 31

package ec.edu.espe.TaxApp.view;

import ec.edu.espe.TaxApp.controller.TaxCalculator;

/**
 *
 * @author Olivier Paspuel
 */
public class TaxSystem {

    public static void main(String[] args) {
        System.out.println("Tax System");

        float item = (float) 13.1;
        
        TaxCalculator.computePVP(item);
        
    }
    
}
