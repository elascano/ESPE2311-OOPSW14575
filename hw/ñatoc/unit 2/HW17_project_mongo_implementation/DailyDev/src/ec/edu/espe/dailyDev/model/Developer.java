package ec.edu.espe.dailyDev.model;

import ec.edu.espe.dailyDev.utils.FileHandler;
import ec.edu.espe.dailyDev.utils.PasswordHandler;
import static ec.edu.espe.dailyDev.utils.ValidationHandler.isUsernameUnique;
import static ec.edu.espe.dailyDev.utils.ValidationHandler.orgCodeExists;
import ec.edu.espe.dailyDev.view.LandingPage;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */
public class Developer extends User {

    public static User login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private final String role = "developer";
    private final UUID organizationCode;

    public Developer(String username, String password, UUID organizationCode) {
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
        ArrayList<Developer> devs = getDevsFromFile();

        if (!isUsernameUnique(username, "dev")) {
            System.out.println("Username already exists. Please choose a different one.");
            LandingPage.showLandingPage();
            return null;
        }

        if (!orgCodeExists(orgCode)) {
            System.out.println("Organization doesn't exist.");
            LandingPage.showLandingPage();
            return null;

        }

        Developer newDeveloper = new Developer(username, password, orgCode);

        devs.add(newDeveloper);

        FileHandler.writeFile("./db/devs.json", devs);
        return newDeveloper;
    }

    public static User loginDev(String username, String password) throws InvalidCredentialsException {
        ArrayList<Developer> devs = getDevsFromFile();
        for (Developer dev : devs) {
            if (dev.getUsername().equals(username) && dev.getEncryptedPassword().equals(PasswordHandler.encryptPassword(password))) {
                currentUser = dev;
                return dev;
            }
        }
        throw new InvalidCredentialsException("Invalid credentials for username: " + username);
    }

    public UUID getOrganizationCode() {
        return organizationCode;
    }

}
