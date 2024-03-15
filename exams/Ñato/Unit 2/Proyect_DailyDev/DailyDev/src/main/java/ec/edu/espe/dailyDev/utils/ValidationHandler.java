package ec.edu.espe.dailyDev.utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.dailyDev.model.Administrator;
import static ec.edu.espe.dailyDev.model.Administrator.getAdminsFromFile;
import static ec.edu.espe.dailyDev.model.Developer.getDevsFromFile;
import ec.edu.espe.dailyDev.model.Organization;
import ec.edu.espe.dailyDev.model.User;
import java.util.ArrayList;
import java.util.UUID;
import org.bson.Document;

/**
 *
 * @author Team Number: 4 - CodingNinjas
 */
public class ValidationHandler {

    public static boolean isUsernameUniqueInMemory(String username, String userType) {
        ArrayList<? extends User> users = userType.equals("dev") ? getAdminsFromFile() : getDevsFromFile();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static boolean orgCodeExists(UUID orgCode) {
        ArrayList<Organization> orgs = Organization.getOrganizationsFromFile();
        for (Organization org : orgs) {
            if (org.getOrganizationCode().equals(orgCode)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUsernameUniqueInDatabase(String username, String collectionName) {
        MongoDBHandler mdbHandler = new MongoDBHandler();

        try {
            MongoDatabase database = (MongoDatabase) mdbHandler.connect();
            MongoCollection<Document> collection = database.getCollection(collectionName);

            Document query = new Document("username", username);

            return collection.countDocuments(query) == 0;
        } catch (Exception e) {
            System.err.println("Error checking username uniqueness in MongoDB: " + e.getMessage());
            return false;
        }
    }
}
