package ec.espe.edu.view;

import ec.espe.edu.taxlib.utils.Tax;
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
        System.out.println("IVA ---> " + Tax.computeIVA(price));
        System.out.println("PVP ---> " + Tax.computePVP(price));
        System.out.println(" -----------------\n\n");
        
        System.out.println("Insert your montly wage");
        float wage = Float.parseFloat(scan.nextLine());
        
        System.out.println("Are you a public employee?");
        boolean isPublicEmployee = Boolean.parseBoolean(scan.nextLine());
        
        float annualTaxPayment = Tax.computeIncomeTax(wage, isPublicEmployee);
        
        System.out.println(" ------- INCOME TAX -----");
        System.out.println(" Fréderick Tipan");
        System.out.println("montly wage ---> " + wage );
        System.out.println("is public employee? ---> " + isPublicEmployee);
        System.out.println("annual tax pay ---> " + annualTaxPayment);
        System.out.println("left money ---> " + (wage-annualTaxPayment/12));
    }
}
