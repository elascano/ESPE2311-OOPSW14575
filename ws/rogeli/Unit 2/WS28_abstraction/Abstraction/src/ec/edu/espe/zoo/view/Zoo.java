
package ec.edu.espe.zoo.view;
import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Mammal;
import ec.edu.espe.zoo.model.Platypus;
import ec.edu.espe.zoo.model.Vertebrate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Zoo {
    public static void main(String[]args){
        System.out.println("Ilhan Rogel Abstraction Workshop");
        Animal animal = new Giraffe(0, "heavy", 0, 0, "Giraffe", new Date(), 0);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("animal type is --->" + animal.getClass().getSimpleName());
        System.out.println("animal --->" + animal);
        System.out.println("animal type---->" + animal);
        
        animal= new Platypus(true, 0, 4, "spine", 0, 0, "scientificName", new Date(), 0);
        animals.add(animal);
        System.out.println("Animal -->"+ animal);
        System.out.println("animal type" + animal.getClass());
        
        System.out.println("\n");
        animal.feed();
        System.out.println("\n");
        
        animal = new Giraffe(4, "big spine", 0, 1, "giraffe", new Date(), 1);
        animals.add(animal);
        System.out.println("Animal -->"+ animal);
        System.out.println("animal type" + animal.getClass());
        animal.assignCage(20);
        System.out.println("\n");
        animal.feed();
        System.out.println("\n");
        Giraffe giraffe = new Giraffe(4, "long spine", 206, 2, "giraffe scientificName", new Date(2023-1-12), 1);
        animals.add(giraffe);
        System.out.println("Other Giraffe-->"+ animal);
        animal.assignCage(25);
        System.out.println("Other Giraffe-->"+ animal);
        
        System.out.println("\n");
        giraffe.feed();
        System.out.println("\n");

        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("Total animals --->"+ animals.size());
    }
}
