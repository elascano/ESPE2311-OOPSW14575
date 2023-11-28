package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop; 
import java.util.Scanner;

/** arreglo 5 pollitos, 
 /ctrl + shift + i aparaecen los import,
 * ctrl + tab = abren datos de chicken**/

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
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
        
        for (int i=0; i<5; i++){
            
            System.out.println("Insert a chicken ID:");
            id = scan.nextInt();
            scan.nextLine();
        
            System.out.println("Insert a chicken name:");
            name = scan.nextLine();
        
            System.out.println("Insert a chicken color:");
            color = scan.nextLine();
        
            System.out.println("Insert a chicken age:");
            age = scan.nextInt();
        
            System.out.println("Is the chicken molting?:");
            isMolting = scan.nextBoolean();
            scan.nextLine();
            
            chickens[i] = new Chicken(id, name, color, age, isMolting);
            System.out.println("Chicken" + (i+1) + "--->" + chickens[i]);
        
        }
    
    
    }
        
        
    /*    int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insert a chicken ID:");
        id = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Insert a chicken name:");
        name = scan.nextLine();
        
        System.out.println("Insert a chicken color:");
        color = scan.nextLine();
        
        System.out.println("Insert a chicken age:");
        age = scan.nextInt();
        
        System.out.println("Is the chicken molting?:");
        isMolting = scan.nextBoolean();
        scan.nextLine();
        
        Chicken chicken1 = new Chicken(id, name, color, age, isMolting);
        System.out.println("Insert a chicken ID:");
        id = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Insert a chicken name:");
        name = scan.nextLine();
        
        System.out.println("Insert a chicken color:");
        color = scan.nextLine();
        
        System.out.println("Insert a chicken age:");
        age = scan.nextInt();
        
        System.out.println("Is the chicken molting?:");
        isMolting = scan.nextBoolean();
        scan.nextLine();
        
        Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        
        System.out.println("Chicken 1 --->" + chicken1);
        System.out.println("Chicken 2 --->" + chicken2); */

        
    }  

    private static void addChickens(Chicken[] chickens) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
