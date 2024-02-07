package utils;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.contact.model.Contact;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author mateo
 */
public class MongoDbManager {

    private static final String DATA_BASE = "ContactDB";

    private static MongoClient mongoClient;

    public static MongoClient conectToMongoDb() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create("mongodb+srv://luis:luis2@cluster0.h5n9yna.mongodb.net/?retryWrites=true&w=majority");
            System.out.println("Conected with MongoBD");
        }
        return mongoClient;
    }

    public static List<Contact> listContacts() {
        conectToMongoDb();
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("Contact");

        List<Document> fullTable = collection.find().into(new ArrayList<>());
        List<Contact> customersFromDataBase = new ArrayList<>();

        for (Document doc : fullTable) {
            customersFromDataBase.add(new Gson().fromJson(doc.toJson(), Contact.class));
        }
        return customersFromDataBase;

    }

    public static void create(Contact contact) {
        conectToMongoDb();
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("Contact");
        Gson gson = new Gson();
        collection.insertOne(Document.parse(gson.toJson(contact)));

    }
    
    
    public static String read (String collection){
        return "data from database";
    }
    
    public static boolean update(String newData, String search, String collection){
        return true;
    }
    
    public static boolean delete(String newData){
        return true;
    }
}
