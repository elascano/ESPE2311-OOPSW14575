
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author MateoCriollo,InterByte,DCCO-ESPE
 */

public class ChickenCoop {
    	private int id;
	private Chicken[] chickens= new Chicken[20];
        
        private int assitant=0;
   
	public void add(Chicken chicken){
            if(assitant<(chickens.length-1)){
                chickens[assitant]=chicken;
                assitant++;
                System.out.println("Chicken added to the coop");
            }else{
                System.out.println("Noth enought spacein the coop");
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
