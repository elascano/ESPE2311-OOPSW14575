package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Canary;
import ec.edu.espe.zoo.model.Vulture;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Ñato, Coding Ninjas, DCC-ESPE
 */
public class Zoo {

    public static void main(String[] args) {
        System.out.println("POLYMORPHISM by Carlos Ñato");
        Animal animal = new Animal(0, "vulture", new Date(), 1);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("Animal-->" + animal);
        System.out.println("Animal type-->" + animal.getClass());

        animal = new Vulture(true, 0, 0, "big", 0, 0, "vulture", new Date(), 0, true);
        System.out.println("Animal-->" + animal);
        System.out.println("Animal type-->" + animal.getClass());

        animal = new Canary(0, "big sipe", 0, 0, "Serinus canaria", new Date(), 0);
        System.out.println("Animal-->" + animal);
        System.out.println("Animla type-->" + animal.getClass());

        Canary canary = new Canary(4, "big", 206, 0, "canaria", new Date(2023, 1, 1), 3);
        animals.add(canary);
        System.out.println("other canary-->" + canary);
        
        canary.brushNeck();
        
        System.out.println("canary is eating baby");
        canary.breastFeed();
        canary.breastfeed(1);
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -->" + animals.size());
        

    }

}
