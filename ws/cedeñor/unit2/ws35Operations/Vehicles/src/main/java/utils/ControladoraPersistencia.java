package utils;

import ec.edu.espe.vehicles.model.Vehicles;
import java.util.List;

/**
 *
 * @author RC_558
 */
public class ControladoraPersistencia {

    MongoDBDataBase carController = new MongoDBDataBase();
    
    public void addCar(Vehicles car) {
        carController.create(car);
    }

    public List<Vehicles> bringCar() {
        return null;
        
    }
    
}
