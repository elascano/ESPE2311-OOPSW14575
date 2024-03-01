
package ec.edu.espe.view;
import ec.edu.espe.model.Products;
import java.util.Scanner;
/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class PriceOfProducts {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        try {
           
            Products producto = new Products();

            System.out.print("enter the product price: ");
            producto.setCost(scanner.nextInt());
            
            double[] resultado = producto.priceWithIva();

            System.out.printf("IVA is: %.2f%n", resultado[0]);
            System.out.printf("Total price with IVA is: %.2f%n", resultado[1]);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: enter the availed cost number");
        } finally {
            scanner.close();
        }
    }
}

