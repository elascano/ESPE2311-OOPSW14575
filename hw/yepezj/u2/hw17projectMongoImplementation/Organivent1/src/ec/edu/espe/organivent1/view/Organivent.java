package ec.edu.espe.organivent1.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.organivent1.model.Employee;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.bson.Document;
import java.util.Scanner;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Organivent {

    private static final String FILE_PATH = "employees.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final List<Employee> users = loadUsersFromFile();

    private static final String DATABASE_URI = "mongodb+srv://Jefferson:Hola_135@cluster0.6gfeclg.mongodb.net/";
    private static final String DATABASE_NAME = "Organivent";
    private static final String COLLECTION_NAME = "Employee";

    private static final MongoClient mongoClient = new MongoClient(new MongoClientURI(DATABASE_URI));
    private static final MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
    private static final MongoCollection<Document> usersCollection = database.getCollection(COLLECTION_NAME);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("----- Employee -----");
            System.out.println("1.- Crete employee");
            System.out.println("2.- Read employee");
            System.out.println("3.- Update employee");
            System.out.println("4.- Delete employee");
            System.out.println("5.- Exit");
            System.out.println("Enter the option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    createEmployee();
                    break;
                case 2:
                    readEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }
        } while (option != 5);
    }

    private static void createEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        System.out.println("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter hourly wage: ");
        String hourlywage = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter user email: ");
        String email = scanner.nextLine();

        Document newUserDocument = new Document()
                .append("ID", id)
                .append("Name", name)
                .append("Hourly Wage", hourlywage)
                .append("Email", email);

        usersCollection.insertOne(newUserDocument);

        System.out.println("Employee create successfully.");
    }

    private static void readEmployee() {
        usersCollection.find().forEach((Consumer<Document>) document -> {
            Integer id = document.getInteger("ID");
            String name = document.getString("Name");
            String hourlywage = document.getString("Hourly Wage");
            String email = document.getString("Email");

            // Formatear la salida como una tabla
            String formattedOutput = String.format("| %-15s | %-30s | %-30s | %-20s |",
                    id, name, hourlywage, email);

            // Imprimir la fila de la tabla
            System.out.println(formattedOutput);

            // Imprimir una línea separadora
            System.out.println(StringUtils.repeat("-", 130));
        });
    }

    private static void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user ID to delete: ");
        int userIdToDelete = scanner.nextInt();

        usersCollection.deleteOne(new Document("ID", userIdToDelete));
        System.out.println("User deleted successfully.");
    }

    private static void updateEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user ID to update: ");
        int userIdToUpdate = scanner.nextInt();

        Document userToUpdate = usersCollection.find(new Document("ID", userIdToUpdate)).first();

        if (userToUpdate != null) {
            // Perform the update, you can modify the user properties here
            System.out.println("Enter updated user name: ");
            scanner.nextLine();
            userToUpdate.put("Name", scanner.nextLine());

            System.out.println("Enter updated hourly wage: ");
            userToUpdate.put("Hourly Wage", scanner.nextLine());
           

            System.out.println("Enter updated user email: ");
            userToUpdate.put("Email", scanner.nextLine());

            // ... (similarly for other properties)
            usersCollection.replaceOne(new Document("ID", userIdToUpdate), userToUpdate);
            System.out.println("User updated successfully.");
        } else {
            System.out.println("User not found with ID: " + userIdToUpdate);
        }
    }

    private static List<Employee> loadUsersFromFile() {
        try (Reader reader = new FileReader(FILE_PATH)) {
            return gson.fromJson(reader, new TypeToken<List<Employee>>() {
            }.getType());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private static void saveUsersToFile() {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
