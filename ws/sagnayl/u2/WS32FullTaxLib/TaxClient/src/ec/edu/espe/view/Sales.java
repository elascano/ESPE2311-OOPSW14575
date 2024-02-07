package ec.edu.espe.view;

import java.text.DecimalFormat;
import ec.edu.espe.taxlib.utils.RentTax;
import ec.edu.espe.taxlib.utils.Tax;

/**
 *
 * @author Luis Sagnay
 */
public class Sales {
    public static void main(String[] args) {
        float priceOfTheProduct = 11;
        float monthlySalary = 3000;
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Luis Sagnay");
        System.out.println("-----IVA-----");
        System.out.println("Price: " + priceOfTheProduct);
        System.out.println("IVA: " + Tax.computeIva(priceOfTheProduct));
        System.out.println("PVP: " + Tax.computePvP(priceOfTheProduct));
        System.out.println("\n");
        System.out.println("-----Rent Tax-----");
        System.out.println("Monthly salary: " + df.format(monthlySalary));
        System.out.println("Anual salary: " + df.format(monthlySalary * 12));
        System.out.println("Anual Rent Tax : " + df.format(RentTax.calculateRentTaxes(monthlySalary, true, 2023)));
    }
}
