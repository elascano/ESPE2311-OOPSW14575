package ec.edu.espe.examoop.view;

import com.google.gson.Gson;
import ec.edu.espe.examoop.model.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author RC_558
 */
public class ExamOOPSystem {
       public static void main(String[] args) {   
               
       Gson gson = new Gson ();
       ArrayList<Vehicle> listVehicles = new ArrayList<>();
       
       Vehicle vehicle1 = new Vehicle (1,"blue","renault");
       Vehicle vehicle2 = new Vehicle (2,"green","toyota");
       Vehicle vehicle3 = new Vehicle (3,"white","chevrolet");
       Vehicle vehicle4 = new Vehicle (4,"red","jeep");
       Vehicle vehicle5 = new Vehicle (5,"black","ferrari");
       
       listVehicles.add(vehicle1);
       listVehicles.add(vehicle2);
       listVehicles.add(vehicle3);
       listVehicles.add(vehicle4);
       listVehicles.add(vehicle5);
       
        String json1 = gson.toJson(listVehicles);
        System.out.println(json1);
       
       }
}
