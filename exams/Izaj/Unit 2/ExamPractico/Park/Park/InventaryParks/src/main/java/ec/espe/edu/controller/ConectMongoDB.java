
package ec.espe.edu.controller;
import com.google.gson.Gson;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class ConectMongoDB {
    
    private static final String DataBase = "Park";

    private static MongoClient mongoClient;

    public static MongoClient conectToDb() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create("mongodb+srv://mateo:mateo@cluster0.yftrjpg.mongodb.net/");
        }
        return mongoClient;
    }
    public static void deleteProduct(int id ){
        conectToDb();
        MongoDatabase database = mongoClient.getDatabase(DataBase);
        MongoCollection<Document> collection = database.getCollection("Parks");
        Document filter = new Document("id", id);
        collection.deleteOne(filter);
    }

}
