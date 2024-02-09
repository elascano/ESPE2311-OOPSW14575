
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Contact;
import ec.edu.espe.contacts.utils.MongoDBManager;

/**
 *
 * @author Olivier Paspuel
 */
public class ContactController {
    public void register(Contact contact){
        // TODO convert contact to json
        //TODO call utils method to insert
        String data = "{json:data}";
        MongoDBManager.create(data, "contacts");
    }
}
