package ec.edu.espe.taxclient.view;
import ec.edu.edpe.taxlib.utils.Tax;
import java.util.Scanner;
/**
 *
 * @author Jefferson Yepez DCCO BitCoderz
 */
public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost: ");
        float cost = scanner.nextFloat();
        
        System.out.println("The cost --> " + cost);
        System.out.println("The IVA ---> " + Tax.computeIva(cost));
        System.out.println("The total cost ---> " + Tax.computePvP(cost));
        
        
    }
}
