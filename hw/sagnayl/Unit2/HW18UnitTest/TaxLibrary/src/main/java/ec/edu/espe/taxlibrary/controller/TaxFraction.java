package ec.edu.espe.taxlibrary.controller;

/**
 *
 * @author Luis Sagnay
 */
public class TaxFraction {
    double from;
    double upto;
    double tax;
    double discount;

    public TaxFraction(double from, double upto, double tax, double discount) {
        this.from = from;
        this.upto = upto;
        this.tax = tax;
        this.discount = discount;
    }
}
