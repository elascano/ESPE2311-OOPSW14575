package ec.edu.espe.ChickenFarm.view;

import ec.edu.espe.ChickenFarm.model.Chicken;
import ec.edu.espe.ChickenFarm.model.Egg;
import ec.edu.espe.ChickenFarm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Frederick Tipán - Bit Coderz - DCCO ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
               
        Chicken[] chickens = new Chicken[5];
        
        addChickens(chickens);

    }
    
    public static void addChickens(Chicken chickens[]){
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Scanner scan = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            System.out.println("Set a chicken ID");
            id = scan.nextInt();
            scan.nextLine();
        
            System.out.println("Give the chicken a name");
            name = scan.nextLine();
        
            System.out.println("Set a color for the chicken");
            color = scan.nextLine();
        
            System.out.println("Set an age for the chicken");
            age = scan.nextInt();
            scan.nextLine();
        
            System.out.println("Is the chicken molting? (True/Flase)");
            isMolting = scan.nextBoolean();
            scan.nextLine();
            
            chickens[i] = new Chicken(id,name,color,age,isMolting);            
            System.out.println("Chicken " + (i+1) + "----->" + chickens[i] );
        }
    
    
    }
    
}
