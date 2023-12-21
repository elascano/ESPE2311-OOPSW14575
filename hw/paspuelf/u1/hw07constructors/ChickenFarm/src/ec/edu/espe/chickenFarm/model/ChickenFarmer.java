<<<<<<< HEAD
package ec.edu.espe.chickenFarm.model;

import java.util.ArrayList;


/**
 *
 * @author Olivier Paspuel
 */

public class ChickenFarmer {
    private String name;
    private ArrayList<ChickenCoop> coops = new ArrayList<>();
    
//    public ChickenFarmer(){
//        this.coops = new ChickenCoop[5];
//    }
    
    public void getCoops(){
        System.out.println(coops);
    }
    
    public void addChickenCoop(ChickenCoop coop){
        
        if(coops.size() < 6){
            coops.add(coop);
        }else{
            System.out.println("Not enough space :c");

        }
    }
}




=======
package ec.edu.espe.chickenFarm.model;

import java.util.ArrayList;


/**
 *
 * @author Olivier Paspuel
 */

public class ChickenFarmer {
    private String name;
    private ArrayList<ChickenCoop> coops = new ArrayList<>();
    
//    public ChickenFarmer(){
//        this.coops = new ChickenCoop[5];
//    }
    
    public void getCoops(){
        System.out.println(coops);
    }
    
    public void addChickenCoop(ChickenCoop coop){
        
        if(coops.size() < 6){
            coops.add(coop);
        }else{
            System.out.println("Not enough space :c");

        }
    }
}




>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
