package ec.edu.espe.q6170interface.controller;

import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.q6170interface.model.Singer;
import ec.edu.espe.q6170interface.utils.ManageJson;
import ec.edu.espe.q6170interface.utils.ManageMongoDB;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Frederick
 */
public class SingerController extends ManageMongoDB implements ISinger {
    private String collectionName = "Singers";
    private Class classType = Singer.class;
    
    @Override
    public Singer find(int idToSearch) {
        this.connectToDatabase();
        this.getFromCollection(collectionName);
        
        Bson filter = eq("id",idToSearch);
        Document doc = this.coll.find(filter).first();
        
        if(doc == null){
            return new Singer(0, "NONE", 0, 0);        
        }else{
            Singer singer = ManageJson.passJsonToObject(doc, classType);
        return singer;
        }
    }

    @Override
    public ArrayList<Singer> read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Singer singer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Singer singer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public float getTotalCost(Singer singer){
        return singer.getHiringCost() * singer.getPresentedHours();
    }
}
