
package ec.espe.edu.zoo.view;

import ec.espe.edu.zoo.model.Animal;
import ec.espe.edu.zoo.model.Giraffe;
import ec.espe.edu.zoo.model.Invertebrate;
import ec.espe.edu.zoo.model.Mammal;
import ec.espe.edu.zoo.model.Mollusk;
import ec.espe.edu.zoo.model.Mussel;
import ec.espe.edu.zoo.model.Platypus;
import ec.espe.edu.zoo.model.Poriferous;
import ec.espe.edu.zoo.model.Pulpo;
import ec.espe.edu.zoo.model.RedTreeSponge;
import ec.espe.edu.zoo.model.Slug;
import ec.espe.edu.zoo.model.TubeSponge;
import ec.espe.edu.zoo.model.Vertebrate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println(" --->Abstract class by Mateo Criollo");
        ArrayList <Animal> animals= new ArrayList <>();
        Animal animal = new Giraffe(2, "columnra", 0, 0, "giraffe", new Date(), 0);
        System.out.println("animal--> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        animals.add(animal);
        
        animal = new Platypus(true, 0, 0, "spine", 0, 0, "platypus ciemtificName", new Date(), 0);
        
        System.out.println("");
        System.out.println("animal ->> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        animals.add(animal);
        animal.feed();
        
        animal = new Giraffe(2, "long", 2, 3, "girafa", new Date(2023,1,1), 206);
        System.out.println("");
        //animal.brushNeck;
        System.out.println("animal ->> "+animal);
        System.out.println(" animal type --->" +animal.getClass());
        animal.feed();
        
        System.out.println("Cambio de cageid");
        animal.assingCage(56);
        System.out.println("animal ->> "+animal);
        
        
        
        
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
        
        
        //Create list invertebrate
        System.out.println("\n");
        System.out.println("Abstract Method with Invertebrate");
        ArrayList<Animal> invertebrateAnimals = new ArrayList<>();

        System.out.println("");
        
        //animal=new Invertebrate();
       // animal=new Poriferous();
        
        
        animal = new Mussel(15, "Dura", true, "Sesil", "Asimetrico", 0, "Bacterias", "Water", "Asexual", 0, "Mussel", new Date(), 0);
        System.out.println("animal---> "+animal);
        System.out.println("Type animal--> "+animal.getClass().getName());
        System.out.println("Type animal--> "+animal.getClass());
        invertebrateAnimals.add(animal);
        animal.breathe();
        animal.registerMetamorphose(true, animal.getCiemtificName());
        
        System.out.println("");
        
        animal =  new TubeSponge("Hologram", 45, "Asimetrico", 0, "Bacterias", "Water", "Asexual", 0, "Tube Sponge", new Date(), 0);
        System.out.println("animal---> "+animal);
        System.out.println("Type animal--> "+animal.getClass().getName());
        System.out.println("Type animal--> "+animal.getClass());
        invertebrateAnimals.add(animal);
        animal.breathe();
        animal.registerMetamorphose(false, animal.getCiemtificName());
        
        System.out.println("");
        
        animal = new Pulpo(45, "Veneno", true, "Tentaculos", "simetrico", 8, "Organismos", "Water", "Asexual", 12, "Pulpo", new Date(), 134);
        System.out.println("animal---> "+animal);
        System.out.println("Type animal--> "+animal.getClass().getName());
        System.out.println("Type animal--> "+animal.getClass());
        invertebrateAnimals.add(animal);
        animal.breathe();
        animal.registerMetamorphose(true, animal.getCiemtificName());
        
        System.out.println("");
        
        System.out.println("\n ZOO Animals Invertebrate ");
        System.out.println(invertebrateAnimals);
        System.out.println("total animal "+invertebrateAnimals.size());
        
    }
}
