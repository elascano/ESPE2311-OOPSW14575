package espe.edu.ec.zooabstraction.view;

import espe.edu.ec.zooabstraction.model.Animal;
import espe.edu.ec.zooabstraction.model.Arachnids;
import espe.edu.ec.zooabstraction.model.Crab;
import espe.edu.ec.zooabstraction.model.Invertebrate;
import espe.edu.ec.zooabstraction.model.Scorpion;
import espe.edu.ec.zooabstraction.model.Spider;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author RC_558
 */
public class ZooAbstaction {

    public static void main(String[] args) {
        System.out.println("--> ABSTRACTION IN FUNCTIONS BY RONY CEDEÑO");
        Animal animal = new Spider(true, 0, 0, "01", "spider", new Date(), 0, "external skeleton");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal Type --> " + animal.getClass().getSimpleName());

        System.out.println("\n");
        animal.move();
        animal.makeSound();
        System.out.println("\n");

        Scorpion scorpion = new Scorpion(10, true, 4, 8, "0", "scorpiones", new Date(2003, 9, 1), 0, "external skeleton");
        animals.add(scorpion);
        System.out.println("animal -->" + scorpion);
        System.out.println("animal type -->" + animal.getClass().getSimpleName());

        System.out.println("\n");
        scorpion.move();
        scorpion.makeSound();
        System.out.println("\n");

        Crab crab = new Crab(9, true, "0", "brachyura", new Date(), 0, "external skeleton");
        animals.add(crab);
        System.out.println("animal -->" + crab);

        Spider spider = new Spider(true, 8, 8, "1", "Aranae", new Date(), 2, "external skeleton");
        animals.add(spider);
        System.out.println("animal --> " + spider);

        spider.weaveSpiderWeb();
        spider.hunt();
        spider.hunt(5);

        System.out.println("\n ZOO ANIMALS");
        System.out.println(animals);
        System.out.println(animals.size());

    }

}
