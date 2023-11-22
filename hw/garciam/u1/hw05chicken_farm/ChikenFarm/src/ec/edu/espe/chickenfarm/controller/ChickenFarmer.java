package ec.edu.espe.chickenfarm.controller;

/**
 *
 * @author mateo, HoneyBadgers , DCCO
 */
public class ChickenFarmer {

    private String name;
    //should initilize in the constructor
    private ChickenCoop[] coops = new ChickenCoop [5];
    
    private int usageIndex = 0;

    public void add(ChickenCoop coop) {
        if(usageIndex > (coops.length -1)){
            System.out.println("[-] Not enougth space to a new Chicken coop");
        } else {
            coops [usageIndex] = coop;
            System.out.println("[+] Chiken coop added");   
            usageIndex++;
        }
    }

    public void remove(int coopId) {
    }

    public void resetIteration() {
    }

    public ChickenCoop next() {
        //should return a chicken coop
        return null;
    }

}
