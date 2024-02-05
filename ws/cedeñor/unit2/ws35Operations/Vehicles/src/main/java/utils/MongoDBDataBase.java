package utils;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.vehicles.model.Vehicles;
import ec.edu.espe.vehicles.view.FrmSearchVehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;


/**
 *
 * @author RC_558
 */
public class MongoDBDataBase {

    public void create(Vehicles car) {
       Scanner scanner = new Scanner(System.in);
        try(MongoClient mongoclient = MongoClients.create("mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/")){
            
            MongoDatabase dataBase = mongoclient.getDatabase("VentaOfVehicles");
            
            MongoCollection<Document> collection = dataBase.getCollection("Vehicles");
             
            //Create
            Document doc1 = new Document("Id",car.getId())
                    .append("type", car.getType())
                    .append("price", car.getPrice())
                    .append("amount", car.getAmount());
                   
            collection.insertOne(doc1);
          
        }catch(MongoException e){
            System.out.println("No conecto" + e.getMessage() );
        }
        
    }

    public void read() {
        try(MongoClient mongoclient = MongoClients.create("mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/")){
            
            MongoDatabase dataBase = mongoclient.getDatabase("VentaOfVehicles");
            
            MongoCollection<Document> collection = dataBase.getCollection("Vehicles");
            
              // Recuperar todos los documentos de la colección
            List<Document> documents = new ArrayList<>();
            collection.find().into(documents);

          
                
            
    }catch(MongoException e){
        
    }
    
    }

    
    
    public String files(String search, String collection) {
        // TODO retunr one document accordign to the search criteria
        return "data from data base";
    }

    public boolean update() {
        try(MongoClient mongoclient = MongoClients.create("mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/")){
            
            MongoDatabase dataBase = mongoclient.getDatabase("VentaOfVehicles");
            
            MongoCollection collection = dataBase.getCollection("Vehicles");
            
            
        }catch(MongoException e){
            System.out.println("No se pudo conectar" + e.getMessage());
        }
        
        return true;
    }

    public boolean delete() {
       try(MongoClient mongoClient = MongoClients.create("mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/")){
           
           MongoDatabase dataBase = mongoClient.getDatabase("VentaOfVehicles");
           
           MongoCollection collection = dataBase.getCollection("Vehicles");
           
       }catch(MongoException e){
           System.out.println("No se conecto" + e.getMessage());
       }
        
        return true;
       
    }

}
