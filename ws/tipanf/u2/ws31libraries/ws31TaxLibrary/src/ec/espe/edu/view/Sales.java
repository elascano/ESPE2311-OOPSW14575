package ec.espe.edu.view;

import ec.espe.edu.controller.TaxController;
import java.util.Scanner;

/**
 *
 * @author Frederick
 */
public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Insert the price of the product");
        float price = Float.parseFloat(scan.nextLine());
        
        System.out.println(" ------- IVA -----");
        System.out.println(" Fréderick Tipan");
        System.out.println("amount ---> " + price );
        System.out.println("IVA ---> " + TaxController.computeIVA(price));
        System.out.println("PVP ---> " + TaxController.computePVP(price));
    }
    
}
