
package ec.edu.espe.contact.view;

import ec.edu.espe.contact.model.Meeting;
import ec.edu.espe.contact.model.User;



/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class DailyDevSystem {
    public static void main(String[] args) {
       User[] users = new User[3];
      
       
       users[0]= new User(222, "Carlos Ñato", "carlos_izac8@hotmail.com");
       users[1]= new User(323, "Pedro Caiza", "pedroCaiza@gmail.com");
       users[2]= new User(223, "Luis Perez", "luis@gmail.com");
       
       Meeting meeting = new Meeting(34, "Agronomia_Gestion", users);
       
       
        System.out.println("Meeting-->" + meeting);
       
       
       
       
    
    }
    
    
    
}
