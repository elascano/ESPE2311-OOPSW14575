
package ec.edu.espe.view;

import ec.edu.espe.model.Animal;
import ec.edu.espe.model.Giraffe;
import ec.edu.espe.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Zoo {
 public static void main(String[] args) {
        
        System.out.println("Polymorphism by Criollo Sebastian");
        Animal animal= new Animal (0, "Platypus", new Date(), 1);
            ArrayList<Animal> animals = new ArrayList<>();
            animals.add(animal);
            
        System.out.println("animal-->" +animal);
        System.out.println("animal type-->" +animal.getClass());
        
        System.out.println("");
        animal= new Platypus(1, "platypus", new Date(), 2, "spine small", 0, 4, true, 5);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type-->" +animal.getClass());
        
        System.out.println("");
        animal= new Giraffe(2, "jira", new Date(), 3, "Big spine", 30, 4 );
        System.out.println("animal -->" + animal);
        System.out.println("animal type-->" +animal.getClass());
        
        System.out.println("");
        Giraffe giraffe= new Giraffe (4, "girafa", new Date (2023, 1 ,1), 3, "long", 200, 4);
        animals.add(giraffe);
        System.out.println("other giraffe-->" +giraffe);
        
        giraffe.brushNeck();
        

        giraffe.breastfeed();
        giraffe.breastfeed(1);
        
        System.out.println("\n Zoo Animals");
        System.out.println(animals);
        System.out.println("total animals -->" +animals.size());
}
