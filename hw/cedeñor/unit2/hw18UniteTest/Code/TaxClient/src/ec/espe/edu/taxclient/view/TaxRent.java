package ec.espe.edu.taxclient.view;

import ec.espe.edu.taxlib.utils.Tax;
import java.util.Scanner;

/**
 *
 * @author RC_558
 */
public class TaxRent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered the price: ");
        float amount = scanner.nextFloat();

        System.out.println("-----------IVA---------------");
        System.out.println("Rony Cedeño");
        System.out.println("amount -->" + amount);
        System.out.println("IVA -->" + Tax.computeIva(amount));
        System.out.println("PVP -->" + Tax.computePVP(amount));

        System.out.println("\n");
        System.out.println("==========IMPUESTO A LA RENTA==================");
        System.out.println("Rony Cedeño");
        System.out.println("Ingrese su sueldo mensual: ");
        double sueldoMensual = scanner.nextDouble();
        double ingresoAnual = sueldoMensual * 12;

        double impuestoCalculado = Tax.calcularImpuestoRenta(ingresoAnual);

        if (impuestoCalculado < 0) {
            System.out.println("El impuesto a la renta a pagar es: 0 dólares (sin impuesto o con deducciones)");
        } else {
            System.out.println("El impuesto a la renta a pagar es: " + impuestoCalculado + " dolares");
        }

    }
}
