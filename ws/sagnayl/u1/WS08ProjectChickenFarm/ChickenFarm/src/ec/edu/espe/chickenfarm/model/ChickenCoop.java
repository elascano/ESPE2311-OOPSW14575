package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Luis Sagnay
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens = new Chicken[20];
    private int chickenCount = 0;

    public void add(Chicken chicken) {
        if (chickenCount < 20) {
            chickens[chickenCount] = chicken;
            chickenCount++;
            System.out.println("Chicken added correctly to the coop");
        } 
        else {
            System.out.println("The chicken coop is full");
        }
    }
    public void remove(int chickenId){
    }
    public void resetIteration(){       
    }
    public Chicken next(){
        return null;
    }
}