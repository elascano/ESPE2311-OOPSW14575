package ec.esu.espe.zoo.view;

import ec.esu.espe.zoo.model.Animal;
import ec.esu.espe.zoo.model.Giraffe;
import ec.esu.espe.zoo.model.Platypus;
import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Zoo {
    public static void main(String[] args){
        Animal animal = new Animal(0,"Platypus",new Date(),1);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        
        animal = new Platypus(true, 0, 0, "spine small", 0, 0, "Platypus scientific", new Date(), 0);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        
        animal = new Giraffe(0, "big Spine", 0, 0, "girafus",new Date(), 0);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
    }
    
}
