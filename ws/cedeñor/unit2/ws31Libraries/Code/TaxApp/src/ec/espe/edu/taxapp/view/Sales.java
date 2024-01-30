package ec.espe.edu.taxapp.view;

import ec.espe.edu.taxapp.controller.TaxController;
import java.util.Scanner;

/**
 *
 * @author RC_558
 */
public class Sales {

    public static void main(String[] args) {
        float amount = 10.1f;

        System.out.println("-----------IVA---------------");
        System.out.println("Rony Cedeño");
        System.out.println("amount -->" + amount);
        System.out.println("IVA -->" + TaxController.computeIva(amount));
        System.out.println("PVP -->" + TaxController.computePVP(amount));
        
    }

}
