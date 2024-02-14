package ec.edu.espe.dailyDev.model;

import static ec.edu.espe.dailyDev.model.User.currentUser;
import ec.edu.espe.dailyDev.utils.FileHandler;
import ec.edu.espe.dailyDev.utils.PasswordHandler;
import static ec.edu.espe.dailyDev.utils.ValidationHandler.isUsernameUnique;
import ec.edu.espe.dailyDev.view.LandingPage;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Administrator extends User {

    private final String role = "admin";
    private final UUID organizationCode;

    public Administrator(String username, String password, UUID orgCode) {
        super(username, password);
        this.organizationCode = orgCode;

    }

    @Override
    public String toString() {
        return "Admin{" + "role=" + role + ", organizationCode=" + organizationCode + '}';
    }

    public static ArrayList<Administrator> getAdminsFromFile() {

        return User.getUsersFromFile("admin");
    }

    public static Administrator registerAdmin(String username, String password) throws Exception {
        ArrayList<Administrator> admins = getAdminsFromFile();

        if (!isUsernameUnique(username, "admin")) {
            System.out.println("Username already exists. Please choose a different one.");
            LandingPage.showLandingPage();
            return null;
        }

        // TODO validate organizationName is unique;
        Organization org = Organization.createOrganization();

        Administrator newAdmin = new Administrator(username, password, org.getOrganizationCode());

        admins.add(newAdmin);

        FileHandler.writeFile("./db/admins.json", admins);
        return newAdmin;
    }

    public static User loginAdmin(String username, String password) throws InvalidCredentialsException {
        ArrayList<Administrator> admins = getAdminsFromFile();
        for (Administrator admin : admins) {
            if (admin.getUsername().equals(username) && admin.getEncryptedPassword().equals(PasswordHandler.encryptPassword(password))) {
                currentUser = admin;
                return admin;
            }
        }
        throw new InvalidCredentialsException("Invalid credentials for username: " + username);
    }

    public UUID getOrganizationCode() {
        return organizationCode;
    }

}
