package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Arthropod;
import ec.edu.espe.zoo.model.GardenSnail;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Animal(0, "platypus", new Date(), 1);
        System.out.println("animal: " + animal);
        System.out.println("animal type: " + animal.getClass());

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);

        animal = new Platypus(true, 2, 4, "SpineType", 206, 2, "Ornithorhynchus anatinus", new Date(), 102);
        System.out.println("animal (platypus): " + animal);
        System.out.println("animal (platypus type): " + animal.getClass());

        animals.add(animal);

        Giraffe giraffe = new Giraffe(500, 4, "SpineType", 208, 3, "Giraffa camelopardalis", new Date(), 103);
        System.out.println("animal(giraffe): " + giraffe);
        System.out.println("animal(giraffe type): " + giraffe.getClass());
        giraffe.brushNeck();
        giraffe.breastFeed();
        giraffe.breastFeed(1);
        animals.add(animal);

        System.out.println("\n *****ZOO ANIMALS********\n");
        System.out.println(animals);
        System.out.println("total animals -> " + animals.size());

        System.out.println("\n\nZoo system by Olivier \"la leyenda\" Paspuel");
        
        GardenSnail snail = new GardenSnail("Brown", 5.0f, "Spiral", 2, "ExoskeletonType",
                1, 123, "Helix aspersa", new Date(), 456);
        System.out.println(snail);
        snail.produceMucus();
        snail.produceMucus(10, "grams");
    }

}
