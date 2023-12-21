package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;



/**
 *
 * @author ILhan
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        int id;
        Chicken chickens[]= new Chicken[5];
        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "White&Black", true);
        
        System.out.println("Hello this is CHiken Simulator");
        System.out.println("My name is Ilhan");
        System.out.println("chicken --> " + chicken);
        
    }
}
