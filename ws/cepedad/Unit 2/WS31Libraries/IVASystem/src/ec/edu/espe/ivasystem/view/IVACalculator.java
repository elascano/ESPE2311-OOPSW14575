package ec.edu.espe.ivasystem.view;

import ec.edu.espe.ivasystem.model.Product;

/**
 *
 * @author David
 */
public class IVACalculator {
    public static void main(String[] args) {
        System.out.println("IVA SYSTEM By David Cepeda");
        Product product = new Product("Chocolate", 10.0);
        product.getInformation();
    }
}
