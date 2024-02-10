
package ec.edu.espe.TaxClient.view;
import ec.edu.espe.TaxLib.controller.Tax;


/**
 *
 * @author Olivier Paspuel
 */
public class Sales {
    public static void main(String[] args) {
        System.out.println("Tax System");
        System.out.println("Dev: Olivier Paspuel LaLeyenda");

        float item = (float) 10;
        System.out.println("The final price of an item that costs 10 dollars plus iva is " +  Tax.computePvP(item));
        System.out.println("The rent tax for a public employee that earns 3920 dollars a month is " + Tax.computePublicEmployeeRentTax(3920));
    }
}
