package utils;

/**
 *
 * @author mateo
 */
/**
 *
 * @author mateo
 */
import com.google.gson.Gson;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.contact.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class MongoDbManager {

    private static final String DataBase = "test_collection";

    public static MongoClient mongoClient;

    public static MongoClient conectToDb() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create("mongodb+srv://mateo:mateo@cluster0.jp3jhno.mongodb.net/?retryWrites=true&w=majority");
        }
        return mongoClient;
    }

    public static boolean create(Object data, String table) {
        conectToDb();
        MongoDatabase database = mongoClient.getDatabase(DataBase);
        MongoCollection<Document> collection = database.getCollection(table);
        Gson gson = new Gson();
        collection.insertOne(Document.parse(gson.toJson(data)));
        System.out.println("Object --> " + data.toString() + " added to " + DataBase + "." + table);
        return true;
    }
    

    public static String read(String collection) {
        return "data from database";
    }

    public static boolean update(String newData, String search, String collection) {
        return true;
    }

    public static boolean update(String newData) {
        return true;
    }
}
