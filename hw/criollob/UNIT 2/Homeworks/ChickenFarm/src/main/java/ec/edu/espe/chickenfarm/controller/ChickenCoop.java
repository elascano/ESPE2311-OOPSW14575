
package ec.edu.espe.chickenfarm.controller;

/**
 *
 * @author SebastianC
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens = new Chicken[20];

    private int usageIndex = 0;
 
    
    public void add(Chicken chicken) {
      if(usageIndex >(chickens.length -1)){
          System.out.println("[-] Not enougth space in the coop")
               
      }else { 
          chickens [count]=chicken;
          count ++;
          System.out.println( "Chicken added to the coop")
                  
      }
    }
    
    public void remove(int chickenId){
         }
    public void resetIteration(){
         }
    public  Chicken next(){
        return null;
    }
}