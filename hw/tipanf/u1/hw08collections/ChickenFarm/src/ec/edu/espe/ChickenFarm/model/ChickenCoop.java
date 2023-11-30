package ec.edu.espe.ChickenFarm.model;

/**
 *
 * @author Frederick Tipán - Bit Coderz - DCCO ESPE
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens = new Chicken[20];
    
    private int currentSapce = 1;

    public void add(Chicken chicken){
        if(currentSapce > (chickens.length)){
            System.out.println("Max Chickes Reached");
        }else{
           chickens[currentSapce] = chicken;
           currentSapce++;
        }
            
    }
    public void remove(int chickenId){
    }
    
    public void resetIteration(){
    }
    
    public Chicken next(){
    
    }
}
