
package ec.espe.edu.calculatorIva.model;

/**
 *
 * @author Rony
 */

public class Tax {
    private static Tax instance;
    private float taxPorcentage;
    
    private Tax(){
        taxPorcentage = 12;
    }

    public static Tax getInstanceEcTax(){
        if(instance ==null){
            instance = new Tax();
        }
        return instance;
    }

    public float getTaxPorcentage() {
        return taxPorcentage;
    }

    public void setTaxPorcentage(float taxPorcentage) {
        this.taxPorcentage = taxPorcentage;
    }
    
    
    
    
}
