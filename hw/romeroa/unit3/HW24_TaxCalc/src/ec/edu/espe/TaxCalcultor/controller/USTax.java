package ec.edu.espe.TaxCalcultor.controller;

/**
 *
 * @author EDWARICHSNAKE
 */
public class USTax {
    private static USTax instance;
    private float taxPercent;
    
    private USTax(){
        taxPercent = 1.2f;
    }
    
    public static USTax getInstance(){
        if(instance==null){
            instance = new USTax();         
        }
        return instance;
    }
    
    public float salesTotal(float firtsValue){
        float allValue = firtsValue;
        allValue = allValue*taxPercent;
        
        return allValue;
    }
}
