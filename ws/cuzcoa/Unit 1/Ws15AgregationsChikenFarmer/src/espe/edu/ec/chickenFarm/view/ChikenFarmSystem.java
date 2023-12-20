
package espe.edu.ec.chickenFarm.view;

import espe.edu.ec.chickenFarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class ChikenFarmSystem {
    public static void main(String[] args) {
        int id=1;
        String name ="Lucy";
        String color = "White";
        boolean inMolting =false;
        Date BornOnDate =new Date();
                
        Chicken chicken = new Chicken(id, name, color, id, inMolting, BornOnDate);
        System.out.println("chicken-->" + chicken);
        
        chicken.doStuff(5);
        
        
        
    }
    
}
