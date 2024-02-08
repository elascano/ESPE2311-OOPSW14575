package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Arthropods;
import ec.edu.espe.zoo.model.Bee;
import ec.edu.espe.zoo.model.Crab;
import ec.edu.espe.zoo.model.Invertebrate;
import ec.edu.espe.zoo.model.Octopuses;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Zoo {

    public static void main(String[] args) {
        System.out.println("---> Polymrphish by Juan Granda ");
        
        Animal animal = new Bee(0, true, 0, 0, 0, 0, 0, "", "", 0, "", new Date(), 0);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animal.feed();
        System.out.println("Animal type is --> "+ animal.getClass().getSimpleName());
        System.out.println("Animal -->" + animal);
        System.out.println("Animal Type -->" + animal.getClass());
        

        animal = new Bee(1, true, 1, 2, 2, 0, 1, "flowers", "forest", 2, "Anthophila", new Date(), 0);
        animals.add(animal);
        
        animal.assignCageId(20);
        
        Bee bee = new Bee(0, true, 0, 0, 0, 0, 0, "", "", 0, "", new Date(), 0);
        bee.feed();
        
        System.out.println("Animal -->" + animal);
        System.out.println("Animal Type-->" + animal.getClass());
        Octopuses octopuses = new Octopuses(6, "Tomaterojiso", "No", true, 0, 0, "fish", "At sea", 3, "Loligo vulgaris", new Date(), 0);
        animals.add(octopuses);
        
        octopuses.breastfeed();
        octopuses.molluskLocation();
        octopuses.molluskLocation(600);
        Crab crab = new Crab(2, "si", true, 2, 1, "Algae", "River", 1, "Brachyura", new Date(), 1);
        animals.add(crab);
        
        
        System.out.println("Other Crab -->" + crab);
        crab.breastfeed();
        crab.breastfeed(10);
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("Total animals -->"+animals.size());
        

    }

}
