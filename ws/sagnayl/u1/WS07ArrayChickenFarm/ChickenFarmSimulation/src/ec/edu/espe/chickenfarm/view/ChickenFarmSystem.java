package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Luis Sagnay
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        int id = 1;
        String name = "Lucy";
        String color= "White and brown";
        boolean isMolting = false;
        Date bornOnDate = new Date();
        
        Chicken chicken = new Chicken(id, name, color, isMolting, bornOnDate);
        System.out.println("chicken --> " +chicken);
        
    }
}
