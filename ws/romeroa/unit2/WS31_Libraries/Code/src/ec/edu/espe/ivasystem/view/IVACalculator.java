package ec.edu.espe.ivasystem.view;

import ec.edu.espe.ivasystem.model.Product;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class IVACalculator {
    public static void main(String[] args) {
        System.out.println("\n--- IVA Calculator ---\n");
        Product product = new Product("Iron bars", 15.0);
        product.getInformation();
    }   
}
