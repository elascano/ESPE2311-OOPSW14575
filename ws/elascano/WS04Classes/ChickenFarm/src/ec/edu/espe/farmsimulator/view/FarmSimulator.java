package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.ChickenCoop;

/**
 *
 * @author elascano
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        ChickenCoop coop = new ChickenCoop();
        
        coop.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("Coop    --> " + coop);
    }
    
}
