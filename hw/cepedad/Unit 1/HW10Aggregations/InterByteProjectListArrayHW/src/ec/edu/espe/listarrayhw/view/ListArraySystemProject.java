package ec.edu.espe.listarrayhw.view;

import ec.edu.espe.listarrayhw.model.Order;
import ec.edu.espe.listarrayhw.model.User;
import java.util.ArrayList;

/**
 *
 * @author David, InterByte, DCCO ESPE
 */
public class ListArraySystemProject {
    
    public static void main(String[] args) {
        
        ArrayList<Order> orders = new ArrayList<>();
        User user;
        
        orders.add(new Order(1, "Big Hamburguer", 2, 2, 4));
        orders.add(new Order(2, "Hot Wings", 1, 4, 4));
        
        user = new User(1, "*********", 968855639, "davidcepeda@gmail.com", "Av General Rumiñahui", orders);
        
        System.out.println("User ---> " + user);
        
    }
    
}
