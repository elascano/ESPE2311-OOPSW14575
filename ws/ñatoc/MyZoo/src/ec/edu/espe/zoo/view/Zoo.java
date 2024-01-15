package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Ñato, Coding Ninjas, DCC-ESPE
 */
public class Zoo {

    public static void main(String[] args) {
        System.out.println("POLYMORPHISM by Carlos Ñato");
        
        
        Animal animal = new Animal(0, "platypus", new Date(), 1);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("Animal-->" + animal);
        System.out.println("Animal type-->" + animal.getClass());

        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific", new Date(), 0);
        System.out.println("Animal-->" + animal);
        System.out.println("Animal type-->" + animal.getClass());

        animal = new Giraffe(0, "big sipe", 0, 0, "girafus", new Date(), 0);
        System.out.println("Animl-->" + animal);
        System.out.println("Animla type-->" + animal.getClass());

        Giraffe giraffe = new Giraffe(4, "long", 206, 0, "giraffa", new Date(2023, 1, 1), 3);
        animals.add(giraffe);
        System.out.println("other Giraffe-->" + giraffe);
        
        giraffe.brushNeck();
        
        System.out.println("giraffe is breastfeeding its baby");
        giraffe.breastFeed();
        giraffe.breastfeed(1);
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -->" + animals.size());
        

    }

}
