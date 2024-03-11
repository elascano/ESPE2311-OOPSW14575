package ec.edu.espe.taxcal.model;

/**
 *
 * @author Frederick
 */
public class USTax {
    private static USTax instance;
    private float taxPercentage;
    
    private USTax(){
        taxPercentage = 12;
    }
    
    public static USTax getInstance(){
        if(instance == null){
            instance = new USTax();
        }
        return instance;
    }
    
    public float salesTotal(float initialValue){
        float totalValue = initialValue;
        totalValue *= taxPercentage/100;
        totalValue += initialValue;
        
        return totalValue;
    }
    
    public void updateTaxPercentage(float updatedValue){
        taxPercentage = updatedValue;
    }
    
    public float getTaxPercentage(){
        return taxPercentage;
    }
    
}
