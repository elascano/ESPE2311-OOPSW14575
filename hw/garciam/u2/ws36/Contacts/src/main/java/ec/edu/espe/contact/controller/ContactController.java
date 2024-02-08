package ec.edu.espe.contact.controller;

import ec.edu.espe.contact.model.Contact;
import utils.MongoDbManager;
/**
 *
 * @author mateo
 */
public class ContactController {
    public static boolean register(Contact contact){
        //TODO: convert contact to json
        MongoDbManager.create(contact, "test_collection");
        return true;
    }
}
