package ec.edu.espe.contacts.controller;

import ec.edu.espe.contact.utils.MongoDBManager;
import ec.edu.espe.contacts.model.Contact;

/**
 *
 * @author RC_558
 */
public class ContactController {
    public void register(Contact contac){
        //TODO convert contact to json 
        //TODO call utils method insert
      String data = "{json : data }"; 
        MongoDBManager.create(data, "contacts");
    }
}
