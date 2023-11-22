
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author MateoCriollo,InterByte,DCCO-ESPE
 */

public class ChickenFarmer {
	private String name;
	private ChickenCoop[] coops = new ChickenCoop[5];

        private int assitant=0;
        
	public void add(ChickenCoop coop){
            if (assitant>(coops.length-1)){
                System.out.println("Noth enought space to a new chicken coop");
            }else{
                coops[assitant]=coop;
                System.out.println("Chicken coop added");
                   assitant++;
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

