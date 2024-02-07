package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;

import ec.edu.espe.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Ñato
 */
public class Zoo {

    public static void main(String[] args) {
        System.out.println("ABSTRACT by Carlos Ñato");
        Animal animal = new Giraffe(0, "", 0, 0, "", new Date(), 0);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("animal type is --> " + animal.getClass().getSimpleName());
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());

        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());

        System.out.println("\n");
        animal.feed();
        System.out.println("\n");

        animal = new Giraffe(0, "big spine", 0, 0, "girafus", new Date(), 1);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        //animal.brushneck();
        animal.assignCage(20);
        Giraffe giraffe = new Giraffe(0, "long", 0, 0, "giraffa", new Date(2023, 1, 1), 3);
        animals.add(giraffe);
        System.out.println("other giraffe --> " + giraffe);
        giraffe.assignCage(25);
        System.out.println("\n");
        System.out.println("other giraffe --> " + giraffe);
        System.out.println("\n");

        System.out.println("\n instanceof");
        if (giraffe instanceof Animal) 
            System.out.println("giraffe is an animal instance");
       

        if (animal instanceof Animal) 
            System.out.println("animal is an animal");
        System.out.println("\n ");
        

        animal.feed();
        System.out.println("\n");

        giraffe.feed();

        giraffe.brushNeck();
        giraffe.breastfeed();
        giraffe.breastfeed(1);

        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -->" + animals.size());

    }

}
