package ec.edu.espe.Q33.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Q33.model.Person;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class PersonSystem {

    public static void main(String[] args) {
        ArrayList<Person> allPerson = new ArrayList<>();
        runMenu(allPerson);

    }

    private static void runMenu(ArrayList<Person> allPerson) {

        Scanner scanner = new Scanner(System.in);
        boolean exitMenu = false;

        while (!exitMenu) {
            displayMenu();
            System.out.println("Enter a option:");
            int menuOption = scanner.nextInt();
            scanner.nextLine();

            switch (menuOption) {

                case 1 ->
                    createPerson(allPerson);
                case 2 -> {
                    for (Person num : allPerson) {
                        System.out.println(num);
                    }
                }
                case 3 ->
                    savePersonToJSON(allPerson);
                case 4 ->
                    System.out.println("Total registered persons: " + allPerson.size());
                case 5 ->
                    exitMenu = true;
                default ->
                    System.out.println("Invalid option");

            }
        }
    }

    private static void displayMenu() {
        System.out.println("1. Create a person:");
        System.out.println("2. Display persons:");
        System.out.println("3. Save to JSON:");
        System.out.println("4. Count persons:");
        System.out.println("5. Exit:");
    }

    private static void createPerson(ArrayList<Person> allPerson) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbre of person to create");
        int numberPersons = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberPersons; i++) {
            System.out.println("Enter Id");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Name");
            String name = scanner.nextLine();
            System.out.println("Enter country");
            String country = scanner.nextLine();
            Person person = new Person(id, name, country);
            allPerson.add(person);
        }

    }

    private static void savePersonToJSON(ArrayList<Person> personNumber) {
        try (FileWriter writer = new FileWriter("Peron.json", true)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(personNumber);
            if (json.length() == 0) {
                writer.write("\n");
            }
            writer.write(json);

            System.out.println("Persons data saved to JSON file: " + "Peron.json");

        } catch (IOException e) {
            System.err.println("Error writing to JSON file: " + e.getMessage());
        }
    }

}
