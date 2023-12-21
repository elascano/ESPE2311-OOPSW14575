package ec.espe.edu.taxes.view;

import ec.espe.edu.taxes.utils.*;

/**
 *
 * @author mateo, eduardo
 */
public class Test {
    public static void main(String[] args) {
        Tax rent = new Tax(3920,"mensual", "public");
        System.out.println("Rent Tax -> " + rent.computeRentTax());
    }
}
