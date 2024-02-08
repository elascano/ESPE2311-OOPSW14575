package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("POLYMORPHISM by LUIS SAGNAY");
        Animal animal = new Animal(0,"platypues",new Date(),1);
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        
        System.out.println("animal -->" +animal);
        System.out.println("animal type" +animal.getClass());
        
        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "platypus scientific", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" +animal);
        System.out.println("animal type" +animal.getClass());
        
        animal = new Giraffe("Brown", 0, "big spine", 0, 1, "giraffe scientific", new Date(), 2);
        System.out.println("animal -->" +animal);
        System.out.println("animal type" +animal.getClass());
        //animal.brushNeck();
        
        Giraffe giraffe = new Giraffe ("Brown", 4,"long", 206, 2, "Giraffe", new Date(2023,1,1), 3);
        animals.add(giraffe);
        System.out.println("other Giraffe -->" +giraffe);
        
        giraffe.brushNeck();
        giraffe.breastfeed();
        giraffe.breastfeed(1);
     
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -->" +animals.size());
    }
}
