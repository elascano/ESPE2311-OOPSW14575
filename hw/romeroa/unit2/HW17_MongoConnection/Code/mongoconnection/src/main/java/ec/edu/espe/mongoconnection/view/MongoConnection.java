package ec.edu.espe.mongoconnection.view;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import ec.edu.espe.mongoconnection.model.ConsularOffice;
import ec.edu.espe.mongoconnection.util.ConsoleMenu;
import ec.edu.espe.mongoconnection.util.ConsoleUtil;
import ec.edu.espe.mongoconnection.util.UserInput;

/**
 * @author Andrés Romero - DCCO
 */
public class MongoConnection {
    public static final String CONNECTION_URI = "mongodb+srv://aromero:@cluster0.o1jadvf.mongodb.net/";
    public static MongoClient mongoClient = null;
    public static MongoDatabase db;

    private static final CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
    private static final CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));

    public static void main(String[] args) {
        connectToDatabase();
        displayMainMenu();
    }

    private static void displayMainMenu() {
        final List<String> menuOptions = Arrays.asList(
            "Read all data",
            "Create a consular office",
            "Update a consular office",
            "Delete a consular office",
            "Exit"
        );
        final ConsoleMenu menu = new ConsoleMenu("Main Menu", menuOptions);

        while (true) {
            System.out.println("--- DPEX Mongo Connection System ---");
            menu.displayMenu();
            final int choice = menu.getUserChoice();
            ConsoleUtil.clearConsole();
            switch (choice) {
                case 1:
                    readAllData();
                    break;
                case 2:
                    createOffice();
                    break;
                case 3:
                    updateOffice();
                    break;
                case 4:
                    deleteOffice();
                    break;
                case 5:
                    System.out.println("Thanks for using the DPEX Mongo Connection System");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t Invalid option. Please choose a valid option. \n");
            }
            ConsoleUtil.consolePause();
        }
    }

    private static void connectToDatabase() {
        System.out.println("Connecting to database...");
        MongoClient client = MongoClients.create(CONNECTION_URI);
        mongoClient = client;
        db = mongoClient.getDatabase("DPEXSystemDB").withCodecRegistry(pojoCodecRegistry);
        System.out.println("Connected to database successuflly....");
    }

    private static Document searchConsularOffice() {
        ConsoleUtil.clearConsole();
        final int queryId = UserInput.getInt("Please enter the ID of the office you want to look for:");
        MongoCollection<Document> collection = db.getCollection("ConsularOffice");
        Document foundDocument = collection.find(eq("id", queryId)).first();

        if (foundDocument == null) {
            System.out.println("Your search query did not match any office.");
            return null;
        }

        return foundDocument;
    }

    private static void readAllData() {
        ConsoleUtil.clearConsole();
        System.out.println("All consular offices: ");

        MongoCollection<ConsularOffice> collection = db.getCollection("ConsularOffice", ConsularOffice.class);
        MongoCursor<ConsularOffice> foundOfficesCursor = collection.find().iterator();

        try {
            while(foundOfficesCursor.hasNext()) {
                System.out.println("- " + foundOfficesCursor.next().toString());
            }
        } finally {
            foundOfficesCursor.close();
        }
    }


    private static void createOffice() {
        ConsoleUtil.clearConsole();
        System.out.println("New consular office");
        final int id = UserInput.getInt("- Enter the office ID: ");
        final String country = UserInput.getString("- Enter the country: ");
        final String name = UserInput.getString("- Enter the name: ");
        final String address = UserInput.getString("- Enter the address: ");

        MongoCollection<ConsularOffice> collection = db.getCollection("ConsularOffice", ConsularOffice.class);
        ConsularOffice office = new ConsularOffice(id, name, address, country);
        collection.insertOne(office);

        System.out.println("Office created successfully :)");
    }


    private static void updateOffice() {

    }


    private static void deleteOffice() {

    }


}
