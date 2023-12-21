
package ec.edu.espe.aggregation.view;

import ec.edu.espe.aggregation.model.Order;
import ec.edu.espe.aggregation.model.OrderDetails;

/**
 *
 * @author RC_558
 */
public class JavaApplication13 {

 
    public static void main(String[] args) {
              
        Order orders;
        OrderDetails [] orderDetails = new OrderDetails [2];        
        orderDetails [0] = new OrderDetails (15,23,"Hamburger",2,4.50,9.0);
        orderDetails [1] = new OrderDetails (16,24,"Cola",3,1.50,4.50);
                
        orders = new Order (16, "06/12/2023","06/12/2023","18925","Rony Cedeño", "Activo","5681", orderDetails );
        
        System.out.println("Order: " + orders);                
    }
    
}
