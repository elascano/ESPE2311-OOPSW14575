package ec.edu.espe.chickenfarm.controller;

/**
 *
 * @author mateo, HoneyBadgers , DCCO
 */
public class ChickenCoop {
    
    private int id;
    private Chicken[] chickens = new Chicken[20];
    
    private int usageIndex = 0;


    public void add(Chicken chicken) {
        if(usageIndex > (chickens.length -1)){
            System.out.println("[-] Not enougth spaces in the coop");   
        }else {
            chickens[usageIndex] = chicken;
            usageIndex ++;
            System.out.println("[+] Chiken added to the coop");   

        }
    }

    public void remove(int chickenId) {
    }

    public void resetIteration() {
    }

    public Chicken next() {
        // should return a chicken
        return null;
    }
}