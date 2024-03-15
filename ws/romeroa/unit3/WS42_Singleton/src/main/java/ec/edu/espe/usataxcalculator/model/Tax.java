package ec.edu.espe.usataxcalculator.model;


public class Tax {

    private static Tax instance;
    private double currentTaxRate; 

    private Tax() {
        this.currentTaxRate = 12;
    }

    public static Tax getInstance() {
        if (instance == null) {
            instance = new Tax();
        }
        return instance;
    }

    public double calculateTotalWithTax(double amount, double taxRate) {
        return amount + (amount * (taxRate / 100));
    }

    public void setCurrentTaxRate(double currentTaxRate) {
        this.currentTaxRate = currentTaxRate;
    }

    public double getCurrentTaxRate() {
        return currentTaxRate;
    }
}
