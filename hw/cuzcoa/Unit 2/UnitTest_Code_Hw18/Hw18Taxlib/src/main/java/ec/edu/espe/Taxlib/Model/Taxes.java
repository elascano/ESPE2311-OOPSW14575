
package ec.edu.espe.Taxlib.Model;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Taxes {
    private static final double IVA_RATE_2024 = 0.12; // Iva

    public static double calcularIva(double amount) {
        return amount * IVA_RATE_2024;
    }

    public static double calcularTotalConIva(double amount) {
        return amount * (1 + IVA_RATE_2024);
    }

    public static void main(String[] args) {
        double amount = 100.0; // Ejemplo de amount sin IVA

        double iva = calcularIva(amount);
        double totalConIva = calcularTotalConIva(amount);

        System.out.println("Monto sin IVA: $" + amount);
        System.out.println("IVA (12%): $" + iva);
        System.out.println("Total con IVA: $" + totalConIva);
    }
}