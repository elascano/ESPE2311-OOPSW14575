
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Scanner;
/**
 *
 * @author Ilhan Rogel
 */
public class ChickenFarmSimulator {
public static void main(String[] args) {
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Poop poop = new Poop();
        Egg egg = new Egg();
        Scanner input = new Scanner(System.in);
        Chicken[] chicken = new Chicken[5];
        System.out.println("Hello chickens from the simulator"); 
        System.out.println("My name is -->Ilhan Rogel");
        
       for(int i=0; i<5;i++){ 
        System.out.println("Chicken id: ");
        id= input.nextInt();
        input.nextLine();
        
        System.out.println("Give the chicken a name: ");
        name= input.nextLine();
        
        System.out.println("What's the chicken color? ");
        color= input.nextLine();
        
        System.out.println("What's the chicken age? ");
        age= input.nextInt();
        input.nextLine();
        
        System.out.println("Is the chicken molting? (true/false) ");
        isMolting= input.nextBoolean();
        input.nextLine();
        
            chicken[i] = new Chicken(id, name, color, age, isMolting);
            System.out.println ("Chicken #" + (i+1) +" "+ chicken[i] );
            
            if (i<4){   
            System.out.println("------------");
            System.out.println("New chicken");
            }
       }
    }
}

