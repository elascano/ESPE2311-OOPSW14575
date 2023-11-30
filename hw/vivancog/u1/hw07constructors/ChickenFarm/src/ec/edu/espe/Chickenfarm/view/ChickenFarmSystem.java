
package ec.edu.espe.Chickenfarm.view;

import ec.edu.espe.Chickenfarm.model.Chicken;
import ec.edu.espe.Chickenfarm.model.Egg;
import ec.edu.espe.Chickenfarm.model.Poop;
import java.util.Scanner;


/**
 *
 * @author Gabriel Vivanco - Bit Coderz - DCCO ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Chicken[] chickens = new Chicken[5];
        for(int i=0; i<5; i++){
            System.out.println("Write your id chicken");
            id=scan.nextInt();
            scan.nextLine();
            
            System.out.println("Write name of the chicken");
            name=scan.nextLine();
            
            System.out.println("Write color of the chicken");
            color=scan.nextLine();
            
            System.out.println("Write the age of the chicken");
            age=scan.nextInt();
            scan.nextLine();
            
            System.out.println("Is the chicken molting? (True/False)");
            isMolting=scan.nextBoolean();
            scan.nextLine();
            
            chickens[i] = new Chicken(id,name,color,age,isMolting);
            System.out.println("Chicken" + (i+1) + "--->" + chickens[i] );
            
        }
        
   } 
}




