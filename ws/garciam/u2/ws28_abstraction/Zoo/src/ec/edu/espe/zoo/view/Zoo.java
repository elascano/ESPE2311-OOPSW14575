
package ec.edu.espe.zoo.view;
import ec.edu.espe.zoo.model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mateo
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("Polymorphysm by Mateo ");
        ArrayList<Animal> animals = new ArrayList<>();
        Animal animal = new Animal(0, "platypus", new Date(),1);
        System.out.println("Animal -->" + animal);
        System.out.println("animaltype" + animal.getClass());
        animals.add(animal);
        
        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific", new Date(), 0);
        System.out.println("Animal -->" + animal);
        System.out.println(animal.toString());
        animals.add(animal);

        animal = new Giraffe(4, "giraffe scientific", 206, 0, "giraffe scientific", new Date(), 0);
        System.out.println("animal --> " + animal);
        animals.add(animal);

        
        
        Giraffe giraffe = new Giraffe(4, "giraffe scientific", 206, 0, "giraffe scientific", new Date(), 0);
        giraffe.brushNeck();
        giraffe.breastfeed();
        giraffe.breastfeed(2);
        animals.add(giraffe);
        
        
        System.out.println("Zoo animals --> " + animals);
        System.out.println("total animals --> " + animals.size());
    }                
}
