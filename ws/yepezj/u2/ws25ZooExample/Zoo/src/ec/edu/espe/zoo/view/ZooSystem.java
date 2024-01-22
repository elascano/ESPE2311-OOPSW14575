package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class ZooSystem {
    public static void main(String[] args) {
        System.out.println("POLYMORPHISM by JEFFERSON YEPEZ");
        Animal animal = new Animal(1, "Platypus", new Date(), 1);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("Animal -->" + animal);
        System.out.println("animaltype" + animal.getClass());
        
        animal = new Platypus(true, 4, 2, "spine small", 208, 2, "platypus scientific", new Date(), 3);
        animals.add(animal);
        System.out.println("Animal -->" + animal);
        System.out.println("animaltype" + animal.getClass());
        
        animal = new Giraffe(2, "big spine", 208, 3, "Giraffe", new Date(), 2);
        System.out.println("Animal -->" + animal);
        System.out.println("animaltype" + animal.getClass());
//        giraffe.brushNeck();
        
        Giraffe giraffe = new Giraffe(4, "big Spine", 206, 4, "giraffa", new Date(), 3);
        System.out.println("other Giraffe ---> " + giraffe);
        animals.add(giraffe);
        giraffe.brushNeck();
        
        giraffe.breastfeed();
        giraffe.breastfeed(1);
        
        System.out.println("\n ZOO ANIMALS: ");
        System.out.println(animals);
        System.out.println("Total animals ---> " + animals.size());
        
    }
}
