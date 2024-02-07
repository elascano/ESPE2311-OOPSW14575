package ec.edu.espe.country.util;

import com.google.gson.Gson;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.country.model.Country;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Sagnay
 */
public class ConectionMongoDB {
    private static final String DATA_BASE = "DpexDB";

    private static MongoClient mongoClient;

    public static MongoClient conectToMongoDb() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create("mongodb+srv://luis:luis2@cluster0.h5n9yna.mongodb.net/?retryWrites=true&w=majority");
            System.out.println("Conected with MongoBD");
        }
        return mongoClient;
    }

    public static List<Country> listCountries() {
        conectToMongoDb();
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("Country");

        List<Document> fullTable = collection.find().into(new ArrayList<>());
        List<Country> customersFromDataBase = new ArrayList<>();

        for (Document doc : fullTable) {
            customersFromDataBase.add(new Gson().fromJson(doc.toJson(), Country.class));
        }
        return customersFromDataBase;

    }

    public static void registerCountry(Country country) {
        conectToMongoDb();
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("Country");
        Gson gson = new Gson();
        collection.insertOne(Document.parse(gson.toJson(country)));

    }

    public static void editCountry(Country country) {
        conectToMongoDb();
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("Country");
        Document filter = new Document("name", country.getName());
        Document updateItem = new Document("$set", new Document()
        .append("ecuadorianPopulation", country.getEcuadorianPopulation())
        .append("consularOffice", country.getConsularOffice()));
        
        collection.updateOne(filter, updateItem);
    }
    
    public static void deleteCountry(String name ){
        conectToMongoDb();
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("Country");
        Document filter = new Document("name", name);
        collection.deleteOne(filter);
    }
}
