package utils;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author David
 */
public class MongoDBManager {
    private static final String MONGODB_URI = "mongodb+srv://davidcepeda13:david@cluster0.fvgdrtu.mongodb.net/";
    private static final String DATABASE_NAME = "FAR_DB";
    
    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static void create(Document document, String collectionName) {
        connectMongoDB();
        MongoCollection<Document> collection = database.getCollection(collectionName);
        collection.insertOne(document);
    }

    private static void connectMongoDB() {
        if (mongoClient == null) 
            mongoClient = MongoClients.create(MONGODB_URI);
            database = mongoClient.getDatabase(DATABASE_NAME);
    }
    
    public static String read(String collection){
        //TODO return all the collection documents
        return "data from base";
    }
    public static String find(String search, String collection){
        return "data from base";
    }
    public static boolean update(String newData, String search, String collection){
        return true;
    }
    public static boolean delete(String search, String collection){
        return true;
    }
    
}
