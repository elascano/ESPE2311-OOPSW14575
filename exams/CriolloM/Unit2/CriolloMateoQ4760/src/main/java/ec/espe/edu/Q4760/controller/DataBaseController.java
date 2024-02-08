
package ec.espe.edu.Q4760.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class DataBaseController {
    private static final String URI = "mongodb+srv://gabriel2004mat:1234@cluster0.dsm2nfg.mongodb.net/";
    private static final String DATABASE_NAME = "Far_DB";
    private static final String COLLECTION_NAME = "Cellphones";
    
    public static boolean saveObject(Object cellphone){
        MongoCollection <Document> collection=getCollection();
        if(collection!=null){
            Gson gson = new GsonBuilder().create();
            String json=gson.toJson(cellphone);
            Document personDocument = Document.parse(json);
            collection.insertOne(personDocument);
            System.out.println("Objeto registrado en la base de datos");
            return true;
        }else{
            System.out.println("No se pudo insertar el objeto a la base de datos");
            return false;
        }
    }
    
    public static MongoCollection<Document> getCollection(){
        try {
            MongoClient mongoClient = MongoClients.create(URI);
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            
            return database.getCollection(COLLECTION_NAME);
        } catch (MongoException e) {
            System.err.println(e.getCause());
            return null; 
        }
    }
    
    
}
