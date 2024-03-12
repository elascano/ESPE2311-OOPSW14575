
package ec.edu.espe.exam3.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam3.utils.ManageMongoDB;
import org.bson.Document;

/**
 *
 * @author Fréderick Tipán
 */
public abstract class DatabaseController {

    protected MongoCollection<Document> coll;
    
    
    public void getFromCollection(String collectionName){
        ManageMongoDB dbHandler = ManageMongoDB.getInstance();
        MongoDatabase db = dbHandler.getDB();
        
        coll = db.getCollection(collectionName);
    }
}
