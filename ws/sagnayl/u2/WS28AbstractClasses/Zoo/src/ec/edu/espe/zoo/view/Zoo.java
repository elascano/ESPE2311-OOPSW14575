package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Kangaroo;
import ec.edu.espe.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("ABSTRACT CLASSES by LUIS SAGNAY");
        Animal animal = new Giraffe(0,"light", 100, 0, "Gir", new Date(),0);
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        
        System.out.println("animal -->" +animal);
        System.out.println("animal type" +animal.getClass());
        
        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" +animal);
        System.out.println("animal type" +animal.getClass());
        
        System.out.println("\n");
        animal.feed();
        System.out.println("\n");
        
        animal = new Giraffe(0, "big spine", 0, 1, "giraffe scientific", new Date(), 2);
        System.out.println("animal -->" +animal);
        System.out.println("animal type" +animal.getClass());
        //animal.brushNeck();
        
        Giraffe giraffe = new Giraffe (4,"long", 206, 2, "Giraffe", new Date(2023,1,1), 3);
        animals.add(giraffe);
        System.out.println("other Giraffe -->" +giraffe);
        giraffe.assignCage(25);
        System.out.println("\n");
        
        animal.feed();
        System.out.println("\n");

        giraffe.feed();
        
        giraffe.brushNeck();
        giraffe.breastfeed();
        giraffe.breastfeed(1);
        
        Kangaroo kangaroo = new Kangaroo(1, 4, "large", 200, 1, "Kangaroo scientific", new Date(), 5);
        animals.add(kangaroo);
        System.out.println("Kanguroo --> " +kangaroo);
        
        kangaroo.breastfeed();
        kangaroo.breastfeed(2);
        kangaroo.run();
        kangaroo.run(10);
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -->" +animals.size());
    }
}
