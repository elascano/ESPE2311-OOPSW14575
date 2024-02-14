package ec.edu.espe.contacts.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.contacts.model.Contact;
import ec.edu.espe.contacts.utils.MongoDBManager;


public class ContactController {
    //TODO convert contact to json
    //TODO call utils method to insert
    public static void register(Contact generatedContact){
        Class classType = Contact.class;
        String collectionName = "Contacts";
        
        MongoCollection<Contact> contactInDB = MongoDBManager.getFromCollection(collectionName, classType);
        
        contactInDB.insertOne(generatedContact);
    }
    
}