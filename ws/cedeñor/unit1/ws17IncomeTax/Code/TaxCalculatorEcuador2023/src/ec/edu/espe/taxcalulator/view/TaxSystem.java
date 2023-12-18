package ec.edu.espe.taxcalulator.view;

import java.util.Scanner;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class TaxSystem {

    public static double calcularImpuestoRenta(double ingresoAnual) {
        double baseImponible = ingresoAnual;

        double[] limites = {11722, 14930, 19385, 25638, 33738, 44721, 59537, 79388, 10580, Double.POSITIVE_INFINITY};
        double[] fraccionBasica = {0, 0, 160, 606, 1356, 2571, 4768, 8472, 14427, 23594};
        double[] porcentajeExcedente = {0.00, 0.05, 0.10, 0.12, 0.15, 0.20, 0.25, 0.30, 0.35, 0.37};

        double impuesto = 0;

        for (int i = 1; i < limites.length; i++) {
            if (baseImponible <= limites[i]) {
                impuesto = fraccionBasica[i] + (baseImponible - limites[i - 1]) * porcentajeExcedente[i];
                break;
            }
        }

        return impuesto;
    }

    public static void main(String[] args) {

        double ingresoAnual;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo mensual: ");
        double sueldoMensual = scanner.nextDouble();
        ingresoAnual = sueldoMensual * 12;

        double impuestoCalculado = calcularImpuestoRenta(ingresoAnual);

        if (impuestoCalculado < 0) {
            System.out.println("El impuesto a la renta a pagar es: 0 dólares (sin impuesto o con deducciones)");
        } else {
            System.out.println("El impuesto a la renta a pagar es: " + impuestoCalculado + " dolares");
        }
    }
}
