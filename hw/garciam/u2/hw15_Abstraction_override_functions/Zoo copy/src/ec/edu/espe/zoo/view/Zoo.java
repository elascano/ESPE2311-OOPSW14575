
package ec.edu.espe.zoo.view;
import ec.edu.espe.zoo.model.*;
import java.util.Date;

/**
 *
 * @author mateo
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("Zoo Mateo García");
        
        Animal animal;
       
        
        animal = new Butterfly("white", 12, 6, false, "exo", "body_head_ants", "fores", "sexual", 1, "macrolepidopteran suborder", new Date(), 3);
        animal.checkByAZoologist(3); 
        animal.cleanCage();
        System.out.println("butterfly --> " + animal.toString());
        
        
        animal = new Octopus("blue", 8, "core", 2, "strong", "sea", "sexual", 4, "octupus scientific", new Date(), 9); 
        animal.checkByAZoologist(3); 
        animal.cleanCage();
        System.out.println("butterfly --> " + animal.toString());
        
    }                
}
