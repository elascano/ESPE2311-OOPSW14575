package ec.edu.espe.chickenfFarm.view;

import ec.edu.espe.chickenfFarm.model.Chicken;
import ec.edu.espe.chickenfFarm.model.Egg;
import ec.edu.espe.chickenfFarm.model.Poop;
import java.util.Scanner;

/**
 *
 * @author Antonio Revilla 
 */

/**public class ChickenFarmSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Poop poop = new Poop();
        Egg egg =  new Egg();
        
        
        System.out.println("Enter the chicken id");
        id=scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the name of the chicken");
        name=scan.nextLine();
        
        System.out.println("Enter the color of the chicken");
        color=scan.nextLine();
        
        System.out.println("Enter the age of the chikend");
        age=scan.nextInt();
        scan.nextLine();
        
        System.out.println("The chicken is moltinh? ");
        isMolting=scan.hasNextBoolean();
        scan.nextLine();

        Chicken chicken = new Chicken(id,name,color,age,isMolting);
        System.out.println("Enter the chicken id");
        id=scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the name of the chicken");
        name=scan.nextLine();
        
        System.out.println("Enter the color of the chicken");
        color=scan.nextLine();
        
        System.out.println("Enter the age of the chikend");
        age=scan.nextInt();
        scan.nextLine();
        
        System.out.println("The chicken is moltinh? ");
        isMolting=scan.hasNextBoolean();
        scan.nextLine();
        Chicken chicken1 = new Chicken(id,name,color,age,isMolting);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("Chicken --> " + chicken1);
    }
} */

 
public class ChickenFarmSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Poop poop = new Poop();
        Egg egg =  new Egg();
        Chicken[] chicken = new Chicken[5];
        
        for(int i=0;i<5;i++){
            
        System.out.println("Enter the chicken id");
        id=scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the name of the chicken");
        name=scan.nextLine();
        
        System.out.println("Enter the color of the chicken");
        color=scan.nextLine();
        
        System.out.println("Enter the age of the chikend");
        age=scan.nextInt();
        scan.nextLine();
        
        System.out.println("The chicken is moltinh? ");
        isMolting=scan.hasNextBoolean();
        scan.nextLine();
        
        chicken[i] = new Chicken(id,name,color,age,isMolting);
        System.out.println("Chicken number -> " + (i+1) + chicken[i]);
            
        }
    }
}
