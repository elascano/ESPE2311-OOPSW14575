package ec.edu.espe.ChickenFarm.model;

/**
 *
 * @author Frederick Tipán - Bit Coderz - DCCO ESPE
 */
public class ChickenFarmer {
    private String name;
    private ChickenCoop[] coops = new ChickenCoop[5];
    
    private int currentSapce = 1;

    public void add(ChickenCoop coop){
        if(currentSapce > (coops.length)){
            System.out.println("Max Chicken Coops Reached");
        }else{
           coops[currentSapce] = coop;
           currentSapce++;
        }
    }
    
    public void remove(int coopId){
    }
    public void resetIteration(){
    }
    
    public ChickenCoop next(){
    }
    
}
