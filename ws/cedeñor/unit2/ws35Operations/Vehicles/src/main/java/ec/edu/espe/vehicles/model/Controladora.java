package ec.edu.espe.vehicles.model;

import ec.edu.espe.vehicles.controller.Vehicle;
import java.util.List;
import utils.ControladoraPersistencia;

/**
 *
 * @author RC_558
 */
public class Controladora {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();
    
    public void addCar(String id, String type, String price, String amount) {
        
        Vehicles car = new Vehicles(id, type, price, amount);
        
        controladoraPersis.addCar(car);
    }

    public List<Vehicles> bringVehicles() {
        return controladoraPersis.bringCar();
    }
    
}
