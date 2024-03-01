
package ec.edu.espe.view;

import ec.edu.espe.taxlib.controller.Tax;
/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Sales {
    
    public static void main(String[] args) {
        float amount = 12f;
        double salary = 12500f;   
        System.out.println("----------Iva-------" );
        System.out.println("The amount-->"+amount);
        System.out.println("The total amount-->"+Tax.computePvP(amount));
        
        System.out.println("----------Income tax-------" );
        System.out.println("The salary-->"+salary);
        System.out.println("the total icometax-->"+Tax.baseTaxes(salary));
        System.out.println(Tax.taxBaseCalculation(salary));
    }
    
}
