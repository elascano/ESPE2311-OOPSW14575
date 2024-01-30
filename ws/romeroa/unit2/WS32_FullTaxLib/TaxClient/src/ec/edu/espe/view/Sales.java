package ec.edu.espe.view;
import ec.edu.espe.taxlib.utils.Tax;
import ec.edu.espe.taxcalc.util.TaxCalculator;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Sales {
    public static void main(String[] args) {
        float amount = 10.f;
        double monthlyIncome = 3920;
        double taxAmount = TaxCalculator.CalculateTaxes(monthlyIncome, false, 2023);
        
        System.out.println("- IVA");
        System.out.println("    Amount --> $" + amount);
        System.out.println("    IVA --> $" + Tax.computeIva(amount));
        System.out.println("    PVP --> $" + Tax.computePvP(amount));

        System.out.println("\n");
        System.out.println("- IMPUESTO RENTA");
        if (taxAmount == 0) {
            System.out.println("    El impuesto a la renta a pagar es: USD $0 (sin impuesto o con deducciones)\n");
        } else {
            System.out.format("    El impuesto a la renta a pagar es: USD $%.2f\n", taxAmount);
        }
    }
}
