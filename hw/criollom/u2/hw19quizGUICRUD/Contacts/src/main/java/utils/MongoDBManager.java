
package utils;

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
public class MongoDBManager {
    
    private static final String uri = "mongodb+srv://gabriel2004mat:1234@cluster0.dsm2nfg.mongodb.net/";
    private static final String dataBaseName = "Far_DB";
    

    public static void create(String data, String collection){
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase dataBase = mongoClient.getDatabase(dataBaseName);
            MongoCollection <Document> baseData = dataBase.getCollection(collection);
            Document personDocument = Document.parse(data);
           baseData.insertOne(personDocument);
           
        } catch (MongoException e) {
            System.out.println("No se pudo conectar a la base de datos"+e);
        }
        
        
        
    }
    
    public static String read(String collection){
        //Todo return all the collection documents
        return "data form data base";
    }
    
    public static String find(String search , String collection){
        //Todo retunr
        return "data form data base";
    }
    
    public static boolean update(String newData , String search, String collection){
        //Todo ipdate
        return true;
    }
    
    public static boolean delete(String search , String collection){
        //Todo create Collection
        return true;
    }
}
