package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Contact;
import utils.MongoDBManager;

/**
 *
 * @author komod
 */
public class ContactController {
    public boolean register(Contact contact) {
        //TODO: convert contact to json
        //TODO: call utils method to insert
        String data = "{}";
        MongoDBManager.create(data, "Contacts");
        return true;
    }
}
