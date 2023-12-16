package ec.edu.espe.arraylist.view;

import ec.edu.espe.arraylist.model.Employee;
import ec.edu.espe.arraylist.model.Event;
import java.util.ArrayList;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class EventSystemArrayList {
    public static void main(String[] args) {
        Event event;
        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(1, "Juan Pasquel", 30));
        employees.add(new Employee(2, "Mishell Ruiz", 20));
        
        event = new Event(1, "06/12/2023 -- 19:00", "07/12/2023 -- 1:00", "Ozuna", 12500, employees);
        
        System.out.println(event);
    }
    
    
    
    
    
}
