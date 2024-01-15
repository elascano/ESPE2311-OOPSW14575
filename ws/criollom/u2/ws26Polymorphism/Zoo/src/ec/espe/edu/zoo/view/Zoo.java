
package ec.espe.edu.zoo.view;

import ec.espe.edu.zoo.model.Animal;
import ec.espe.edu.zoo.model.Giraffe;
import ec.espe.edu.zoo.model.Platypus;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Zoo {
    public static void main(String[] args) {
        ArrayList <Animal> animals= new ArrayList <>();
        Animal animal = new Animal(0, "Platyphus", new Date(), 1);
        System.out.println("animal--> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        animals.add(animal);
        
        animal = new Platypus(true, 0, 0, "spine", 0, 0, "platypus ciemtificName", new Date(), 0);
        
        System.out.println("");
        System.out.println("animal ->> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        animals.add(animal);
        
        animal = new Giraffe(2, "long", 2, 3, "girafa", new Date(2023,1,1), 206);
        System.out.println("");
        //animal.brushNeck;
        System.out.println("animal ->> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        System.out.println("");
        
        Giraffe giraffe = new Giraffe(4, "245", 2, 3, "girafa", new Date(2023,1,1), 45);
        System.out.println("Other giraffe-->"+giraffe);
        giraffe.brushNeck();
        giraffe.breastFeed();
        giraffe.breastFeed(1);
        
        animals.add(giraffe);
        
        System.out.println("\n ZOO Anmials");
        System.out.println(animals);
        System.out.println("total animal "+animals.size());
    }
}
