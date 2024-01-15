
package ec.edu.espe.zoo.view;
import ec.edu.espe.zoo.model.*;
import java.util.Date;

/**
 *
 * @author mateo
 */
public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(0, "platypus", new Date(),1);
        System.out.println("Animal -->" + animal);
        System.out.println("animaltype" + animal.getClass());
        
        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific", new Date(), 0);
        System.out.println("Animal -->" + animal);
        System.out.println(animal.toString());
        
        animal = new Giraffe(0, "xd", 0, 0, "xd", new Date(), 0);
    }                
}
