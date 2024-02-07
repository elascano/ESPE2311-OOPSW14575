package ec.edu.espe.persistance.controller;

import com.google.gson.Gson;
import java.util.ArrayList;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author mateo
 */
public class MongoDB extends INoSqlManager {

    private static MongoClient mongoClient;

    public MongoDB(String URI, String DB) {
        INoSqlManager.setDataBase(DB);
        INoSqlManager.setURI(URI);
        connect(INoSqlManager.getURI());
    }

    @Override
    public void connect(String URI) {
        if (mongoClient == null) {
            mongoClient = MongoClients.create(INoSqlManager.getURI());
        }
    }

    @Override
    public boolean create(Object data, String table) {
        MongoDatabase database = mongoClient.getDatabase(DataBase);
        MongoCollection<Document> collection = database.getCollection(table);
        Gson gson = new Gson();
        collection.insertOne(Document.parse(gson.toJson(data)));
        System.out.println("Object --> " + data.toString() + " added to " + DataBase + "." + table);
        return true;
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean create(String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String read(String filterKey, String filterValue, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> readAll(String filterKey) {
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
