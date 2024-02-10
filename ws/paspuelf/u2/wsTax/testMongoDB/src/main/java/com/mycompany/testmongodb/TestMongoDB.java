package com.mycompany.testmongodb;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestMongoDB {

    public static void main(String[] args) {

        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://olivier:olivier@cluster0.gguuezt.mongodb.net/?retryWrites=true&w=majority";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("DailyDevDB");
            MongoCollection<Document> collection = database.getCollection("Tasks");

            Document doc = collection.find(eq("title", "Task created from the browser 1")).first();
            
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }
}
