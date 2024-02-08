package ec.edu.espe.q61_70_garcia_mateo.controller;

import ec.edu.espe.q61_70_garcia_mateo.model.*;

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
import java.util.ArrayList;
import java.util.List;

public class DbHandler {

    private static final String DataBase = "test_collection";

    private static MongoClient mongoClient;

    public static MongoClient conectToDb() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create("mongodb+srv://mateo:mateo@cluster0.jp3jhno.mongodb.net/?retryWrites=true&w=majority");
        }
        return mongoClient;
    }

    public static List<SoccerPlayer> getAllCollection(String collectionToGet) {
        conectToDb();
        MongoDatabase database = mongoClient.getDatabase(DataBase);
        MongoCollection<Document> collection = database.getCollection(collectionToGet);

        List<Document> fullTable = collection.find().into(new ArrayList<>());
        List<SoccerPlayer> customersFromDataBase = new ArrayList<>();

        for (Document doc : fullTable) {
            customersFromDataBase.add(new Gson().fromJson(doc.toJson(), SoccerPlayer.class));
        }
        return customersFromDataBase;

    }

    public static void insertItem(SoccerPlayer item, String collectionToGet) {
        conectToDb();
        MongoDatabase database = mongoClient.getDatabase(DataBase);
        MongoCollection<Document> collection = database.getCollection(collectionToGet);
        Gson gson = new Gson();
        collection.insertOne(Document.parse(gson.toJson(item)));
    }

}
