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
 * @author Alex Cuzco, HoneyBadgers, DCCO - ESPE
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("ABSTRACTION Alex Cuzco");
        Animal animal = new Giraffe(0,"Gira", new Date(), 6, 4, "small spine", 30) ;
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("animal type is -->" + animal.getClass().getName());
        System.out.println("animal--> " + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Platypus( 2, "platypus ", new Date(), 7, true, 0, 4, "spine", 0);
        animals.add(animal);
        System.out.println("animal--> " + animal);
        System.out.println("animal type" + animal.getClass());
        
        System.out.println("\n");      
        animal.feed();
        System.out.println("\n");
        
        animal = new Giraffe(3, "girafus", new Date(), 5, 4, "big spine", 0);
        System.out.println("animal--> " + animal);
        System.out.println("animal type" + animal.getClass());
        //animal.brushNeck();
        
        animal.assignCage(6);
        Giraffe giraffe = new Giraffe( 2, "Giraf", new Date(2023, 1, 1), 3, 4, "very long", 206);
        animals.add(giraffe);
        System.out.println("other giraffe" + giraffe);
        giraffe.assignCage(10);
        System.out.println("\n");
        System.out.println("other giraffe" + giraffe);
        System.out.println("\n");
        
        if (giraffe instanceof Animal){
            System.out.println("giraffe os an animal instance");
            
        }
        animal.feed();
        
        giraffe.feed();
      
        
        giraffe.brushNeck();
        giraffe.breastfeed();
        giraffe.breastfeed(1);
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals-->" + animals.size());
        
    }
           
    
}
