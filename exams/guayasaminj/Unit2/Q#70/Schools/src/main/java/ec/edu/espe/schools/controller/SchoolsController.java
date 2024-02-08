

package ec.edu.espe.schools.controller;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.schools.model.Schools;
import java.util.ArrayList;
import java.util.List;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public abstract class SchoolsController {
    private static final String DATABASE = "Exam";
     private static MongoClient mongoClient;
    static {
        connectToDataBase();
    }
     public static MongoDatabase connectToDataBase() {
        String connectionString = "mongodb+srv://josuePOO:josue78945@cluster0.ppe7wcd.mongodb.net/";
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .codecRegistry(codecRegistry)
                .build();

        mongoClient = MongoClients.create(clientSettings);

        return mongoClient.getDatabase(DATABASE);
    }

     public static void registerSchool(Schools school) {
        MongoDatabase database = connectToDataBase();
        MongoCollection<Document> collection = database.getCollection("Schools");

        Document schoolDocument = new Document("id", school.getId())
                .append("nameOftheSchool", school.getNameOftheSchool())
                .append("direccion", school.getDireccion())
                .append("numberOfStudents", school.getNumberOfStudents());

        collection.insertOne(schoolDocument);
    }

    public static void editSchool(Schools school) {
        MongoDatabase database = connectToDataBase();
        MongoCollection<Document> collection = database.getCollection("Schools");

        Document filter = new Document("id", school.getId());

        Document updatedDocument = new Document("id", school.getId())
                .append("nameOftheSchool", school.getNameOftheSchool())
                .append("direccion", school.getDireccion())
                .append("numberOfStudents", school.getNumberOfStudents());

        UpdateResult result = collection.replaceOne(filter, updatedDocument);

        if (result.getModifiedCount() > 0) {
            System.out.println("School edited successfully in MongoDB.");
        } else {
            System.out.println("School not found or no changes were made in MongoDB.");
        }
    }

    public static void deleteSchool(int id) {
        MongoDatabase database = connectToDataBase();
        MongoCollection<Document> collection = database.getCollection("Schools");

        Document filter = new Document("id", id);
        DeleteResult result = collection.deleteOne(filter);

        if (result.getDeletedCount() > 0) {
            System.out.println("School deleted successfully from MongoDB.");
        } else {
            System.out.println("School not found in MongoDB or no changes were made.");
        }
    }
    public static <T> MongoCollection<T> getFromCollection(String collectionName, Class<T> type) {
            MongoDatabase db = connectToDataBase();
            return db.getCollection(collectionName, type);
        }
    
    public abstract void register(Object object);
    
}