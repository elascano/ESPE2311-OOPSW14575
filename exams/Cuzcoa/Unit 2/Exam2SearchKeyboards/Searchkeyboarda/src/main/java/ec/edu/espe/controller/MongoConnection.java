
package ec.edu.espe.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class MongoConnection {
    
    public static MongoCollection<Document> connect(){
        String uri = "mongodb+srv://alex:cuzco@cluster0.mjoertv.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("keyboards");
        MongoCollection<Document> collection = database.getCollection("InfoKeyboards");
        return collection;
    }
    
}
