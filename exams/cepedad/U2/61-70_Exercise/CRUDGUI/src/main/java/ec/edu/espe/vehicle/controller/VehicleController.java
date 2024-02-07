package ec.edu.espe.vehicle.controller;

/**
 *
 * @author David
 */

import ec.edu.espe.vehicle.model.Vehicle;
import ec.edu.espe.vehicle.view.VehicleView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   public class VehicleController {

    private VehicleView view;

    public VehicleController(VehicleView view) {
        this.view = view;

    }

    class AddButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String brand = view.getBrand();
            String color = view.getColor();

            Vehicle newProduct = new Vehicle(0, brand, color);
            newProduct.saveToDatabase();
        }
    }

    public static void main(String[] args) {
        VehicleView view = new VehicleView();
        new VehicleController(view);
    }
   }
