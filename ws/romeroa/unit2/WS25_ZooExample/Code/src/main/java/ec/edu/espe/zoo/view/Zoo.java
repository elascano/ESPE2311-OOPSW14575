package ec.edu.espe.zoo.view;

import java.util.Date;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Platypus;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(0, "platypus", new Date(), 1);
        System.out.println("animal -->" + animal);
        System.out.println("animaltType" + animal.getClass());

        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific", new Date(), 0);
        System.out.println("Animal -->" + animal);
        System.out.println(animal.toString());

        animal = new Giraffe(0, "xd", 0, 0, "xd", new Date(), 0);
    }
}
