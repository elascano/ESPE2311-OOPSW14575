package ec.edu.espe.vehicle.utils;

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
 * @author RC_558
 */
public class MongoDB {
        protected String connectionString = "mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/";
    private String dataBaseName = "Store" ;
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
