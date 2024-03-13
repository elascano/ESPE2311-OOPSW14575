package ec.edu.espe.vehicle.model;

/**
 *
 * @author David
 */

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

public class Vehicle {
    private int id;
    private String brand;
    private String color;

    public Vehicle(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    
    public int getId(){
        return id;
    }
    
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void saveToDatabase() {
        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://davidcepeda13:david@cluster0.fvgdrtu.mongodb.net/")) {
            MongoDatabase database = mongoClient.getDatabase("FAR_DB");
            MongoCollection<Document> collection = database.getCollection("Vehicles");

            Document newProduct = new Document("unique id", id)
                    .append("attribute1", brand)
                    .append("attribute2", color);

            collection.insertOne(newProduct);
            System.out.println("Producto agregado exitosamente.");
        } catch (Exception e) {
            System.err.println("Error al agregar el producto: " + e);
        }

    }
    public void findToDatabase() {
    try (MongoClient mongoClient = MongoClients.create("mongodb+srv://davidcepeda13:david@cluster0.fvgdrtu.mongodb.net/")) {
        MongoDatabase database = mongoClient.getDatabase("FAR_DB");
        MongoCollection<Document> collection = database.getCollection("Vehicles");

        Document result = collection.find(and(eq("unique id", id), eq("attribute1", brand), eq("attribute2", color))).first();

        if (result != null) {
            System.out.println("Vehículo encontrado exitosamente.");
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    } catch (Exception e) {
        System.err.println("Error al buscar el vehículo en la base de datos: " + e);
    }
}
}
