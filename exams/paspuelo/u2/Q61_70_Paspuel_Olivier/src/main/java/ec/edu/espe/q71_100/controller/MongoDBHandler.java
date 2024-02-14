package ec.edu.espe.q71_100.controller;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

import org.bson.UuidRepresentation;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;
import org.jfree.data.gantt.Task;

/**
 * Clase que maneja la conexión y operaciones con MongoDB.
 *
 * @author Olivier Paspuel
 */
public class MongoDBHandler {

    public static MongoDatabase connect() {
//        Dotenv dotenv = Dotenv.load();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString("mongodb+srv://olivier:olivier@cluster0.gguuezt.mongodb.net/?retryWrites=true&w=majority"))
                .serverApi(serverApi)
                .codecRegistry(codecRegistry)
                .uuidRepresentation(UuidRepresentation.STANDARD)
                .build();

        MongoClient mongoClient = MongoClients.create(clientSettings);
        MongoDatabase db = mongoClient.getDatabase("DailyDevDB");

        return db;
    }

    public static MongoCollection<Document> connectToCollection(String collectionName) {
        MongoDatabase db = connect();
        MongoCollection<Document> collection = db.getCollection(collectionName);
        return collection;
    }

    public void createDocument(String collectionName, Document document) {
        MongoCollection<Document> collection = connectToCollection(collectionName);

        try {
            InsertOneResult result = collection.insertOne(document);
            System.out.println("Succesfully created!\n");

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }



    public Document findDocWithFilter(Bson filter, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        return collection.find(filter).first();
    }

    public static FindIterable<Document> findAllDocs(Bson filter, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        return collection.find(filter);
    }

//    private static Task convertDocumentToTask(Document document) {
//        // Implement logic to convert Document to Task object
//        Gson gson = new Gson();
//
//        String task = gson.toJson(document);
//
//        return gson.fromJson(task, Task.class);
//        // Example: return new Task(document.getString("taskId"), document.getString("taskName"), ...);
//    }

    public static boolean createDocument(Document document, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        if (collection == null) {
            System.err.println("Failed to connect to collection: " + collectionName);
            return false;
        }

        try {
            collection.insertOne(document);
            System.out.println("Document created successfully");
            return true;
        } catch (MongoException me) {
            System.err.println("Unable to create document due to an error: " + me);
            return false;
        }
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
