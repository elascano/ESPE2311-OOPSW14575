
package espe.edu.ec.view;
import espe.edu.ec.model.Customer;
import espe.edu.ec.model.Bill;

import java.util.ArrayList;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class SystemGaby {
    public static void main(String[] args) {
         //Bill[] bills= new Bill[2];
         ArrayList <Bill> bills = new ArrayList<>();
         Customer customer;
         
         bills.add(new Bill (1, "Alex", "frutas"));
         bills.add(new Bill (1, "Dario", "Lata de atun"));
         
         
         customer = new Customer(1, "David", "alexdcy27", bills);
         
         System.out.println("Customer"
                 + "-->" +customer);
    }
}
