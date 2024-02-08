
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
        Butterfly butterfly = new Butterfly("white", 12, 6, false, "exo", "body_head_ants", "fores", "sexual", 1, "macrolepidopteran suborder", new Date(), 3);
        System.out.println("butterfly --> " + butterfly.toString());
        butterfly.shedSkin();
        butterfly.shedSkin("red");
        
    }                
}
