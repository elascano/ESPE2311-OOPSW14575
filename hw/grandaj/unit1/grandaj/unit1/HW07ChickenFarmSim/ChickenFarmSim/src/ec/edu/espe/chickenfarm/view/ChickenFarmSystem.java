
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;




/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args){
        int number = 0;
        Chicken chickens[] = new Chicken[5];
        Scanner enter = new Scanner(System.in);

        Poop poop = new Poop();
        Egg egg =  new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "White&Black", 2, true);
        
        System.out.println("Hello Chickens from the Simulator");
        System.out.println("My name is --> Juan Granda");
        System.out.println("poop --> " + poop);
        System.out.println("egg --> " + egg);
        System.out.println("chicken -->" + chicken);
        
        System.out.println("HELLO WELCOME");
        System.out.println("Enter the number of chickens (1 to 5): ");
        number = enter.nextInt();
        if(number <= 5){
            for(int i=0;i<number;i++){
              System.out.println("Chicken["+(i+1)+"]");
              chickens[i]=addChickens();
            }
        }else{
            System.out.println("Sorry, number of chicken overdid it...");
        }     
}
    
    
    public static Chicken addChickens(){
        Scanner enter = new Scanner(System.in);
        int id = 0;
        String name = null ;
        String color = null ;
        int age = 0;
        boolean isMolting = false;
        
        
        System.out.println("Enter the id: ");
        id = enter.nextInt();
        enter.nextLine();
        System.out.println("Enter the name: ");
        name = enter.nextLine();
        System.out.println("Enter the color: ");
        color = enter.nextLine();
        System.out.println("Enter the age: ");
        age = enter.nextInt();
        System.out.println("Enter (True/False) is the chicken Molting? ");
        isMolting = enter.nextBoolean();
        Chicken chicken2 = new Chicken(id,name,color,age,isMolting);
        System.out.println("Chicken--"+chicken2);
        return chicken2;
    }
    }
    

    
    

