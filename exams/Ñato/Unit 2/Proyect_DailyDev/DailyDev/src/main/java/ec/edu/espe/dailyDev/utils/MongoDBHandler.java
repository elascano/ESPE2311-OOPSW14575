package ec.edu.espe.dailyDev.utils;

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
import ec.edu.espe.dailyDev.model.Task;
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

/**
 * Clase que maneja la conexión y operaciones con MongoDB.
 *
 * @author Olivier Paspuel
 */
public class MongoDBHandler {

    public static MongoDatabase connect() {
        Dotenv dotenv = Dotenv.load();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(dotenv.get("MONGODB_URI")))
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

    public boolean documentExists(String collectionName, Document query) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        return collection.find(query).limit(1).iterator().hasNext();
    }

    public boolean checkCredentials(String username, String password, String collectionName) {
        try {
//            MongoDatabase database = mongoClient.getDatabase("DailyDevDB");
//            MongoCollection<Document> collection = database.getCollection(collectionName);

            MongoCollection<Document> collection = connectToCollection(collectionName);

            Document query = new Document("username", username)
                    .append("password", PasswordHandler.encryptPassword(password));

            FindIterable<Document> result = collection.find(query);

            return result.iterator().hasNext();
        } catch (Exception e) {
            System.err.println("Error checking credentials in MongoDB: " + e.getMessage());
            return false;
        }
    }

    public Document findOneDoc(String key, Object value, String collectionName) {

        MongoCollection<Document> collection = connectToCollection(collectionName);

        return collection.find(eq(key, value)).first();

    }

    public Document findDocWithFilter(Bson filter, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        return collection.find(filter).first();
    }

    public static FindIterable<Document> findAllDocs(Bson filter, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        return collection.find(filter);
    }

    public static List<Task> findAllTasks(Bson filter) {
//        MongoCollection<Document> collection = connectToCollection(collectionName);
        FindIterable<Document> documents = findAllDocs(filter, "Tasks");

        System.out.println(documents);
        List<Task> taskList = new ArrayList<>();

        for (Document document : documents) {
            // Convert each Document to a Task object
            Task task = convertDocumentToTask(document);

            // Add the Task object to the list
            taskList.add(task);
        }

        return taskList;
    }

    private static Task convertDocumentToTask(Document document) {
        // Implement logic to convert Document to Task object
        Gson gson = new Gson();

        String task = gson.toJson(document);

        return gson.fromJson(task, Task.class);
        // Example: return new Task(document.getString("taskId"), document.getString("taskName"), ...);
    }

    public static Document updateDocument(Document query, Bson updates, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        try {
            Document updatedDocument = collection.findOneAndUpdate(query, updates,
                    new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER));

            System.out.println("Document updated successfully");
            return updatedDocument;
        } catch (MongoException me) {
            System.err.println("Unable to update due to an error: " + me);
            return null;
        }
    }

    public static Document replaceDocument(Document query, Document replacement, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        if (collection == null) {
            System.err.println("Failed to connect to collection: " + collectionName);
            return null;
        }

        try {
            UpdateResult result = collection.replaceOne(query, replacement);

            // Check if the document was replaced successfully
            if (result.getModifiedCount() > 0) {
                System.out.println("Document replaced successfully");
                return query;
            } else {
                System.out.println("No document found matching the query: " + query);
                return null;
            }
        } catch (MongoException me) {
            System.err.println("Unable to replace document due to an error: " + me);
            return null;
        }
    }

    public static boolean deleteDocument(Document query, String collectionName) {
        MongoCollection<Document> collection = connectToCollection(collectionName);
        if (collection == null) {
            System.err.println("Failed to connect to collection: " + collectionName);
            return false;
        }

        try {
            // Call the deleteOne method to delete the document
            DeleteResult result = collection.deleteOne(query);

            // Check if the document was deleted successfully
            if (result.getDeletedCount() == 1) {
                System.out.println("Document deleted successfully");
                return true; // Document deletion was successful
            } else {
                System.out.println("No document found matching the query: " + query);
                return false;
            }
        } catch (MongoException me) {
            System.err.println("Unable to delete document due to an error: " + me);
            return false;
        }
    }

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

