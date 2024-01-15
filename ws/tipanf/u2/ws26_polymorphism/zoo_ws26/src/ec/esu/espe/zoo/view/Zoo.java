package ec.esu.espe.zoo.view;

import ec.esu.espe.zoo.model.Animal;
import ec.esu.espe.zoo.model.Giraffe;
import ec.esu.espe.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Zoo {
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        
        Animal animal = new Animal(0,"Platypus",new Date(),1);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        
        animals.add(animal);
        
        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "Platypus scientific", new Date(), 0);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        
        animals.add(animal);
        
        animal = new Giraffe(0, "big Spine", 0, 0, "girafus",new Date(), 0);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        //animal.brushNeck();
        
        Giraffe giraffe = new Giraffe(4, "long", 206, 2, "Giraffa camelopardalis", new Date(2023,1,1), 3);
        
        giraffe.brushNeck();
        
        giraffe.breastFeed();
        giraffe.breastFeed(1);
        
        animals.add(giraffe);
        
         System.out.println("\n ZOO ANIMALS");
         System.out.println(animals);
         System.out.println("Total animals: " + animals.size());
        
        
    }
    
}
