package ec.edu.espe.operation.controller;

/**
 *
 * @author Admin
 */
public class BasicOperation {
 
    public float add(float addend1, float addend2){
        float sum;
        
        sum=addend1+addend2;
        
        return sum;
    }
    
    public float substract(float minuend, float subtrahend){
        float difference;
        
        difference = minuend - subtrahend;
        
        return difference;
    }
}
