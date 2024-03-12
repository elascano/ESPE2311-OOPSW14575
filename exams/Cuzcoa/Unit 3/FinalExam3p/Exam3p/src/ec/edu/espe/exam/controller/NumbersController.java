package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.model.Numbers;
import org.bson.Document;

import java.util.Arrays;

/**
 * Controlador para manejar la inserción de números en una base de datos MongoDB.
 * 
 * @author Criollo Sebastian
 */
public class NumbersController {

    public boolean register(Numbers number) {
        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://alex:cuzco@cluster0.mjoertv.mongodb.net/")) {
            MongoDatabase db = mongoClient.getDatabase("Numbers");

            Document doc = new Document()
                    .append("unsorted", Arrays.toString(number.getUnsorted()))
                    .append("size", number.getSize())
                    .append("sortAlgorithm", number.getSortAlgorithm())
                    .append("sorted", Arrays.toString(number.getSorted()));

            MongoCollection<Document> collection = db.getCollection("SortNumbers");
            collection.insertOne(doc);

            return true;
        } catch (Exception e) {
            e.printStackTrace(); // Manejar la excepción de una manera más específica según tus necesidades.
            return false;
        }
    }
}
