package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Crab;
import ec.edu.espe.zoo.model.Scorpion;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Zoo {
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        
        Animal animal = new Animal(1,"Brachyura",new Date(2012,3,7),55);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        
        animals.add(animal);
        
        animal = new Crab(8.4f, false, 20, 15, "beach", 2, "Brachyura", new Date(2019,4,7), 38);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        
        animals.add(animal);
        
        animal = new Scorpion("neurotoxins LD50", false, 32, 0, "desert", 3, "Leiurus Quinquestriatus", new Date(2022,8,17), 27);
        System.out.println("animal ---> " + animal);
        System.out.println("animal type ---> " + animal.getClass());
        
        Scorpion scorpion = new Scorpion("neurotoxins LD50", false, 32, 0, "desert", 3, "Leiurus Quinquestriatus", new Date(2022,8,17), 27);
        
        scorpion.useStinger();
        scorpion.shedExoskeleton();
        scorpion.shedExoskeleton("yellow");
        
        animals.add(scorpion);
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("Total animals: " + animals.size());
    }
    
}
