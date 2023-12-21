
package ec.espe.edu.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import ec.espe.edu.model.Traffic;

/**
 *
 * @author Ilhan
 */
public class Exam {

    private static ArrayList<Traffic> thisTraffic = new ArrayList<>();

    public static void main(String[] args) {
        MainMenu();
    }

    public static void MainMenu() {
        Scanner input = new Scanner(System.in);

        int option;
        int i = 0;
        while (true) {
            System.out.println("What do you want to do? ");
            System.out.println("1. Create a new traffic object");
            System.out.println("2. Delete objects");
            System.out.println("3. Make a .json and Close");

            option = input.nextInt();
            switch (option) {
                case 1: {
                    addTraffic();
                    break;
                }
                case 2: {
                    deleteObjects(thisTraffic);
                    break;
                }

                case 3: {
                    SaveToJson("Traffic.json", thisTraffic);
                    System.out.println("Goodbye :-D");
                    System.exit(0);
                    break;
                }
            }
        }
    }

   public static void addTraffic() {
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("Do you want to add a new traffic object? (Yes/No)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Yes")) {
            System.out.println("Where's the traffic? Enter its location");
            String place = scanner.nextLine();
            System.out.println("Enter how many cars there are: ");
            int numberOfCars = scanner.nextInt();
            System.out.println("Are you there right now? ");
            boolean youThere = scanner.nextBoolean();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            Traffic traffic = new Traffic(place, numberOfCars, youThere);
            thisTraffic.add(traffic);

            if (thisTraffic.size() >= 3) {
                System.out.println("You've reached the limit of 3 traffic objects.");
                break;
            }
        } else if (response.equalsIgnoreCase("No")) {
            break;
        } else {
            System.out.println("Invalid input. Please enter Yes or No.");
        }
    } while (true);
}

    public static void deleteObjects(ArrayList<Traffic> thisTraffic) {

        for (Traffic traffic : thisTraffic) {
            thisTraffic.remove(traffic);
            System.out.println("Object deleted successfully.");
            return;
        }
    }

    public static void SaveToJson(String Filename, ArrayList<Traffic> thisTraffic) {
        try (FileWriter writer = new FileWriter(Filename)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(thisTraffic, writer);
        } catch (Exception e) {
        }
    }
}

