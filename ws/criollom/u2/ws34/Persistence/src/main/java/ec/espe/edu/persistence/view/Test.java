
package ec.espe.edu.persistence.view;

import ec.espe.edu.persistence.controller.MongoManager;
import ec.espe.edu.persistence.model.Person;


/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Test {
    public static void main(String[] args) {
    String URI = "mongodb+srv://gabriel2004mat:1234@cluster0.dsm2nfg.mongodb.net/";
    String DATABASE_NAME = "Far_DB";
    String COLLECTION_NAME = "Customers";
    MongoManager mongo = new MongoManager(URI, DATABASE_NAME, COLLECTION_NAME);
    
    mongo.create(new Person(96, "Pepe", "Quito"));
    
        
        
        
    }
}
