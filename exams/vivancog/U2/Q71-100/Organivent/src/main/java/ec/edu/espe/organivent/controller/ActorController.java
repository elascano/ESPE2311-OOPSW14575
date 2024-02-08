package ec.edu.espe.organivent.controller;

import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.organivent.model.Actor;
import ec.edu.espe.organivent.utils.ManageJson;
import ec.edu.espe.organivent.utils.ManageMongoDB;
import java.util.ArrayList;
import org.bson.Document;
import ec.edu.espe.organivent.iterfaces.IActor;

/**
 *
 * @author Gabriel Vivanco
 */
public class ActorController extends ManageMongoDB implements IActor {
    private String collectionName = "Actors";
    private Class classType = Actor.class;

    @Override
    public void create(Actor actor) {
        this.connectToDatabase();
        this.getFromCollection(collectionName);
        
        Document doc = Document.parse(ManageJson.passObjectToJson(actor));
        this.coll.insertOne(doc);
    }

    @Override
    public ArrayList<Actor> read() {
        this.connectToDatabase();
        this.getFromCollection(collectionName);
        
        ArrayList<Actor> artistsInDB = ManageJson.passCollectionToList(this.coll, classType);
        
        return artistsInDB;
    }

    @Override
    public void update(Actor actor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Actor actor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }

    

