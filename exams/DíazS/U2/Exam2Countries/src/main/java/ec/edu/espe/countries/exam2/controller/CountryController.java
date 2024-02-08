package ec.edu.espe.countries.exam2.controller;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.countries.exam2.model.Country;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class CountryController {
       
    public static void register(Country generatedCountry){
        String connectionString = "mongodb+srv://stefy:stefy@cluster0.3me9ogn.mongodb.net/?retryWrites=true&w=majority";
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi).build();
        
        try (MongoClient mongoClient = MongoClients.create(settings)){
            try{
                MongoDatabase database = mongoClient.getDatabase("WorldDB");
                Gson json = new Gson();
                String countryData = json.toJson(generatedCountry);
                Document document = Document.parse(countryData);
                database.getCollection("Countries").insertOne(document);
            }catch (MongoException e){
                e.printStackTrace();
            }
                
            }
        }
    
    public static ArrayList<Country> show(){
        String connectionString = "mongodb+srv://stefy:stefy@cluster0.3me9ogn.mongodb.net/?retryWrites=true&w=majority";
        
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        ArrayList<Country> countries = new ArrayList<>();
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                MongoDatabase database = mongoClient.getDatabase("WorldDB");
                MongoCollection<Document> collection = database.getCollection("Countries");
                MongoCursor<Document> cursor = collection.find().iterator();
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    Country country = new Country();
                    
                    country.setId(document.getInteger("id"));
                    country.setName(document.getString("name"));
                    country.setTotalPopulation(document.getInteger("totalPopulation"));
                    country.setForeignPopulation(document.getInteger("foreignPopulation"));
                    
                    countries.add(country);
                }
            }catch (MongoException e){
                e.printStackTrace();
            }
        }
            return countries;
}}

