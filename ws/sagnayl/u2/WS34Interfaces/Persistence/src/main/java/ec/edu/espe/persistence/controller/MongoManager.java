package ec.edu.espe.persistence.controller;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


/**
 *
 * @author Luis Sagnay
 */
public class MongoManager extends NoSqlManager {

    private static MongoClient mongoClient;

    public MongoManager(String URI, String DB) {
        NoSqlManager.setDataBase(DB);
        NoSqlManager.setURI(URI);
        connect(NoSqlManager.getURI());
    }

    @Override
    public final void connect(String URI) {
        if (mongoClient == null) {
            mongoClient = MongoClients.create(NoSqlManager.getURI());
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
    public String read(String filterKey, String filterValue, String table) {
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

    @Override
    public boolean create(String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
