
package ws16library;

import static es.edu.espe.utis.Taxes.calculateTaxes;
import java.util.Scanner;

/**
 *
 * @author IMG_NUC
 */
public class WS16Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your monthly salary");
        float salary=scan.nextFloat();
        
        System.out.println("Are you a public employee?");
        boolean isPublicEmployee = scan.nextBoolean();
        float anualTaxPay = calculateTaxes(salary,isPublicEmployee);
        
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + salary*12); 
        System.out.println("Annual Tax: " + anualTaxPay);
        
        System.out.println("Montly Tax: " + anualTaxPay/12);
        
        System.out.println("Left money: " + (salary - anualTaxPay/12)); 
        
    }
    
}
