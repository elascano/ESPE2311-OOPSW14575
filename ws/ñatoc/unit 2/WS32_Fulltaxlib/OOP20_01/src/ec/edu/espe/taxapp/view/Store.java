package ec.edu.espe.taxapp.view;
import ec.edu.espe.taxlib.model.IncomeTax;
import ec.edu.espe.taxlib.utils.Tax;


/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Store {
        public static void main(String[] args) {
        float unitPrice = 10.0f; 
            System.out.println("Tax Sistem");
            System.out.println("by: Carlos Ñato");
        System.out.println("Cost of the product: $" + unitPrice);
        System.out.println("Total cost of the product: $" + Tax.computePvP(unitPrice));
        System.out.println("VAT (12%): $" + Tax.computeIva(unitPrice) );
            System.out.println(IncomeTax.baseTaxes(2300));
   
    }
    

    
}
