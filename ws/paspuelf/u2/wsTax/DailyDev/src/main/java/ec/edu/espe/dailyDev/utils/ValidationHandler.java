package ec.edu.espe.dailyDev.utils;

import ec.edu.espe.dailyDev.model.Administrator;
import static ec.edu.espe.dailyDev.model.Administrator.getAdminsFromFile;
import static ec.edu.espe.dailyDev.model.Developer.getDevsFromFile;
import ec.edu.espe.dailyDev.model.Organization;
import ec.edu.espe.dailyDev.model.User;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class ValidationHandler {

    public static boolean isUsernameUnique(String username, String userType) {
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
//        ArrayList<? extends User> users = userType.equals("dev") ? getAdminsFromFile() : getDevsFromFile();
        for (Organization org : orgs) {
            if (org.getOrganizationCode().equals(orgCode)) {
                return true;
            }
        }
        return false;
    }
}
