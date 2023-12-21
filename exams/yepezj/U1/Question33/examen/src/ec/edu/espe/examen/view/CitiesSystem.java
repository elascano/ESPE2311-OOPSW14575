package ec.edu.espe.examen.view;

import ec.edu.espe.examen.model.City;
import ec.edu.espe.examen.model.Utility;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class CitiesSystem {

    public static void main(String[] args) {
        Utility utility = new Utility();
        ArrayList<City> cities = utility.readFileJson("cities.json");
        menu(cities);
                
    }

    public static void menu(ArrayList<City> cities) {
        Utility utility = new Utility();
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
        System.out.println("----- Cities Menu -----");
        System.out.println("1.- Create new city and save");
        System.out.println("2.- Display size of the cities from the JSON file:  ");
        System.out.println("3.- Exit");
        System.out.print("Select an option (1-3): ");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    cities.add(City.createCity());
                    utility.writeFileJson("cities.json", cities);
                }
                break;
            case 2:
                int size = cities.size();
                System.out.println("Count The total number of objects stored: " + size);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
            }
        }while(option != 3);
    }
}


