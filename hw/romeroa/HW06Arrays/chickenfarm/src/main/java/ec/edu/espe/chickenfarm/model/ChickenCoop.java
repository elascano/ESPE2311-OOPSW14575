package ec.edu.espe.chickenfarm.model;

/**
 * @author Andrés Romero, NullPointerException, DCCO-ESPE
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens = new Chicken[20];
    private int chickensIndex = 0;

    public void add(Chicken chicken) {
        if (chickensIndex >= chickens.length) {
            System.out.println("Error: Coops can only have up to " + chickens.length + "chickens.");
            return;
        }
        chickens[chickensIndex] = chicken;
        chickensIndex++;
        System.out.println("Chicken addeed successfully");
    };

    public void remove(int chickenId) {
    };

    public void resetIteration() {
    };

    public Chicken next() {
        return new Chicken();
    };
}
