package ec.edu.espe.dailyDev.utils;

import com.mongodb.client.model.Filters;
import org.bson.conversions.Bson;

/**
 *
 * @author Olivier Paspuel
 */
public class FiltersHandler {

    public Bson createFilterForLogin(String username, String password) {
        // Create a filter to match documents with the given username and encryptedPassword
        Bson filter = Filters.and(
                Filters.eq("username", username),
                Filters.eq("encryptedPassword", PasswordHandler.encryptPassword(password))
        );

        return filter;
    }
    public static Bson createFilterTasksById(String id){
        return Filters.and(
                Filters.eq("userId", id));
    }
}
