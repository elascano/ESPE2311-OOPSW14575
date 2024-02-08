package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author Ilhan R
 */
public class MongoDBManager {
    private final String connectionString = "mongodb+srv://Ilhan_R:Programacion123@cluster0.lb7qwrn.mongodb.net/";

    public String Find(int id) {
        StringBuilder result = new StringBuilder();
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Exam");
            MongoCollection<Document> collection = database.getCollection("Test");
   
            Document query = new Document("id", id);
            Document foundDocument = collection.find(query).first();

            if (foundDocument != null) {
                int databaseId = foundDocument.getInteger("id");
                String name = foundDocument.getString("name");
                result.append("ID: ").append(databaseId).append("\n");
                result.append("Name: ").append(name).append("\n");
            } else {
                result.append("Stadium not found").append(id).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
    