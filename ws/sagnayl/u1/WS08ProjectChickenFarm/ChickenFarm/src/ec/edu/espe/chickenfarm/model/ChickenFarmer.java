package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Luis Sagnay
 */
public class ChickenFarmer {
    private String name;
    private ChickenCoop[] coops = new ChickenCoop[5];
    private int coopCount=0;

    public void add(ChickenCoop coop) {
        if (coopCount < 5) {
            coops[coopCount] = coop;
            coopCount++;
            System.out.println("chicken coops successfully added");
        } else {
            System.out.println("The chicken farmer already has 5 chicken coops");
        }
    }
    public void remove(int coopId){
    }
    public void resetIteration(){
    }
    public ChickenCoop next(){
        return null;
    }
}
