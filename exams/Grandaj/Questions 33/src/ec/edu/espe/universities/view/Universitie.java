package ec.edu.espe.universities.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.universities.model.Universities;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Granda
 */
public class Universitie {

    public static void main(String[] args) throws IOException {
        ArrayList<Universities> universities = new ArrayList<>();

        new Universitie().menuUniversities(universities);
    }

    public void menuUniversities(ArrayList<Universities> universities) throws IOException {
        int option;
        Scanner enter = new Scanner(System.in);

        do {
            System.out.println("WELCOME");
            System.out.println("Enter the option");
            System.out.println("1.Enter universitie");
            System.out.println("2.Delete universities");
            System.out.println("3.Exist");
            option = enter.nextInt();
            switch (option) {
                case 1:
                    universities.add(Universitie.addUniversities(universities));
                    saveUniversitiesToJson(universities);
                    break;
                case 2:
                    deleteUniversity(universities);

                    break;
            }
        } while (option != 3);
    }

    public static Universities addUniversities(ArrayList<Universities> universities) {
        int id;
        String name;
        String location;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = enter.nextInt();
        System.out.println("Enter the name: ");
        name = enter.next();
        System.out.println("Enter the location: ");
        location = enter.next();
        return new Universities(id, name, location);
    }

    public static void saveUniversitiesToJson(ArrayList<Universities> universities) {
        try (FileWriter writer = new FileWriter("universities.json", true)) {
            File file = new File("universities.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(universities);
            if (file.length() == 0) {
                writer.write("\n");
            }
            writer.write(json);

            System.out.println("Persons data saved to JSON ");

        } catch (IOException e) {
            System.err.println("Error writing to JSON file: " + e.getMessage());
        }
    }

    public static void deleteUniversity(ArrayList<Universities> universities) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the ID of the university to delete: ");
        int idToDelete = enter.nextInt();

        universities.removeIf(university -> university.getId() == idToDelete);

        System.out.println("University deleted successfully.");
    }
}
