package ec.edu.espe.trucks.view;

import com.google.gson.Gson;
import ec.edu.espe.trucks.model.Truck;
import ec.edu.espe.trucks.util.HandleInput;
import ec.edu.espe.trucks.util.JsonHandler;
import java.io.IOException;

/**
 *
 * @author DCCO - ESPE MATEO ROGERON
 */
public class Trucks {

    private static final String TRUCKS_FILE = "./countries.json";

    public static void main(String[] args) throws IOException {
        int options;
        Truck truck = null;

        System.out.println("Main menu");
        System.out.println("Please put the option");
        System.out.println("1. Register Truck");
        System.out.println("2. Delete truck");
        System.out.println("3. Exit");

        options = HandleInput.insertInteger();

        switch (options) {
            case 1:
                Gson gson = new Gson();

                int id;
                String modelTruck;
                int wheelsNumber;

                System.out.println("Insert the id");
                truck.getId();
                System.out.println("Insert the model");
                truck.getModelTruck();
                System.out.println("");
                truck.getWheelsNumber();

                JsonHandler.writeToJson(TRUCKS_FILE, gson);

                return;
            case 2:
               
            case 3:
                break;

        }
    }

    private static void registerTruck(Truck truck) throws IOException {

    }

 
}
