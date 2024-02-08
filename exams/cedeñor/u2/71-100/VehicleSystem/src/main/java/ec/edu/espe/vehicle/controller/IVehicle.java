package ec.edu.espe.vehicle.controller;

import ec.edu.espe.vehicle.model.Vehicles;
import java.util.ArrayList;

/**
 *
 * @author RC_558
 */
public interface IVehicle {
        public Vehicles find(int idToSearch);
    public ArrayList<Vehicles> read();
    public void update(Vehicles vehicle);
    public void delete(Vehicles vehicle);
}
