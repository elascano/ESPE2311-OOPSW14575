package ec.edu.espe.taxsingleton.controller;

/**
 *
 * @author Luis Sagnay
 */
public class TaxService {
    public static double calculateTax(double amount, double taxPercentage) {
        return (amount * taxPercentage) / 100;
    }

    public static double calculateTotalAmount(double amount, double taxAmount) {
        return amount + taxAmount;
    }
}
