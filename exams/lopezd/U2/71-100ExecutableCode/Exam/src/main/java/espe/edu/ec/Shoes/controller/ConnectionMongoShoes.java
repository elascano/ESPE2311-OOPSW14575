package espe.edu.ec.Shoes.controller;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
/**
 *
 * @author David Lopez,DCCO-ESPE
 */
public class ConnectionMongoShoes {
    private static final Scanner sc = new Scanner(System.in);
    public static void insertShoes() {
        int id;
        float price;
        String model;
        float iva;
        String uri = "mongodb+srv://david:david@cluster0.egyi4vp.mongodb.net/";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionPizza = database.getCollection("MenuShoes");
                MongoCollection<Document> collectionIva = database.getCollection("iva");
                System.out.print("\nEnter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the model: ");
                model = sc.next();
                System.out.print("Enter the price: ");
                price = sc.nextFloat();
                Document Shoes = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", model)
                        .append("price", price);
                collectionPizza.insertOne(Shoes);
                System.out.println("New Shoes has agragated: " + Shoes.get("name"));
                iva = (float) (price * 0.15);
                price = iva + price;
                Document ShoesIva = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", model)
                        .append("price with Iva", price);
                collectionIva.insertOne(ShoesIva);
                System.out.println("New price with Iva of: " + ShoesIva.get("name"));
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void findShoes() {
        int id;
        String uri = "mongodb+srv://david:david@cluster0.egyi4vp.mongodb.net/";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionShoes = database.getCollection("menu");
                System.out.print("\nEnter the id to find: ");
                id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionShoes.find(Filters.and(filter)).first();
                    System.out.println("Shoes: " + doc.toJson());
                    findShoesIva(id);
                } catch (Exception e) {
                    System.out.println("Data not found");
                }
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void findShoesIva(int id) {
        String uri = "mongodb+srv://david:david@cluster0.egyi4vp.mongodb.net/";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                MongoCollection<Document> collectionIva = database.getCollection("iva");
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionIva.find(Filters.and(filter)).first();
                    System.out.println("Shoes: " + doc.toJson());
                } catch (Exception e) {
                    System.out.println("Data not found");
                }
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
}