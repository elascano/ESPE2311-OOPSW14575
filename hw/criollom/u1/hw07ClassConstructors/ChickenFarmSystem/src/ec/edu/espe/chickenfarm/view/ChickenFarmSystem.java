
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author MateoCriollo,InterByte,DCCO-ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        Chicken chickens[]= new Chicken[5];
        Poop poop=new Poop();
        Egg egg= new Egg();
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello Chickens from the Simulator");
        System.out.println("My name is-->Mateo Criollo");
        System.out.println("Poop -->" + poop);
        System.out.println("Egg-->" +egg);
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Enter Id");
            id = scan.nextInt();
            scan.nextLine();
            
            
            System.out.println("Enter name");
            name = scan.nextLine();
            
            System.out.println("Enter color");
            color = scan.nextLine();
            
            System.out.println("Enter age");
            age = scan.nextInt();
            scan.nextLine();
            
            System.out.println("Is Molting?");
            isMolting = scan.nextBoolean();
            scan.nextLine();
            
            Chicken chicken= new Chicken(id, name, color, age, isMolting);
            
            chickens[i]=chicken;
            System.out.println("Chicken "+(i+1)+"-->"+ chickens[i]);
        }
    }
}
