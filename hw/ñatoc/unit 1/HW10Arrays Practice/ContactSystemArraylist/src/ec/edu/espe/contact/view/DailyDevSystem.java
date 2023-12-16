
package ec.edu.espe.contact.view;

import ec.edu.espe.contact.model.Meeting;
import ec.edu.espe.contact.model.User;
import java.util.ArrayList;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class DailyDevSystem {
    public static void main(String[] args) {
        
       ArrayList<User> users = new ArrayList<>();
       
       users.add(new User(12, "Carlos", "carlos_izac8@hotmail.com"));
       users.add(new User(323, "Pedro Caiza", "pedroCaiza@gmail.com"));
       users.add(new User(223, "Luis Perez", "luis@gmail.com"));
       
       Meeting meeting = new Meeting(34, "Agronomia_Gestion", users);
       
       
        System.out.println("Meeting-->" + meeting);
       
       
       
       
    
    }
    
    
    
}
