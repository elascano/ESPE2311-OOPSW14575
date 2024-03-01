
package ec.edu.espe.chickenfarm.controller;

/**
 *
 * @author Sebastian,InterByte,DCCO
 */
public class ChickenFarmer {
    private String name;
    private ChickenCoop[] coops = new ChickenCoop [5];
    
    private int  usageIndex = 0;
    
    public void add (ChickenCoop coop){
        if(usageIndex > (coops.length -1 )){
            System.out.println(x:"[-] Not enougth space to a new chicken");
        } else {
                coops [usageIndex]= coop;
                System.out.println(x:"[+] Chiken coop added");
                usageIndex++;
             
        }       
                
    }
}

public void remove(int coopId)¨¨ppoi){

}
public void resetIteration(){

    }
public ChickenCoop next (){
    return null;
    }
}