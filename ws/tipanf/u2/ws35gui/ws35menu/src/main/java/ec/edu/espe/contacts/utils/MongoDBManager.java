package ec.edu.espe.contacts.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;


public class MongoDBManager {
    public static void create (String data, String collection){
        //TODO create collection
    }
    
    public String read (String collection){
        //TODO return all the collection doccuments
        return "data from database";
    }
    
    public String find (String newData, String search, String collection){
        //TODO return one document according to the search criteria
        return "data from database";
    }
    
    public String update (String newData, String search, String collection){
        //TODO find the document to update
        //TODO update information of thw document
        return "data from database";
    }
    
    public String delete (String search, String collection){
        //TODO find the document to update
        //TODO update information of thw document
        return "data from database";
    }
    
    private static MongoDatabase connectToDataBase() {
        String connectionString = "mongodb+srv://frederick:frederick@cluster0.gteqor0.mongodb.net/?retryWrites=true&w=majority";
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        
        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .codecRegistry(codecRegistry)
                .build();
        
        MongoClient mongoClient = MongoClients.create(clientSettings);
        MongoDatabase db = mongoClient.getDatabase("DummyDB");
        
        return db;
    }
    
    public static <T> MongoCollection<T> getFromCollection(String collectionName, Class classType){
        MongoDatabase db = connectToDataBase();
        MongoCollection<T> collectionDB = db.getCollection(collectionName, classType);       
        
        return collectionDB;
    }
    
}