
package ec.edu.espe.contacts.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.contacts.model.Contact;
import utils.MongoDBManager;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ContactController {
    
    
    
    
    public static void register(Contact contact){
        //Todo convert contact to json
        //Todo call utils metoh insert
        Gson gson = new GsonBuilder().create();
        String json=gson.toJson(contact);
        
        MongoDBManager.create(json, "Contacts");
    }
    
    
    
}
