package ec.edu.espe.dailyDev.model;

import com.google.gson.Gson;
import ec.edu.espe.dailyDev.utils.FiltersHandler;
import ec.edu.espe.dailyDev.utils.MongoDBHandler;
import ec.edu.espe.dailyDev.view.LandingPage;
import java.util.ArrayList;
import java.util.UUID;
import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.conversions.Bson;

/**
 *
 * @author Team Number: 4 - CodingNinjas
 */
public class Developer extends User {

    public static User login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final static MongoDBHandler mdbHandler = new MongoDBHandler();
    private final String role = "developer";
    @BsonProperty("organizationCode")
    private final String organizationCode;

    public Developer(String username, String password, String organizationCode) {
        super(username, password);
        this.organizationCode = organizationCode;

    }

    @Override
    public String toString() {
        return "Developer{" + "role=" + role + ", organizationCode=" + organizationCode + '}';
    }

    public static ArrayList<Developer> getDevsFromFile() {

        return User.getUsersFromFile("dev");
    }

    public static Developer registerDev(String username, String password, UUID orgCode) throws Exception {

        if (mdbHandler.findOneDoc("username", username, "Devs") != null) {
            System.out.println("Username already exists. Please choose a different one.");
            LandingPage.showLandingPage();
            return null;
        }

        if (mdbHandler.findOneDoc("organizationCode", orgCode.toString(), "Organizations") == null) {
            System.out.println("Organization doesn't exist.");
            LandingPage.showLandingPage();
            return null;

        }

        Developer newDeveloper = new Developer(username, password, orgCode.toString());

        Document developerDoc = Document.parse(new Gson().toJson(newDeveloper));
        mdbHandler.createDocument("Devs", developerDoc);
        return newDeveloper;
    }

    public static User loginDev(String username, String password) throws User.InvalidCredentialsException {
        Bson filter = new FiltersHandler().createFilterForLogin(username, password);
        System.out.println(filter);
        Document user = mdbHandler.findDocWithFilter(filter, "Devs");
        if (user == null) {
            throw new User.InvalidCredentialsException("Invalid credentials for username: " + username);

        }

        Gson gson = new Gson();

        String userS = gson.toJson(user);
        return gson.fromJson(userS, User.class);
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

}
