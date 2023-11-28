
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;


/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "White&Black", 2, true);
        Chicken chicken2 = new Chicken(2, "Juan", "Yellow", 1, true);
        
        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is --> Jefferson David Yepez Moran");
        System.out.println("poop -->" + poop);
        System.out.println("egg -->" + egg);
        System.out.println("chicken -->" + chicken);
        System.out.println("chicken2 -->"+ chicken2 );
             
        Chicken[] chickenArray = createChickens();

        System.out.println("Additional 5 chickens:");
        for (Chicken additionalChicken : chickenArray) {
            System.out.println(additionalChicken);
        }
    }
        
        
    public static Chicken[] createChickens() {
        Chicken[] chickens = new Chicken[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { 
            System.out.println("Chicken id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Chicken name: ");
            String name = scanner.nextLine();
            System.out.println("Chicken color:");
            String color = scanner.nextLine();
            System.out.println("Chicken age: ");
            int age = scanner.nextInt();
            System.out.println("Chicken is molting: ");
            boolean isLayingEggs = scanner.nextBoolean();
            scanner.nextLine();
            chickens[i] = new Chicken(id, name, color, age, isLayingEggs);

        }
        
        return chickens;
    }
    

}
