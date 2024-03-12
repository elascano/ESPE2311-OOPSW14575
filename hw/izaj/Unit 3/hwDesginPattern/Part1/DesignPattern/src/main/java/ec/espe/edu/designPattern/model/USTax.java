
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class USTax {
    private static USTax instance;

    private USTax() {
    }
    
    public static USTax getInstance(){
        if(instance ==null)
            instance = new USTax();
        return instance;
    }
    
    public float salesTotal(){
        return 12;
    }
}
