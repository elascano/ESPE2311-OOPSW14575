package ec.edu.espe.taxclient.view;
import java.util.Scanner;
import ec.edu.edpe.taxlib.utils.Tax;


/**
 *
 * @author Jefferson Yepez DCCO BitCoderz
 */
public class Monthly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tax tax = new Tax(3920, "mensual", "public");
        
        System.out.println(" ----- Monthly Salary ----- ");
        System.out.println("Your monthly salary is ---> " + "3920");
        System.out.println("Your type of earning is ---> " + "mensual");
        System.out.println("Your type of salaried is ---> " + "public   ");
        System.out.println("Your annualy salary is ---> " +  tax.computeRentTax());
        
    }
}
