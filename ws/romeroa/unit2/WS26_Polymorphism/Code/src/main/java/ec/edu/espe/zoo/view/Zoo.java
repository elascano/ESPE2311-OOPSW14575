package ec.edu.espe.zoo.view;

import java.util.ArrayList;
import java.util.Date;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Platypus;

/**
 * @author Andrés Romero
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("----> Polymorphism (by Edison)");
        ArrayList<Animal> animals = new ArrayList<>();

        Animal animal = new Animal(0, "platypus", new Date(), 1);
        animals.add(animal);
        System.out.println("animal --> " + animal);
        System.out.println("animaltType " + animal.getClass());

        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific ", new Date(), 0);
        animals.add(animal);
        System.out.println("animal --> " + animal);
        System.out.println("animaltType " + animal.getClass());

        animal = new Giraffe(0, "Dorsal", 0, 0, "giraffus commonalis", new Date(), 0);
        System.out.println("animal --> " + animal);
        System.out.println("animaltType " + animal.getClass());

        Giraffe giraffe = new Giraffe(4, "Long", 206, 2, "giraffus commonalis", new Date(2023, 1, 1), 3);
        System.out.println("other Giraffe --> " + giraffe);
        animals.add(giraffe);

        giraffe.brushNeck();
        giraffe.breastFeed();
        giraffe.breastFeed(1);

        System.out.println("Zoo ANIMALS");
        System.out.println(animals);
        System.out.println("Total animals: " + animals.size());
    }
}
