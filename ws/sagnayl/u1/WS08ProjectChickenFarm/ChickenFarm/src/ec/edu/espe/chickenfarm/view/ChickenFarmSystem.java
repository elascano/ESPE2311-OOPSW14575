package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class ChickenFarmSystem {
     public static void main(String[] args) {
    int id=1;
    String name="Lucy";
    String color="white and brown";
    boolean isMolting = false;
    Date bornDate = new Date();
    
    Chicken chicken = new Chicken(id, name, color, isMolting, bornDate);
        System.out.println("chicken-->" + chicken);
    
        chicken.doStuff(5);
        System.out.println("chicken ");
    }
}
