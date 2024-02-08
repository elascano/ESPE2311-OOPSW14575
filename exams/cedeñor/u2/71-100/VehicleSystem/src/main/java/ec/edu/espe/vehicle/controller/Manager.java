package ec.edu.espe.vehicle.controller;

import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.vehicle.model.Vehicles;
import ec.edu.espe.vehicle.utils.ManageJson;
import ec.edu.espe.vehicle.utils.MongoDB;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Manager extends MongoDB implements IVehicle {

        private String collectionName = "Vehicles";
    private Class classType = Vehicles.class;
    
    @Override
    public Vehicles find(int idToSearch) {
         this.connectToDatabase();
        this.getFromCollection(collectionName);
        
        Bson filter = eq("id",idToSearch);
        Document doc = this.coll.find(filter).first();
        
        if(doc == null){
            return new Vehicles(0, "NONE", 0, 0);        
        }else{
            Vehicles vehicle = ManageJson.passJsonToObject(doc, classType);
        return vehicle;
        }
    }

    @Override
    public ArrayList<Vehicles> read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Vehicles vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Vehicles vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     public float getTotalCost(Vehicles vehicle){
        return vehicle.getRentalCost() * vehicle.getHourlyUse();
    }
     
}