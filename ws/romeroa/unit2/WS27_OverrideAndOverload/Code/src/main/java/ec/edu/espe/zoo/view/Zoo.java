package ec.edu.espe.zoo.view;

import java.util.Date;

import ec.edu.espe.zoo.model.Mussel;
import ec.edu.espe.zoo.model.Oyster;

/**
 * @author Andrés Romero
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("\n----> Overriding and Overloading");

        System.out.println("--> Mussel object (with no polymorphism)");
        Mussel mussel = new Mussel(1, "Mytilus edulis", new Date(), 1, true, 0, true, false,
                "Nacre and Calcium Carbonate", true, true, 0.8);
        System.out.println("- Parent method 'producePearl()'");
        mussel.producePearl();
        System.out.println("- Own method 'attachToSubstrate()'");
        mussel.attachToSubstrate();

        System.out.println("\n--> Oyster object (with polymorphism)");
        Oyster oyster = new Oyster(1, "Ostreidae", new Date(), 3, true, 0, true, false, "Nacre and Calcium Carbonate",
                true, true, "Sand");
        System.out.println("- Parent method 'producePearl()' (Overrided)");
        oyster.producePearl();
        System.out.println("- Overloaded method 'producePearl()'");
        oyster.producePearl("blue");
        System.out.println("- Own method 'adhereToSurface()'");
        oyster.adhereToSurface();
    }
}
