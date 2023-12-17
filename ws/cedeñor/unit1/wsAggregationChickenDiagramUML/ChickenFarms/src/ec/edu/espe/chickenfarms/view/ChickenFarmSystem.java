
package ec.edu.espe.chickenfarms.view;

import ec.edu.espe.chickenfarms.model.Chicken;
import java.util.Date;

/**
 *
 * @author RC_558
 */
public class ChickenFarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int id = 1;
        String name = "Lucy";
        String color = "White & Brown";
        boolean isMolting = true;
        Date bornOnDate = new Date ();
        
        Chicken chicken = new Chicken (id, name, color, id, isMolting, bornOnDate);
        System.out.println("Chicken ---> " + chicken);
        
        chicken.doStuff(5);
        
    }
    
}
