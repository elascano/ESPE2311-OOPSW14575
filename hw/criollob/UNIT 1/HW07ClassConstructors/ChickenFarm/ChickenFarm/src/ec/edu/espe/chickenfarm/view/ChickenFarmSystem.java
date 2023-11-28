
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;
/**
 *
 * @author Sebastian Criollo,INTER BYTE,DCCO-ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args){
       Chicken chickens[]= new Chicken[5];
       Poop poop = new Poop ();
       Egg egg = new Egg();
       Chicken chicken = new Chicken(1,"Lucy","WhiteyBlack",2,true);
        

       Scanner scanner = new Scanner(System.in);
       
       for (int i=0; i < chickens.length;i++){
           System.out.println("Enter the ID of the chicken =");
           int id = scanner.nextInt();
           
           scanner.nextLine();
           
           System.out.println("Enter the name=");
           String name = scanner.nextLine();
           
           System.out.println("Enter the color=");
           String color =scanner.nextLine();
           
           System.out.println("enter the age=");
           int age= scanner.nextInt();
           
           System.out.println("Is the chicken molting (T-F)");
           boolean isMolting = scanner.nextBoolean();
           
           chickens[i] = new Chicken(id,name,color,age,isMolting);
           if(i< chickens.length - 1){
               System.out.println("Next Chicken");
               
           }
       }
  
        System.out.println("Details of the 1.- Chicken");
        
        System.out.println(chicken.toString());System.out.println("Details");
        for(Chicken c : chickens){
            if (c!= null ){
                System.out.println(c.toString());
            }
        }
    }
    
}
