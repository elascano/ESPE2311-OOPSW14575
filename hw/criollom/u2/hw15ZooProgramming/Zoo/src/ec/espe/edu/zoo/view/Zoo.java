
package ec.espe.edu.zoo.view;

import ec.espe.edu.zoo.model.Animal;
import ec.espe.edu.zoo.model.Giraffe;
import ec.espe.edu.zoo.model.Mollusk;
import ec.espe.edu.zoo.model.Platypus;
import ec.espe.edu.zoo.model.Slug;
import ec.espe.edu.zoo.model.TubeSponge;
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
        
        
        //Create list invertebrate
        System.out.println("\n");
        ArrayList<Animal> invertebrateAnimals = new ArrayList<>();
       
        
        Mollusk mollusk = new Mollusk(true, "locomotion", "gh", 0, "Plant", "mollusk", "yes", 0, "hgh", new Date(), 0);
        System.out.println("Create object mollusk");
        invertebrateAnimals.add(mollusk);
        mollusk.pushOn();
        System.out.println(mollusk.getClass());
        System.out.println("mollusk-->"+mollusk);
        
        System.out.println("");
        
        Slug slug = new Slug(1, true, "Arrastarse", "composicional", 2, "Planrtas", "jaula", "Asexual", 45, "Slug", new Date(), 46);
        System.out.println("Crerate object slug");
        slug.pushOn();
        slug.pushOn(3);
        System.out.println("slug-->"+slug);
        invertebrateAnimals.add(slug);
        System.out.println(slug.getClass());
        
        System.out.println("");
        
        System.out.println("\n ZOO Animals Invertebrate ");
        System.out.println(invertebrateAnimals);
        System.out.println("total animal "+invertebrateAnimals.size());
        
        
        
        animal = new TubeSponge("Boreal", 45, "Bilaterial", 0, "Filtro", "Water", "Asexual", 12, "Tube Sponge", new Date(2024,1,10), 0);
        System.out.println("Animal-->"+animal);
        System.out.println("Type-->"+animal.getClass());
        
    }
}
