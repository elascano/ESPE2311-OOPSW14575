package ec.edu.espe.chickenfarm.model;

/**
 * @author Andrés Romero, NullPointerException, DCCO-ESPE
 */
public class ChickenFarmer {
    private String name;
    private ChickenCoop[] coops;
    private int coopsIndex = 0;

    public void add(ChickenCoop coop) {
        if (coopsIndex >= coops.length) {
            System.out.println("Error: Farmers can only have up to " + coops.length + "coops.");
            return;
        }
        coops[coopsIndex] = coop;
        coopsIndex++;
        System.out.println("Coop addeed successfully");
    };

    public void remove(int coopId) {
    };

    public ChickenCoop next() {
        return new ChickenCoop();
    };
}
