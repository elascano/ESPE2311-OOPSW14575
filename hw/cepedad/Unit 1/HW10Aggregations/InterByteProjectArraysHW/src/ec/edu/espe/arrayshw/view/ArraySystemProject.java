package ec.edu.espe.arrayshw.view;

import ec.edu.espe.arrayshw.model.Order;
import ec.edu.espe.arrayshw.model.User;

/**
 *
 * @author David, InterByte, DCCO ESPE
 */
public class ArraySystemProject {
    
    public static void main(String[] args) {
    Order[] orders = new Order[2];
    User user;
    
    orders[0] = new Order(1, "Big Hamburguer", 2, 2, 4);
    orders[1] = new Order(2, "Hot Wings", 1, 4, 4);
    
    user = new User(1, "********",968855639, "davidcepeda@gmail.com", "Av Gral Rumiñahui", orders);
    
    System.out.println("User ---> " + user);
    }
}