package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Condor;
import ec.edu.espe.zoo.model.Eagle;
import ec.edu.espe.zoo.model.Giraffe;
import ec.edu.espe.zoo.model.Monkey;
import ec.edu.espe.zoo.model.Platypus;
import ec.edu.espe.zoo.model.Vertebrate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Vivanco
 */
public class Zoo {
    public static void main(String [] args){
        System.out.println("------ ABSTRACT CLASS BY GABRIEL VIVANCO");
        Animal animal = new Vertebrate(0, "", new Date(), 0, "", 0);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("animal--"+animal);
        System.out.println("animal type"+animal.getClass());
        
        /*animal = new Platypus(true, 0, 0, 0, "platypus scientific", new Date(), 0, "spine small", 0);
        animals.add(animal);
        System.out.println("animal-----"+animal);
        System.out.println("animal-----"+animal.getClass());*/
        
        animal = new Giraffe(0, 0, "giraffe", new Date(), 0, "big Spin", 0);
        System.out.println("animal-----"+animal);
        System.out.println("animal----"+animal.getClass());
        animals.add(animal);
        //animal.brushNeck();
        
        /*Giraffe giraffe=new Giraffe(4, 2, "Giraffa", new Date(), 3, "long", 206);
        System.out.println("other giraffe----"+giraffe);
        animals.add(animal);
        
        giraffe.brushNeck();
       
        giraffe.breastfeed();
        giraffe.breastfeed(1);*/
        
        Monkey monkey = new Monkey("Brown", 2, 5, "Simiiformes", new Date(), 5, "Medium", 206);
        System.out.println("other monkey----"+monkey);
        animals.add(monkey);
        /*monkey.isClimbing();
        monkey.isClimbing(6.24f);
        
        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println("total animals -----"+animals.size());*/
        
        animal = new Condor(1.25f, 3.5f, 2, "insulators", 12, "Vultur gryphus", new Date(), 10, "medium", 175);
        System.out.println("animal------>"+animal);
        System.out.println("animal type------>"+animal.getClass());
        animals.add(animal);
        
        animal = new Eagle(1.8f, "Excelent", 2, "Waterproof", 13, "Haliaeetus leucocephalus", new Date(), 12, "medium", 200);
        System.out.println("animal------>"+animal);
        System.out.println("animal type------>"+animal.getClass());
        animals.add(animal);
        System.out.println("total animals -----"+animals.size());
    }
}
