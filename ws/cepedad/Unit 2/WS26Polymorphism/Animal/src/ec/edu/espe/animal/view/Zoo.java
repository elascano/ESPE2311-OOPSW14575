package ec.edu.espe.animal.view;

import ec.edu.espe.animal.model.Animal;
import ec.edu.espe.animal.model.Canary;
import ec.edu.espe.animal.model.Clownfish;
import ec.edu.espe.animal.model.Crow;
import ec.edu.espe.animal.model.Eagle;
import ec.edu.espe.animal.model.Owl;
import ec.edu.espe.animal.model.Penguin;
import ec.edu.espe.animal.model.Salmon;
import ec.edu.espe.animal.model.Shark;
import ec.edu.espe.animal.model.Troat;
import ec.edu.espe.animal.model.Tuna;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("ABSTRACT by DAVID CEPEDA");
        Animal animal = new Canary(true, "Metal", "Canary", true, "Yellow", "Small Spine", 0, 0, "Canaria", new Date(2023,12, 12), 4);
        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());       
        
        animal = new Salmon(true, 0, "Ocean", true, "Salmo", "Brown", "small spine", 0, 0, "salmonus", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Shark(true, 10, "Ocean", true, "Shark", "Grey", "Big Spine", 0, 0, "Selachimorpha", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Troat(true, 0, "River", false, "Troat", "Grey", "Small Spine", 0, 0, "Oncorhynchus mykiss", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Clownfish(true, "White and Orange", "Ocean", true, "Clownfish", "White and Orange", "Small Spine", 0, 0, "Amphiprion ocellaris", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Tuna(true, 0, "Ocean", true, "Tuna", "Grey", "Smal Spine", 0, 0, "Thunnus", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Eagle(true, "nature", "Eagle", true, "Black and White", "small spine", 0, 0, "Aquila chrysaetos", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Crow(true, "Nature", "Crow", true, "Black", "Small Spine", 0, 0, "Corvus corax", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Penguin(0, true, "Penguin", true, "Black and White", "Small Spine", 0, 0, "Spheniscidae", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Owl(true, "Mouse", "Owl", true, "Brown", "Small Spine", 0, 0, "Strigiformes", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        animal = new Canary(true, "Metal", "Canary", true, "Yellow", "Small Spine", 0, 0, "Serinus canaria", new Date(), 0);
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        Salmon salmon = new Salmon(true, 0, "Ocean", true, "Salmon", "Grey", "Small spine", 0, 0, "Salmonus", new Date(2021, 1, 12), 0);
        animals.add(salmon);
        System.out.println("other salmon --> " + salmon);
        
        salmon.swim();
        salmon.swim(1);
        
        Crow crow = new Crow(true, "Nature", "Crow", true, "Black", "Small Spine", 0, 0, "Corvus corax", new Date(2023, 12, 7), 0);
        animals.add(crow);
        System.out.println("other crow --> " + crow);
        
        System.out.println("\n");
        
        crow.migrate();
        crow.migrate(1);
        
        System.out.println("\n");
        
        Canary canary = new Canary(true, "Metal", "Canary", true, "Yellow", "Small Spine", 0, 0, "Canaria", new Date(2023,12, 12), 4);
        animals.add(canary);
        System.out.println("other canary --> " + canary);
        canary.feed();
        System.out.println("animal -->" + animal);
        System.out.println("animal type" + animal.getClass());
        
        
        System.out.println("\n");
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -->" + animals.size());
    }   
    
}
