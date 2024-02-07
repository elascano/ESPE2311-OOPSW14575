package ec.edu.espe.q6170interface.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Frederick
 */
public class ManageMongoDB {
    protected String connectionString = "mongodb+srv://frederick:frederick@cluster0.gteqor0.mongodb.net/?retryWrites=true&w=majority";
    private String dataBaseName = "DummyDB";
    protected MongoDatabase db;
    protected MongoCollection<Document> coll;
    
    public void connectToDatabase(){
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        MongoClient mongoClient = MongoClients.create(settings);
        db = mongoClient.getDatabase(dataBaseName); 
    }
    
    public void getFromCollection(String collectionName){
        coll = db.getCollection(collectionName);
    }
}
