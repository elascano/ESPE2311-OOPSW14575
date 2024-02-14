// Retrieves a document that matches a query filter by using the Java driver
package com.mycompany.testmongodb;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;

public class FindOne {

    public static void main(String[] args) {

        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb+srv://olivier:olivier@cluster0.gguuezt.mongodb.net/?retryWrites=true&w=majority";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("DailyDevDB");
            MongoCollection<Document> collection = database.getCollection("Tasks");

            // Creates instructions to project two document fields
            Bson projectionFields = Projections.fields(
                    Projections.include("title", "status"),
                    Projections.excludeId());

            // Retrieves the first matching document, applying a projection and a descending sort to the results
            //FETCHING
            Document doc = collection.find(eq("title", "Task created from the browser"))
                    .projection(projectionFields)
                    //                    .sort(Sorts.descending("imdb.rating"))
                    .first();

//
            // Prints a message if there are no result documents, or prints the result document as JSON
            if (doc == null) {

                System.out.println("No results found.");
            } else {
                System.out.println(doc.toJson());
            }

            System.out.println("alt " + doc.get("salary", "negros"));

        }
    }
}
