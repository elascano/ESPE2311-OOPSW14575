
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author MateoCriollo,InterByte,DCCO-ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        Poop poop=new Poop();
        Egg egg= new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "Black&White", 2, true);
        
        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is Mateo Criollo");
        System.out.println("Poop-->" + poop );
        System.out.println("Egg-->" + egg);
        System.out.println("chicken-->" + chicken);
        
        
        
    }
}
