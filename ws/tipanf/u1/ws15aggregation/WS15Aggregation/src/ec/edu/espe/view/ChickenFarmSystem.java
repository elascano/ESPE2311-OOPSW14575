package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import java.util.Date;

/**
 *
 * @author Frederick Tipan
 */
public class ChickenFarmSystem {
    
    public static void main(String[] args) {
        int id=1;
        String name = "Lucy";
        String color = "White and Brwon";
        boolean isMolting=false;
        Date bornOnDate = new Date();
        
        Chicken chicken = new Chicken(id, name, color, isMolting, bornOnDate);
        System.out.println("chicken --> " + chicken);
        
        chicken.doStuff(5);
        
        
    }
    
}
