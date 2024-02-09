package ec.edu.espe.persistence.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import io.github.cdimascio.dotenv.Dotenv;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Olivier Paspuel
 */
public class MongoDBHandler {

    public MongoClient connect() {
        Dotenv dotenv = Dotenv.load();
        String MONGODB_URI = dotenv.get("MONGODB_URI");

        MongoClient mongoClient = MongoClients.create(MONGODB_URI);
        return mongoClient;
    }

    public MongoCollection<Document> connectToCollection( String collectionName) {
        MongoClient mongoClient = connect();
        MongoDatabase db = mongoClient.getDatabase("DailyDevDB");
        MongoCollection<Document> collection = db.getCollection(collectionName);
        return collection;
    }

    public void createDocument(Document document, String collectionName) {

        MongoCollection<Document> collection = connectToCollection(collectionName);

        try {
            
            
            InsertOneResult result = collection.insertOne(document);
            
//            InsertOneResult result = collection.insertOne(new Document()
//                    .append("_id", new ObjectId())
//                    .append("title", title));

            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }


//    @Override
//    public String read(String filterKey, String filterValue, String table) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public String readAll(String table) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public boolean update(String filterKey, String filterValue, String newData, String table) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public boolean delete(String filterKey, String filterValue, String table) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

}
