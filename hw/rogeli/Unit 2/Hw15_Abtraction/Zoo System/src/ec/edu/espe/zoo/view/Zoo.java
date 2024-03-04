package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Ant;
import ec.edu.espe.zoo.model.Invertebrate;
import ec.edu.espe.zoo.model.Squid;
import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Zoo {
    public static void main(String[]args){
        Invertebrate animal = new Squid(true, "pointed", "Dont have", "none", 0, "Scientific name", new Date(), 1);
        System.out.println("animal--> "+ animal);
        System.out.println("animal type" + animal.getClass());
        
        animal= new Ant("Underground", "Alive", 1, "Ant", new Date(), 2);
        System.out.println("Animal -->"+ animal);
        System.out.println("animal type" + animal.getClass());
        System.out.println("\n");
        animal.assignCage(10);
        animal.locomotion();
        System.out.println("\n");
        
        animal = new Squid(true, "pointed", "Squid dont have shell", "none", 0, "Squid", new Date(2023-12-12), 0);
        System.out.println("Another squid -->"+ animal);
        System.out.println("animal type" + animal.getClass());
        System.out.println("\n");
        animal.assignCage(20);
        animal.locomotion();
        System.out.println("\n");
    }    
}
