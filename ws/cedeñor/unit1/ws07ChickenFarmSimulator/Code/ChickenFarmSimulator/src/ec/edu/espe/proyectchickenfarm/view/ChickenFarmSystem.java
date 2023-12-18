package ec.edu.espe.proyectchickenfarm.view;

import ec.edu.espe.proyectchickenfarm.model.Chicken;
import ec.edu.espe.proyectchickenfarm.model.Egg;
import ec.edu.espe.proyectchickenfarm.model.Poop;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {

        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken();

        //Workshop in class
        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is --> Rony Cedeño");
        System.out.println("Poop -->" + poop);
        System.out.println("Egg -->" + egg);
        System.out.println("Chicken 1 -->" + chicken);

    }
}
