package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;


/**
 *
 * @author Luis Sagnay
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        
        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "Black&White", 2, true);
        Chicken chickens[] = new Chicken[5];
        
        Scanner sc = new Scanner(System.in);
         
        for (int i=0; i<5; i++){
            System.out.println("Chicken numer " + (i+1));
            System.out.print("Enter the chicken id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name of the chicken: ");
            name = sc.nextLine();
            System.out.print("Enter the color of the chicken: ");
            color = sc.nextLine();
            System.out.print("Enter the age of the chicken: ");
            age = sc.nextInt();
            System.out.print("Is the chicken molting? (true or false): ");
            isMolting = sc.nextBoolean();
            chickens[i] = new Chicken(id, name, color, age, isMolting);
        }
        
        System.out.println("Hello chickens from the simulator"); 
        System.out.println("My name is --> Luis Sagnay");
        
        for (int i=0; i<5; i++) {
            System.out.println("Chicken "+ (i+1) + "--> " +chickens[i]);
        }
        chicken.setId(9);
        System.out.println("New Chicken id --> " + chicken.getId());
        System.out.println("New Chicken name --> " + chicken.getName());
        System.out.println("Chicken --> " + chicken);
    }
}
  
