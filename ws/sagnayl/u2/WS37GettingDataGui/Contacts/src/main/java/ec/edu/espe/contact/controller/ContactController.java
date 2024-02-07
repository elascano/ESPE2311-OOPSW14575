package ec.edu.espe.contact.controller;

import com.google.gson.Gson;
import ec.edu.espe.contact.model.Contact;
import utils.MongoDbManager;
/**
 *
 * @author mateo
 */
public class ContactController {
    
    public boolean register(Contact contact){
        // Convert contact to JSON using Gson
        Gson gson = new Gson();
        String data = gson.toJson(contact);
        
        // Save data to MongoDB
        MongoDbManager.create(contact);
        
        return true;
    }
}