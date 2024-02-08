package ec.edu.espe.view;
import ec.edu.espe.taxlib.utils.Tax;
import static ec.edu.espe.taxcalulator.view.TaxSystem.calcularImpuestoRenta;

/**
 *
 * @author David
 */
public class Sales {
    public static void main(String[] args) {
        float amount = 10.f;
        double ingresoAnual = 3920 * 12;
        double impuestoCalculado = calcularImpuestoRenta(ingresoAnual);
        
        System.out.println("----IVA----");
        System.out.println("David Cepeda");
        System.out.println("amount --> " + amount);
        System.out.println("IVA --> " + Tax.computeIva(amount));
        System.out.println("PVP --> " + Tax.computePvP(amount));
       
        System.out.println("\n");
        System.out.println("----IMPUESTO RENTA----");
        System.out.println("David Cepeda");
        if (impuestoCalculado < 0) {
            System.out.println("El impuesto a la renta a pagar es: 0 dolares (sin impuesto o con deducciones)");
        } else {
            System.out.println("El impuesto a la renta a pagar es ---> " + impuestoCalculado + " dolares");
        }
                
    }
}
