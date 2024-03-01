package ec.edu.espe.faru.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.faru.model.User;
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

/**
 *
 * @author David
 */
public class FoodAndRollSystemUsers {
    private static final String FILE_PATH = "users.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final List<User> users = loadUsersFromFile();
    
    private static final String DATABASE_URI = "mongodb+srv://davidcepeda13:david@cluster0.fvgdrtu.mongodb.net/";
    private static final String DATABASE_NAME = "FAR_DB";
    private static final String COLLECTION_NAME = "Users";
    
    private static final MongoClient mongoClient = new MongoClient(new MongoClientURI(DATABASE_URI));
    private static final MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
    private static final MongoCollection<Document> usersCollection = database.getCollection(COLLECTION_NAME);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            User.printUser();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    registerNewCustomer();
                    saveUsersToFile();
                    break;
                case 2:
                    viewAllUsers();
                    break;
                case 3:
                    deleteUserById();
                    saveUsersToFile();
                    break;
                case 4:
                    updateUserById();
                    saveUsersToFile();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void registerNewCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== We need some information about yourself, please provide us with correct and real data to proceed with the delivery ===");
        System.out.println("Enter user name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter user email: ");
        String email = scanner.nextLine();

        System.out.println("Enter user phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter user address: ");
        String address = scanner.nextLine();

        System.out.println(" == Information for Login ==");
        System.out.println("Enter user ID: ");
        String userId = scanner.nextLine();

        System.out.println("Enter user password: ");
        String password = scanner.nextLine();

        Document newUserDocument = new Document()
                .append("customerName", customerName)
                .append("email", email)
                .append("phoneNumber", phoneNumber)
                .append("address", address)
                .append("userId", userId)
                .append("password", password)
                .append("loginStatus", "active")
                .append("registerDate", new Date());

        usersCollection.insertOne(newUserDocument);

        System.out.println("User registered successfully.");
    }

 private static void viewAllUsers() {
    usersCollection.find().forEach((Consumer<Document>) document -> {
        String userId = document.getString("userId");
        String customerName = document.getString("customerName");
        String email = document.getString("email");
        String phoneNumber = document.getString("phoneNumber");
        String address = document.getString("address");
        String registerDate = document.getDate("registerDate").toString();

        // Formatear la salida como una tabla
        String formattedOutput = String.format("| %-15s | %-20s | %-30s | %-15s | %-30s | %-20s |",
                userId, customerName, email, phoneNumber, address, registerDate);

        // Imprimir la fila de la tabla
        System.out.println(formattedOutput);

        // Imprimir una línea separadora
        System.out.println(StringUtils.repeat("-", 130));
    });
}
    private static void deleteUserById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user ID to delete: ");
        String userIdToDelete = scanner.nextLine();

        usersCollection.deleteOne(new Document("userId", userIdToDelete));
        System.out.println("User deleted successfully.");
    }

   private static void updateUserById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user ID to update: ");
        String userIdToUpdate = scanner.nextLine();

        Document userToUpdate = usersCollection.find(new Document("userId", userIdToUpdate)).first();

        if (userToUpdate != null) {
            // Perform the update, you can modify the user properties here
            System.out.println("Enter updated user name: ");
            userToUpdate.put("customerName", scanner.nextLine());

            System.out.println("Enter updated user email: ");
            userToUpdate.put("email", scanner.nextLine());

            // ... (similarly for other properties)

            usersCollection.replaceOne(new Document("userId", userIdToUpdate), userToUpdate);
            System.out.println("User updated successfully.");
        } else {
            System.out.println("User not found with ID: " + userIdToUpdate);
        }
    }

    private static List<User> loadUsersFromFile() {
        try (Reader reader = new FileReader(FILE_PATH)) {
            return gson.fromJson(reader, new TypeToken<List<User>>() {}.getType());
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