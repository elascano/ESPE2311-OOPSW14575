package ec.edu.espe.examoop.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_558
 */
public class Coop {
    ArrayList<Vehicle> listVehicles = new ArrayList<>();
    
   public void addNewVehicle() {
        Vehicle addedPlate = registerNewVehicle();
        listVehicles.add(addedPlate);
        System.out.println("Vehicle successfully added to the Tallarines category");
    }
   
   public Vehicle registerNewVehicle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enterd the ID of vehicle:");
        int id = scanner.nextInt();
        System.out.println("Entered the vehicle color: ");
        String color = scanner.nextLine();
        System.out.println("Entered the brand :");
        String brand = scanner.nextLine();
       Vehicle addedVehicle = new Vehicle(id,color,brand);

        return addedVehicle;
    }
    
}
