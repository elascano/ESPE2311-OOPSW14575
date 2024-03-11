
package ec.edu.espe.zoo.view;
import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Platypus;
import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Zoo {
    public static void main(String[]args){
        Animal animal = new Animal(0, "Platypus" , new Date() , 0);
        System.out.println("animal--> "+ animal);
        System.out.println("animal type" + animal.getClass());
        
        animal= new Platypus(true, 0, 0, "spine", 0, 0, "scientificName", new Date(), 0);
        System.out.println("Animal -->"+ animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Giraffe(0, "spine", 0, 0, "scientificName", new Date(), 1);
        System.out.println("Animal -->"+ animal);
        System.out.println("animal type" + animal.getClass());
    }
}
