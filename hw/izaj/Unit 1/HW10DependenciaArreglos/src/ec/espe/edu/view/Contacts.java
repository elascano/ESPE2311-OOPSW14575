
package ec.espe.edu.view;

import ec.espe.edu.model.Client;
import ec.espe.edu.model.Person;
import ec.espe.edu.model.SalesNotes;

/**
 *
 * @author mateo
 */
public class Contacts {

 
    
    
    public static void main(String[] args) {
        
        Client client[] = new Client[2];
        SalesNotes salesNotes;
        
        client[0] = new Client(1, "Juan ", "juaniza2008@gmail.com", "0985228533");
        client[1] = new Client(2, "mateo ", "mateoiza64@gmail.com", "0998362247");
        salesNotes = new SalesNotes (10, "Magnum", client);
        
        System.out.println("SalesNotes -->" + salesNotes);
                
  
    }


}
