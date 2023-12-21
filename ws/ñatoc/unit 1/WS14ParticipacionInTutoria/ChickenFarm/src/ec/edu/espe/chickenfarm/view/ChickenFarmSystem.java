
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Date;


/**
 *
 * @author CarlosÑato,CodingNingas,DCCO-ESPE
 */
public class ChickenFarmSystem {
  
    public static void main(String[] args){
        int id = 1;
        String name = "Lucy";
        String color = "Write and brown";
        boolean isMolting = false;
        Date bornOnDate = new Date();
        
        Chicken chicken =  new Chicken(id, name, color, id, isMolting, bornOnDate, id);
        System.out.println("Chiken-->" + chicken);
        chicken.doStuuf(1);
        
    }
               
}
