
package ec.edu.espe.view;
import ec.edu.espe.controller.Tax;
import java.util.Scanner;
/**
 *
 * @author Ilhan R
 */
public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float ammount= 150;

        System.out.println("Input your monthly income: ");
        float monthlyIncome = scanner.nextFloat(); 
        
        System.out.println("\n");
        
        System.out.println("IVA");
        System.out.println("Ihan Rogel");
        System.out.println("ammount --->" + ammount);

        System.out.println("Monthly income --->" + monthlyIncome);
        System.out.println("IVA ---> " + Tax.computeIva(ammount));
        System.out.println("PVP ---> " + Tax.computePvP(ammount));
        System.out.println("Taxable Base ---> " + Tax.computeTaxableBase(monthlyIncome));
        System.out.println("Your Income tax ---> " + Tax.computeIncomeTax(monthlyIncome));
        
        System.out.println("\n");
         
        System.out.println("Your incomes after the deductions --->" + (monthlyIncome-Tax.computeIncomeTax(monthlyIncome)));
    }
}
