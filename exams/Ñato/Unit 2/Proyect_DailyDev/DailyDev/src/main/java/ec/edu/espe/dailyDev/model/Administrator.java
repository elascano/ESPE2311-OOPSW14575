package ec.edu.espe.dailyDev.model;

import com.google.gson.Gson;
import static ec.edu.espe.dailyDev.model.User.currentUser;
import ec.edu.espe.dailyDev.utils.PasswordHandler;
import static ec.edu.espe.dailyDev.utils.ValidationHandler.isUsernameUniqueInDatabase;
import ec.edu.espe.dailyDev.view.LandingPage;
import java.util.ArrayList;
import java.util.UUID;
import ec.edu.espe.dailyDev.utils.MongoDBHandler;
import ec.edu.espe.dailyDev.utils.ValidationHandler;
import org.bson.Document;

/**
 *
 * @author Team Number: 4 - CodingNinjas
 */
public class Administrator extends User {

    private final String role = "admin";
    private final UUID organizationCode;
    private static String nameCollection;

    public Administrator(String username, String password, UUID orgCode) {
        super(username, password);
        this.organizationCode = orgCode;
    }

    @Override
    public String toString() {
        return "Admin{" + "role=" + getRole() + ", organizationCode=" + getOrganizationCode() + '}';
    }

    public static ArrayList<Administrator> getAdminsFromFile() {

        return User.getUsersFromFile("admin");
    }

    public static Administrator registerAdmin(String username, String password) {
        String collectionName = "Admin";

        try {
            if (!ValidationHandler.isUsernameUniqueInDatabase(username, collectionName)) {
                System.out.println("Username already exists. Please choose a different one.");
                LandingPage.showLandingPage();
                return null;
            }

            Organization org = Organization.createOrganization();

            Administrator newAdmin = new Administrator(username, password, org.getOrganizationCode());

            MongoDBHandler mdbHandler = new MongoDBHandler();

            UUID userId = UUID.randomUUID();

            Document adminDocument = new Document("id", userId.toString())
                    .append("username", newAdmin.getUsername())
                    .append("password", newAdmin.getEncryptedPassword())
                    .append("organizationCode", newAdmin.getOrganizationCode().toString())
                    .append("role", newAdmin.getRole());

            mdbHandler.createDocument(collectionName, adminDocument);

            return newAdmin;
        } catch (Exception e) {
            System.err.println("Error registering administrator: " + e.getMessage());
            return null;
        }
    }

    public static User loginAdmin(String username, String password) throws InvalidCredentialsException {
        try {
            MongoDBHandler mdbHandler = new MongoDBHandler();
            if (mdbHandler.checkCredentials(username, password, "Admin")) {
                Administrator admin = new Administrator(username, password, null); // Puedes modificar según sea necesario
                currentUser = admin;
                return admin;
            }
        } catch (Exception e) {
            System.err.println("Error during admin login: " + e.getMessage());
        }

        throw new InvalidCredentialsException("Invalid credentials for username: " + username);
    }

    public UUID getOrganizationCode() {
        return organizationCode;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @return the nameCollection
     */
    public static String getNameCollection() {
        return nameCollection;
    }

    /**
     * @param aNameCollection the nameCollection to set
     */
    public static void setNameCollection(String aNameCollection) {
        nameCollection = aNameCollection;
    }

}
