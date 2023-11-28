
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author CarlosÑato,Error 404,DCCO-ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args){
        Chicken chickens [] = new Chicken[5];
        Poop poop = new Poop();
        Egg egg =  new Egg();
        Scanner scanner = new Scanner(System.in);
        
        for(int  i = 0; i<5; i++){
            System.out.println("Ingrese los datos del pollo " + (i+1)+ " :");
    
            System.out.println("ID:");
            int id = scanner.nextInt() ;
         
            scanner.nextLine();
                
            System.out.println("Name:");
            String name = scanner.nextLine();
        
            System.out.println("Color:");
            String color = scanner.nextLine();
        
            System.out.println("Age:");
            int age = scanner.nextInt();
        
            System.out.println("Is the chick molting?(true/false):");
            boolean inMolting = scanner.nextBoolean();
        
            chickens [i] = new Chicken(id, name, color, id, inMolting);
        }
        System.out.println("Hello Chickens from the Simulator");
        System.out.println("My name is --> CarlosÑato");
        for(Chicken chicken : chickens){
            
            System.out.println("Chicken--> " + chicken );
        }
        System.out.println("poop --> " + poop);
        System.out.println("egg --> " + egg);
        
    }
    
}
