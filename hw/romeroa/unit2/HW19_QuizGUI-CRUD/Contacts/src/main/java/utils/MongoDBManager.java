package utils;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author komod
 */
public class MongoDBManager {
    private static final String CONNECTION_URI = "mongodb+srv://aromero:sH9TIDeaZ0z7W5JP@cluster0.o1jadvf.mongodb.net/";
    private static final String DATABASE = "ContactsDB";
    private static MongoClient mongoClient = null;
    private static MongoDatabase db;

    private static final CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
    private static final CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));

    public static void connect() {
        System.out.println("Connecting to database...");
        MongoClient client = MongoClients.create(CONNECTION_URI);
        mongoClient = client;
        db = mongoClient.getDatabase(DATABASE).withCodecRegistry(pojoCodecRegistry);
        System.out.println("Connected to database successuflly....");
    }

    @SuppressWarnings("unchecked")
    public static <T> void create(T object, String collection) {
        System.out.println("Attempting to insert a '" + object.getClass().getSimpleName() + "' object into the '" + collection + "' collection...");
        MongoCollection<T> mongoCollection = db.getCollection(collection, (Class<T>)object.getClass()).withCodecRegistry(pojoCodecRegistry);
        mongoCollection.insertOne(object);
    }
    
    public static String read(String collection) {
        //TODO: return all the collection documents
        return "Data from database: ";
    }
    
    public static String find(String search, String collection) {
        //TODO: return one document according to the search criteria
        return "Data from database: ";
    }
    
    public static boolean update(String newData, String search, String collection) {
        //TODO: find the document and update it
        return true;
    }
    
    public static boolean delete(String search, String collection) {
        //TODO: find the document and delete it
        return true;
    }
}
