package ec.edu.espe.view;

import ec.edu.espe.model.Equipment;
import ec.edu.espe.model.Event;
import java.util.ArrayList;

/**
 *
 * @author Frederick
 */
public class AggregationWithArrayList {
    public static void main(String[] args) {
        ArrayList<Equipment> equipment = new ArrayList<>();
        Event event;
        
        equipment.add(new Equipment(1,"Camera",15.25f,8));
        equipment.add(new Equipment(2,"Cellphone",200.00f,8));
        equipment.add(new Equipment(3,"Lights",30.50f,15));
        
        event = new Event(1,"Casa de la Cultura","Lemon Demon",equipment);
        
        System.out.println(event);
    }
    
}
