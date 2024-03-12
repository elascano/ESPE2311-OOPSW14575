package ec.edu.espe.sort.controller;

/**
 *
 * @author Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
import com.google.gson.Gson;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import ec.edu.espe.sort.model.DbSchema;

public class MongoDBManager {
     
    private static final String DataBase = "strategyYepez";

    public static MongoClient mongoClient;

    public static MongoClient conectToDb() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create("mongodb+srv://Jefferson:Hola_135@cluster0.6gfeclg.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        }
        return mongoClient;
    }

    public static void insert(DbSchema template) {
        conectToDb();
        MongoDatabase database = mongoClient.getDatabase(DataBase);
        MongoCollection<Document> collection = database.getCollection("arrayJefferson");
        Gson gson = new Gson();
        collection.insertOne(Document.parse(gson.toJson(template)));

    }


}
