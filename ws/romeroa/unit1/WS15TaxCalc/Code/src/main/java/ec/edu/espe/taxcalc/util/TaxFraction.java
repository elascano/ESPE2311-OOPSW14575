package ec.edu.espe.taxcalc.util;

public class TaxFraction {
    @Override
    public String toString() {
        return "TaxFraction [from=" + from + ", upto=" + upto + ", tax=" + tax + ", discount=" + discount + "]";
    }

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
