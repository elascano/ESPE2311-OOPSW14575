package com.mycompany.intento3;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

/**
 *
 * @author RC_558
 */
public class MongoDBConnection {

    public static void main(String[] args) {
       
        String connectionString = "mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Obtén la base de datos
            MongoDatabase database = mongoClient.getDatabase("FoodAndRollSystemDB");

            // Realiza operaciones en la base de datos
            MongoCollection<Document> dishesCollection = database.getCollection("Dishes");

            
          //CREATE
            Document newDish = new Document()
             .append("id", "03")
             .append("name", "Arroz con huevo") 
             .append("price", 19.99)
              .append("category", "Otros");
             
             dishesCollection.insertOne(newDish);
            System.out.println("Plato creado correctamente");
            
            //Deleate
            String dishNameToDelete = "Arroz con huevo";

            dishesCollection.deleteOne(
                    Filters.eq("name", dishNameToDelete)
            );

            //System.out.println("Plato eliminado correctamente.");
            
            //Update
            String dishNameToUpdate = "Tallarin";
            double newPrice = 7.99;

            dishesCollection.updateOne(
                    Filters.eq("name", dishNameToUpdate),
                    Updates.set("price", newPrice)
            );

            //System.out.println("Plato actualizado correctamente.");
            
            //Read
            FindIterable<Document> result = dishesCollection.find();
            MongoCursor<Document> cursor = result.iterator();
            while (cursor.hasNext()) {
                Document dish = cursor.next();
                System.out.println(dish.toJson());
            }


            System.out.println("Conexión exitosa a MongoDB Atlas");
        } catch (Exception e) {
            System.err.println("Error al conectar a MongoDB Atlas: " + e.getMessage());
        }
    }
}
