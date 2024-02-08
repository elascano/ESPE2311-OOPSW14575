
package ec.edu.espe.view;

import ec.edu.espe.taxlib.controller.Tax;
/**
 *
 * @author Juan Granda
 */
public class Sales {
    
    public static void main(String[] args) {
        float amount = 10f;
        double salary = 4000;        
        System.out.println("The amount-->"+amount);
        System.out.println("The total amount-->"+Tax.computePvP(amount));
        
        System.out.println("The salary-->"+salary);
        System.out.println("the total icometax-->"+Tax.baseTaxes(salary));
        System.out.println(Tax.taxBaseCalculation(salary));
    }
    
}
