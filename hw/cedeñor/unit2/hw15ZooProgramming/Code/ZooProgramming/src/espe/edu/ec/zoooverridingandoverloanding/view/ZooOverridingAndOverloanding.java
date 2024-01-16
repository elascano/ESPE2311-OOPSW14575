package espe.edu.ec.zoooverridingandoverloanding.view;

import espe.edu.ec.zoooverridingandoverloanding.model.Animal;
import espe.edu.ec.zoooverridingandoverloanding.model.Crab;
import espe.edu.ec.zoooverridingandoverloanding.model.Scorpion;
import espe.edu.ec.zoooverridingandoverloanding.model.Spider;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author RC_558
 */
public class ZooOverridingAndOverloanding {

    public static void main(String[] args) {
        System.out.println("--> POLYMORPHISM BY RONY CEDEÑO");
        Animal animal = new Animal("0", "   Shrimp", new Date(2023, 11, 1), 1);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        System.out.println("animal -->" + animal);
        System.out.println("animal Type --> " + animal.getClass());
        //animal.weaveSpiderWeb();

        Scorpion scorpion = new Scorpion(10, true, 4, 8, "0", "scorpiones", new Date(2003, 9, 1), 0, "external skeleton");
        animals.add(scorpion);
        System.out.println("animal -->" + scorpion);

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
