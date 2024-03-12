
package ec.espe.edu.calculatorIva.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class EcTax {
    private static EcTax instance;
    private float taxPorcentage;
    
    private EcTax(){
        taxPorcentage = 12;
    }

    public static EcTax getInstanceEcTax(){
        if(instance ==null){
            instance = new EcTax();
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
