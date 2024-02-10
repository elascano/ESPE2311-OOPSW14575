package ec.edu.espe.persistence.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Olivier Paspuel
 */
public class MongoDBHandler extends NoSQLHandler {

    @Override
    public MongoClient connect(String URI) {
        MongoClient mongoClient = MongoClients.create(URI);
        return mongoClient;
    }

    @Override
    public MongoCollection<Document> connectToCollection(String databaseName, String collectionName) {
        MongoClient mongoClient = connect("mongodb+srv://olivier:olivier@cluster0.gguuezt.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db = mongoClient.getDatabase(databaseName);
        MongoCollection<Document> collection = db.getCollection(collectionName);
        return collection;
    }
    
    @Override
    public void create(String title) {

        MongoCollection<Document> collection = connectToCollection("DailyDevDB", "Tasks");

        try {
            InsertOneResult result = collection.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("title", title));

            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }
    
    
    @Override
    public void closeConnection(String connection) {
        // MONGODB CONNECTION DOES NOT REQUIRE TO BE CLOSED
    }

    @Override
    public String read(String filterKey, String filterValue, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String readAll(String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(String filterKey, String filterValue, String newData, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String filterKey, String filterValue, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
