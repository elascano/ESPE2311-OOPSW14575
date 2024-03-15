package utils;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author David
 */
public abstract class DBManager extends DataPersistence {
    private MongoClient mongoClient;
    private MongoDatabase database;
    
    public DBManager() {
        mongoClient = null;
        database = null;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }
    
    public void connect(String uri, String dataBaseName){
        try{
            setMongoClient(MongoClients.create(uri));
            setDatabase(getMongoClient().getDatabase(dataBaseName));
            System.out.println("Connected successfully to server.");
             
        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
    }

    @Override
    public void insert(String collectionName, String json) {
        try{
            MongoCollection collection = getDatabase().getCollection(collectionName);
            Document document = Document.parse(json);    
            collection.insertOne(document);
            System.out.println("The document was successfully register at the data base.");
             
        }catch(MongoException me){
            System.out.println("An error occurred while attempting to insert" + me);
            
        }
    }
    
    @Override
    public ArrayList read(String collectionName){
        MongoCollection collection;
        ArrayList<String> documents = new ArrayList<>();
        
        try {
            collection = getDatabase().getCollection(collectionName);

            MongoCursor<Document> cursor = collection.find().iterator();

            while (cursor.hasNext()) {                    
            documents.add(cursor.next().toJson());
            }
            
            cursor.close();

        } catch (Exception e) {
            System.out.println("");
            
        }
    return documents; 
    }
    
    public static ArrayList documentsToArrayListObject(ArrayList<String> documents, Object object) {
        Gson gson;
        ArrayList<Object> objects;
        
        gson = new Gson();
        objects = new ArrayList<>();
        
        for (String document : documents) {
            object = gson.fromJson(document, object.getClass());
            objects.add(object);
        }
        

        return objects;
    }


    @Override
    public boolean update(String collectionName, String fieldNameToSearch, String valueToSearch,
        String fieldNameToUpdate, String valueToUpdate) {
        try{
            MongoCollection <Document> collection = getDatabase().getCollection(collectionName);
            
            UpdateResult updateResult = collection.updateOne(Filters.eq(
            fieldNameToSearch, valueToSearch),Updates.set(
            fieldNameToUpdate, valueToUpdate));
            return true;
            
        }catch(MongoException me){
            return false;
        }
    }
}
