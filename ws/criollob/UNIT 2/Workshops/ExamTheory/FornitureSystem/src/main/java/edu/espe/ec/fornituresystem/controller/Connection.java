/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.espe.ec.fornituresystem.controller;

import edu.espe.ec.fornituresystem.model.Furniture;
import javax.swing.text.Document;

/**
 *
 * @author Usuario
 */
public class Connection {
     public static void insertFurniture(Furniture furniture) {
        String uri = "mongodb+srv://sebastian:sebastian2110@cluster0.87inkuy.mongodb.net/";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("ex");
            try {
                System.out.println("Connected successfully to the server.");
                MongoCollection<Document> collectionResident = database.getCollection("Furniture");

                Document events = new Document("_id", new ObjectId())
                        .append("name", furniture.getName())
                        .append("id", furniture.getId())
                        .append("date", furniture.getDate())
                        .append("description", furniture.getDescription());

                collectionResident.insertOne(events);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static Furniture findFurniture(Furniture furniture) {

        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ex");
            try {
                MongoCollection<Document> collectionFurniture = database.getCollection("Furniture");

                Bson filter = Filters.eq("id", furniture.getId());
                try {
                    Document doc = collectionFurniture.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<Furniture> type = new TypeToken<Furniture>() {
                    };
                    furniture = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return furniture;
    }

}
