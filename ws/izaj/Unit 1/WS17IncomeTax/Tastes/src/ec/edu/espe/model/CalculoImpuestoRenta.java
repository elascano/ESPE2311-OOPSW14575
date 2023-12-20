
package ec.edu.espe.model;
import java.util.Scanner;
/**
 *
 * @author mateo
 */

public class CalculoImpuestoRenta {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el sueldo anual: ");
            double sueldoAnual = scanner.nextDouble();

            System.out.println("¿Es un empleado público? (true/false): ");
            boolean isPublic = scanner.nextBoolean();

            double impuestoRenta = calcularImpuestoRenta(sueldoAnual, isPublic);

            System.out.println("El impuesto a la renta es: " + impuestoRenta);
        }
    }

    public static double calcularImpuestoRenta(double sueldoAnual, boolean isPublic) {
        // Paso 1: Calcular la Base Imponible
        double impuesto = (sueldoAnual * (isPublic ? 11.45 : 9.45) / 100);
        double baseImponible = sueldoAnual - impuesto;

        // Paso 2: Identificar la Fracción Básica
        double[] franjas = {11722, 14930, 19385, 25638, 33738, 44721, 59537, 79388, 105580};
        double[] FraccionBasica = {0, 0, 160, 6406, 1356, 2571, 4768, 8472, 14427, 23594};
        double[] porcentajeImpuestoExcedente = {0, 5, 10, 12, 15, 20, 25, 30, 35, 37};

        // Paso 3: Calcular la Fracción Excedente
        double fraccionExcedente = baseImponible;
        for (int i = 0; i < franjas.length; i++) {
            if (baseImponible <= franjas[i]) {
                fraccionExcedente = baseImponible - (i == 0 ? 0 : franjas[i - 1]);
                break;
            }
        }

        // Paso 4: Calcular el Impuesto a la Fracción Excedente
        int franjaActual = 0;
        for (int i = 0; i < franjas.length; i++) {
            if (baseImponible <= franjas[i]) {
                franjaActual = i;
                break;
            }
        }
        double impuestoFraccionExcedente = fraccionExcedente * (porcentajeImpuestoExcedente[franjaActual - 1] / 100);

        // Paso 5: Identificar el Impuesto a la Fracción Básica
        double impuestoFraccionBasica = FraccionBasica[franjaActual];

        // Paso 6: Calcular el Impuesto a la Renta a pagar
        double impuestoRentaPagar = impuestoFraccionExcedente + impuestoFraccionBasica;
         
        return impuestoRentaPagar;
    }
}
