
package com.mycompany.chickenfarm;

import ec.edu.espe.chickenfarmsimulator.model.*;
import java.util.Date;

/**
 *
 * @author mateo
 */
public class ChickenFarm {

    public static void main(String[] args) {
        int id = 1;
        String name = "lucy";
        String color = "white & brown";
        boolean isMolting = false;
        Date bornOnDate = new Date();

        Chicken chicken = new Chicken(id, name, color, isMolting, bornOnDate);
        System.out.println("chicken --> " + chicken);
        chicken.doStuff(id);
    }
}
