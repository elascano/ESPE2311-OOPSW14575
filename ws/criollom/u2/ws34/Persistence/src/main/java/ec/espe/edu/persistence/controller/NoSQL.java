
package ec.espe.edu.persistence.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class NoSQL extends DBManager {
    
    public MongoCollection<Document> getNoSQLCollection(String URI, String DataBaseName , String collection){
                try {
            MongoClient mongoClient = MongoClients.create(URI);
            MongoDatabase database = mongoClient.getDatabase(DataBaseName);
            
            return database.getCollection(collection);
        } catch (MongoException e) {
            System.err.println(e.getCause());
            return null; 
        }
    }

    
    
}
