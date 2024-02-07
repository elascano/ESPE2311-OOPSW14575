package ec.edu.espe.actors.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.actors.model.Actor;
import org.w3c.dom.Document;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class MongoDBManager {
    private static final String DATABASE_NAME = "Actor";
    private static final String COLLECTION_NAME = "actors";

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<org.bson.Document> collection;

    public MongoDBManager() {
        // Configura la conexión a MongoDB
        this.mongoClient = MongoClients.create("mongodb+srv://Jefferson:Hola_135@cluster0.6gfeclg.mongodb.net/");
        this.database = mongoClient.getDatabase(DATABASE_NAME);
        this.collection = database.getCollection(COLLECTION_NAME);
    }

    public void insertActor(Actor actor) {
        org.bson.Document document = new org.bson.Document("id", actor.getId())
                .append("name", actor.getName())
                .append("hourlyWage", actor.getHourlyWage())
                .append("daysWork", actor.getDaysWork())
                .append("totalCost", actor.getTotalCost());

        collection.insertOne(document);
        System.out.println("The actor Id is not found: " + actor);
    }

}
