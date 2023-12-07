
package ec.espe.edu.simulatorfoodandroll.view;

import ec.espe.edu.simulatorfoodandroll.modell.Customer;
import ec.espe.edu.simulatorfoodandroll.modell.MenuDish;
import java.util.ArrayList;

/**
 *
 * @author MateoCriollo
 */
public class SimulatorFoodAndRoll {
    public static void main(String[] args) {
        
        //MenuDish menuDishes[]=new MenuDish[2];
        //Customer customer;
        
        //menuDishes[0]=new MenuDish("Alitas BBQ", 1245, "Alitas", 12.25f, "Disponible", 05.30f);
        //menuDishes[1]=new MenuDish("Salchipapas", 9854, "Papas", 1.25f, "Disponible", 03.30f);
      
       
        //customer = new Customer("Mateo", "gamil", 1988649844f, "casa", menuDishes);
        
        //System.out.println("Customer-->"+customer);
        
        ArrayList<MenuDish> dishes = new ArrayList<>();
         Customer customer;
         
         dishes.add(new MenuDish("Alitas BBQ", 1245, "Alitas", 12.25f, "Disponible", 05.30f));
         dishes.add(new MenuDish("Salchipapas", 9854, "Papas", 1.25f, "Disponible", 03.30f));
         
         customer = new Customer ("Mateo", "gamil", 1988649844f, "casa", dishes);
         
         System.out.println("Customer--->" + customer);
    }
    
}
