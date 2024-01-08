
package ec.edu.espe.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Park;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
class ParkSystem {
    private List<Park> parks;

    public ParkSystem() {
        this.parks = new ArrayList<>();
    }

    public void addPark(Park park) {
        parks.add(park);
    }

    public void saveToJsonFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            Gson gson = new Gson();
            gson.toJson(parks, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromJsonFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            Gson gson = new Gson();
            Type parkListType = new TypeToken<List<Park>>(){}.getType();
            parks = gson.fromJson(reader, parkListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printParks() {
        for (Park park : parks) {
            System.out.println("ID: " + park.getId() + ", Name: " + park.getName() + ", Location: " + park.getLocation());
        }
    }

    public static void main(String[] args) {
        ParkSystem parkSystem = new ParkSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Park");
            System.out.println("2. Save to JSON file");
            System.out.println("3. Read from JSON file");
            System.out.println("4. Print Parks");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Park ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    System.out.print("Enter Park Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Park Location: ");
                    String location = scanner.nextLine();
                    Park newPark = new Park(id, name, location);
                    parkSystem.addPark(newPark);
                    break;
                case 2:
                    System.out.print("Enter file name to save: ");
                    String saveFileName = scanner.nextLine();
                    parkSystem.saveToJsonFile(saveFileName);
                    System.out.println("Data saved to " + saveFileName);
                    break;
                case 3:
                    System.out.print("Enter file name to read: ");
                    String readFileName = scanner.nextLine();
                    parkSystem.readFromJsonFile(readFileName);
                    System.out.println("Data read from " + readFileName);
                    break;
                case 4:
                    parkSystem.printParks();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
