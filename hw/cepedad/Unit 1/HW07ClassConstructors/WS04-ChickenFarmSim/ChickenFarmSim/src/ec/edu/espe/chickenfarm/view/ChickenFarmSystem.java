package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author David Cepeda, DCCO ESPE
 */
import java.util.Scanner;
public class ChickenFarmSystem {
    public static void main(String[] args) {
        Chicken chickens[] = new Chicken[5];
        Poop poop = new Poop();
        Egg egg= new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "White&Black", 2, true);
       
         Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < chickens.length; i++) {
            System.out.println("Enter the ID of the chicken:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            System.out.println("Enter the name of the chicken:");
            String name = scanner.nextLine();

            System.out.println("Enter the color of the chicken:");
            String color = scanner.nextLine();

            System.out.println("Enter the age of the chicken:");
            int age = scanner.nextInt();

            System.out.println("Is the chicken molting? (true/false):");
            boolean isMolting = scanner.nextBoolean();

            chickens[i] = new Chicken(id, name, color, age, isMolting);

            if (i < chickens.length - 1) {
                System.out.println("Next Chicken");
            }
        }

        System.out.println("Details of the first chicken:");
        
        System.out.println(chicken.toString()); System.out.println("Details of the chickens:");
        for (Chicken c : chickens) {
            if (c != null) {
                System.out.println(c.toString());
            }
        }

        
    }
}