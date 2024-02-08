
package ec.edu.espe.apartments.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.apartments.model.Apartment;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Carlos
 */
public class ApartmentController {
    public static MongoDatabase connectToDataBase(){
        String connectionString="mongodb+srv://carlos:carlosha@cluster0.5w2v3gl.mongodb.net/";
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

        MongoClient mongoClient = MongoClients.create(clientSettings);
        MongoDatabase db = mongoClient.getDatabase("UnitTest");
        return db;
    }
    public static <T> MongoCollection<T> getFromCollection(String collectionName, Class<T> type) {
            MongoDatabase db = connectToDataBase();
            return db.getCollection(collectionName, type);
        }
    public static void addToMongo(Object object) {
        Class classType = Apartment.class;
        String collection = "Apartment";
        MongoCollection<Apartment> apartmentDB = getFromCollection(collection, classType);
        apartmentDB.insertOne((Apartment) object);
    }
    public static int getPrice(int size, int price){
        int totalPrice=size*price;
        return totalPrice;
    }
}
