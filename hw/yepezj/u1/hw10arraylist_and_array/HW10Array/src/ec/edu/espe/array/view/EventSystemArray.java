package ec.edu.espe.array.view;

import ec.edu.espe.array.model.Event;
import ec.edu.espe.array.model.Staff;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class EventSystemArray {
    public static void main(String[] args) {
        Event event;
        Staff[] staff = new Staff[2];
        
        staff[0] = new Staff(1, "security", "06/12/2023 -- 19:00", "1.- Felipe Quilumbango 2.- Joe Congo 3.- Zaith Manangon", 100);
        staff[1] = new Staff(2, "services", "07/12/2023 -- 8:00", "1.- Bryan Yepez 2.- Wilian Yepez 3.- Frank Landeta", 60);
        
        event = new Event(1, "06/12/2023 -- 19:00", "07/12/2023 -- 1:00", "Luis Miguel", 25000, staff);
        
        System.out.println(event);
    }
}
