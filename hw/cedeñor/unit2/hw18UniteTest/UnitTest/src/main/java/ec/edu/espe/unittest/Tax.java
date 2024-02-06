package ec.edu.espe.unittest;

/**
 *
 * @author RC_558
 */
public class Tax {
     static float ivaPercentage = 12.0f;

    public static float computeIva(float amount) {
        float iva;
        iva = amount * (ivaPercentage / 100);
        return iva;
    }

    public static float computePVP(float amount) {
        float total;
        total = amount + computeIva(amount);
        return total;
    }

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
}
