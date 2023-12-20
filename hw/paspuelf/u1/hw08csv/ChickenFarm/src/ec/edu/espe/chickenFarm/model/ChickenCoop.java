package ec.edu.espe.chickenFarm.model;

import java.util.ArrayList;

/**
 *
 * @author Olivier Paspuel
 */
public class ChickenCoop {
    int id;
    private ArrayList<Chicken> chickens = new ArrayList<>();
    
    public void addChicken(Chicken chicken){
        
        if(chickens.size() < 21){
            chickens.add(chicken);
        }else{
            System.out.println("Not enough space :c");

        }
    }
    
}
