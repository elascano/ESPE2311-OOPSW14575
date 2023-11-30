package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ChickenFarmSystem {
    public static void main(String[] args){      
       // Chicken chicken=new Chicken(1,"Lucy","White",2, true);
       

        Chicken[] chickens=new Chicken[5];
        for(int i=0;i<5;i++){
            chickens[i]=addChicken();
            System.out.println("Chicken[i]--->"+i+chickens[i]);
        
        }
    }
    public static Chicken addChicken(){
        Chicken chicken;
        Scanner scan=new Scanner (System.in);
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        
        System.out.println("Type the id of the chicken");
        id=scan.nextInt();
        scan.nextLine();
        
        System.out.println("Type the name of the chicken");
        name=scan.nextLine();
        
        System.out.println("Type the color of the chicken");
        color=scan.nextLine();
        
        System.out.println("Type the age of the chicken");
        age=scan.nextInt();
        scan.nextLine();
        
        System.out.println("Is the chicken molting? (True/False)");
        isMolting=scan.nextBoolean();
        scan.nextLine();
        chicken=new Chicken(id, name, color, age, isMolting);
        return chicken;
    }
    
   
}
