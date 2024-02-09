// Inserts a sample document describing a movie by using the Java driver
package com.mycompany.testmongodb;

import java.util.Arrays;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import java.util.ArrayList;

public class InsertOne {

    
    
    public static void main(String[] args) {
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb+srv://olivier:olivier@cluster0.gguuezt.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("DailyDevDB");
            MongoCollection<Document> collection = database.getCollection("Tasks");

            ArrayList<String> movieList = new ArrayList<>();

            // Adding movies to the list
            movieList.add("The Shawshank Redemption");
            movieList.add("The Godfather");
            movieList.add("Pulp Fiction");
            movieList.add("The Dark Knight");
            movieList.add("Schindler's List");

            
            try {
                // Inserts a sample document describing a movie into the collection
                InsertOneResult result = collection.insertOne(new Document()
                        .append("_id", new ObjectId())
                        .append("title", "tefy qcha")
                        .append("movieList", movieList));

                // Prints the ID of the inserted document
                System.out.println("Success! Inserted document id: " + result.getInsertedId());

                // Prints a message if any exceptions occur during the operation
            } catch (MongoException me) {
                System.err.println("Unable to insert due to an error: " + me);
            }
        }
    }
}
