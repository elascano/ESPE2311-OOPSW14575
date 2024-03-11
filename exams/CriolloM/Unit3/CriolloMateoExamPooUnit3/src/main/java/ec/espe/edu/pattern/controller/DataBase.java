
package ec.espe.edu.pattern.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.espe.edu.pattern.model.ListNumber;
import org.bson.Document;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class DataBase {
    private static final String uri = "mongodb+srv://gabriel2004mat:1234@cluster0.dsm2nfg.mongodb.net/";
    private static final String DataBaseName = "StrategyCriollo_DB";
    private static final String CollectionName = "ArrayMateo";
    
    private static Gson gson;
    private static Document document;
    
    public static MongoCollection<org.bson.Document> getCollection(){
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase database = mongoClient.getDatabase(DataBaseName);
            
            return database.getCollection(CollectionName);
        } catch (MongoException | NoSuchMethodError e) {
            System.err.println(e.getCause());
            return null; 
        }
    }
    
    public static void agreggrateListNumbers(ListNumber listNumbers){
        MongoCollection <Document> dataBase = getCollection();
        if(dataBase!=null){
            gson= new GsonBuilder().create();
            String json = gson.toJson(listNumbers);
            document = Document.parse(json);
            dataBase.insertOne(document);
        }
    }
    
}
