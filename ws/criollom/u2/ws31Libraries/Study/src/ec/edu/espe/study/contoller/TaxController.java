
package ec.edu.espe.study.contoller;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class TaxController {
    static float ivaPorcentage = 12.0f;
    static float min=1500.35f;
    
    public static float computerIva(float amount){
        float iva;
        iva=amount * ivaPorcentage/100;
        return iva;
    }
    
    public static float computerPVP(float amount){
        float total;
        
        total= amount + computerIva(amount);
        return total;
                
    }
}
