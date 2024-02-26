package ec.edu.espe.paymentsplatform.view;

import ec.edu.espe.taxlib2.utils.*;

/**
 *
 * @author mateo
 */
public class Payments {
        public static void main(String[] args) {
        RentaComputer rent = new RentaComputer(3920,"mensual", "public");
        System.out.println("Rent Tax -> " + rent.computeRentTax());
    }
}
