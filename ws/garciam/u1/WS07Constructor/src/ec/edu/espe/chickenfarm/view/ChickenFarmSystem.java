
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken(1,"lucy","white&Black", 2 , true);
        Chicken chicken2;
        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is --> Mateo Garcia (Cotbert)");
        System.out.println("poop -->" + poop);
        System.out.println("egg -->" + egg);
        System.out.println("chicken -->" + chicken);

    }
}
