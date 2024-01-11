
package ec.espe.edu.zoo.view;

import ec.espe.edu.zoo.model.Animal;
import ec.espe.edu.zoo.model.Giraffe;
import ec.espe.edu.zoo.model.Platypus;
import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(0, "Platyphus", new Date(), 1);
        System.out.println("animal--> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        
        animal = new Platypus(true, 0, 0, "spine", 0, 0, "platypus ciemtificName", new Date(), 0);
        
        System.out.println("");
        System.out.println("animal ->> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        
        animal = new Giraffe(0,"Spine", 0, 0, "ciemtificName", new Date(), 0);
        System.out.println("");
        System.out.println("animal ->> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        
        
        
    }
}
