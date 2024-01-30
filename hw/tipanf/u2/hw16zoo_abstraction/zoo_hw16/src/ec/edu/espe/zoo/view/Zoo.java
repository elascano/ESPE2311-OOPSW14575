package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Crab;
import ec.edu.espe.zoo.model.Octopus;
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
        
        Animal animal = new Crab(8.4f, false, 20, 15, "beach", 1, "Brachyura", new Date(2019,4,7), 38);
        System.out.println("animal type ---> " + animal.getClass().getSimpleName());
        animal.reproduce();
        animal.cleanCage();
        animals.add(animal);
        
        animal = new Scorpion("neurotoxins LD50", false, 32, 10, "desert", 2, "Leiurus Quinquestriatus", new Date(2022,8,17), 27);
        System.out.println("animal type ---> " + animal.getClass().getSimpleName());
        animal.reproduce();
        
        Scorpion scorpion = new Scorpion("neurotoxins LD50", false, 32, 10, "desert", 2, "Leiurus Quinquestriatus", new Date(2022,8,17), 27);
        scorpion.cleanCage();
        animals.add(scorpion);
        
        animal = new Octopus(3.28f, 8, false, "soft", 30, "Coral Reef", 3, "Octopoda", new Date(2022,11,15), 26);
        
        System.out.println("animal type ---> " + animal.getClass().getSimpleName());
        animal.reproduce();
        animal.cleanCage();
        
        animals.add(animal);
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("Total animals: " + animals.size());
        
        //scorpion.useStinger();
        //scorpion.shedExoskeleton();
        //scorpion.shedExoskeleton("yellow");
        //System.out.println("animal ---> " + animal);
    }
    
}
