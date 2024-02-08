package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Canary;
import ec.edu.espe.zoo.model.Vulture;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Ñato, Coding Ninjas, DCC-ESPE
 */
public class Zoo {

    public static void main(String[] args) {
        System.out.println("ABSTRACT by Carlos Ñato");
        ArrayList<Animal> animals = new ArrayList<>();
        Animal animal = new Vulture(true, 0, "Canadian", 0, 0,"Sarcorhamphus", new Date(), 0);
        animals.add(animal);
        System.out.println("Animal type is-->" + animal.getClass().getSimpleName());
        System.out.println("Animal-->" + animal);


        animal = new Canary("yellow", 0, "Azores", 0, 0, "Serinus canaria",new Date(), 0);
        animals.add(animal);
        System.out.println("Animal-->" + animal);
        System.out.println("Animal type-->" + animal.getClass());
        
        System.out.println("\n");

        animal = new Vulture(true, 0, "America", 0, 0, "Aegypius monachus", new Date(), 0);
        System.out.println("Animal-->" + animal);
        System.out.println("Animla type-->" + animal.getClass());
        animal.assignCage(30);
        
        System.out.println("\n");
        
        Vulture vulture = new Vulture(true, 0, "America", 0, 0, "Aegypius monachus", new Date(), 0);
        animals.add(vulture);
        System.out.println("other canary-->" + vulture);
        vulture.assignCage(45);
        
        System.out.println("\n");
        System.out.println("other vulture --> " + vulture);
        System.out.println("\n");  
        
        
        animal.feed();
        
        System.out.println("\n");
       
        vulture.feed();
        
        Canary canary =new Canary("red", 0, "American", 0, 0, "Serinus canaria", new Date(), 0);
         System.out.println("Canary --> " + canary);
         canary.sing();
         canary.hunt();
         canary.hunt(3);
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -->" + animals.size());
        

    }

}
