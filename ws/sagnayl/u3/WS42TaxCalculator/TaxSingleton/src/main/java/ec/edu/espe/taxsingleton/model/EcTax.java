package ec.edu.espe.taxsingleton.model;

/**
 *
 * @author Luis Sagnay
 */
public class EcTax {
    private static EcTax instance;
    private double taxPercentage;

    private EcTax() {
        taxPercentage = 12.0;
    }

    public static EcTax getInstance() {
        if (instance == null) {
            instance = new EcTax();
        }
        return instance;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}
