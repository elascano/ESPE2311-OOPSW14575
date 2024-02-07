package ec.edu.espe.q61.controller;

import com.google.gson.Gson;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.q61.model.VinylRecords;

import java.util.Scanner;
import org.bson.conversions.Bson;
import util.MongoConection;

/**
 *
 * @author Luis Sagnay
 */
public class VinylRecordsController {
    private static final Scanner scanner = new Scanner(System.in);
    private static MongoClient mongoClient;  

    private static final String DATA_BASE = "Q61-70DB";
    
    public static void insert(VinylRecords vinylRecords) {
        MongoConection.conectToMongoDb();
        mongoClient = MongoConection.conectToMongoDb();  
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("VinylRecords");
        Gson gson = new Gson();
        collection.insertOne(Document.parse(gson.toJson(vinylRecords)));
    }

    public static void update(VinylRecords vinylRecords) {
        MongoConection.conectToMongoDb();
        mongoClient = MongoConection.conectToMongoDb(); 
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("Country");
        Document filter = new Document("id", vinylRecords.getId());
        Document updateItem = new Document("$set", new Document()
        .append("name", vinylRecords.getName())
        .append("memory", vinylRecords.getMemory())
        .append("price", vinylRecords.getPrice()));
        
        collection.updateOne(filter, updateItem);
    }
    
    public static void find(int id) {
        MongoConection.conectToMongoDb();
        mongoClient = MongoConection.conectToMongoDb();  
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            System.out.println("Connected to the database.");
            MongoCollection<Document> collection = database.getCollection("inventory");
            System.out.print("\n Input the ID to find the ingredient: ");
            id = scanner.nextInt();

            Bson filter = Filters.eq("id", id);
            try {
                Document doc = collection.find(Filters.and(filter)).first();
                System.out.println("Ingredient: " + doc.toJson());

            } catch (Exception e) {
                System.out.println("Error, no data in the database");
            }
        }
    }
    
    public static void delete(int id){
        MongoConection.conectToMongoDb();
        mongoClient = MongoConection.conectToMongoDb(); 
        MongoDatabase database = mongoClient.getDatabase(DATA_BASE);
        MongoCollection<Document> collection = database.getCollection("VinylRecords");
        Document filter = new Document("id", id);
        collection.deleteOne(filter);
    }    
    
    public int calculatePrice(int memory){
        int price;
        price = memory/2;
        return price;
    }
}

