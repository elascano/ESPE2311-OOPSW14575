
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Contact;
import utils.MongoDBManager;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ContactController {
    
    
    
    
    public void register(Contact contact){
        //Todo convert contact to json
        //Todo call utils metoh insert
        String data="{json : data}";
        MongoDBManager.create(data, "contacts");
    }
    
    
    
}
