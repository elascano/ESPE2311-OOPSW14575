package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author David
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        int id=1;
        String name="Lucy";
        String color="Black and White";
        boolean isMolting = false;
        Date bornOnDate = new Date();
        
        Chicken chicken = new Chicken(id, name, color, isMolting, bornOnDate);
        System.out.println("Chicken ---> " + chicken);
        
        chicken.doStuff(5);
    }
}
