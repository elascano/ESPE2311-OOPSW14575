package ec.edu.espe.farmsimulator.model;

/**
 *
 * @author elascano
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens = new Chicken[20];

    public void add(Chicken chicken){
        chickens[0] = chicken;
    }
    
}
