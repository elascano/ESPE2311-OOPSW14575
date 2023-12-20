package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Poop poop = new Poop();
        Egg egg = new Egg(1);
        //Static data
        Chicken chicken = new Chicken(1, "lucy", "white&Black", 2, true);
        //User's data
        Chicken chicken2 = generateChickenByUserData();
        //User's data in array
        Chicken[] chickens = new Chicken[5];

        for (int i = 0; i < chickens.length; i++) {

            System.out.println((i + 1) + ") Chicken");
            chickens[i] = generateChickenByUserData();
        }

        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is --> Mateo Garcia (Cotbert)");
        System.out.println("poop -->" + poop);
        System.out.println("egg -->" + egg);
        System.out.println("chicken -->" + chicken);
        System.out.println("chicken2 -->" + chicken2);
        System.out.println("chickens --> ");
        for (int i = 0; i < chickens.length; i++) {
            System.out.println("\t" + "[" + (i + 1) + "] " + chickens[i]);
        }

        chicken.setId(9);
        System.out.println("new chicken id --> " + chicken.getId());
        System.out.println("chicken --> " + chicken);
    }

    public static Chicken generateChickenByUserData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Id: ");
        int id = in.nextInt();
        in.nextLine();
        System.out.print("name: ");
        String name = in.nextLine();
        System.out.print("Color: ");
        String color = in.nextLine();
        System.out.print("Age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Chicken is molting?: ");
        boolean isMolting = in.nextBoolean();
        return new Chicken(id, name, color, age, isMolting);
    }

}
