package ec.edu.espe.dailyDev.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import static ec.edu.espe.dailyDev.model.Administrator.loginAdmin;
import static ec.edu.espe.dailyDev.model.Developer.loginDev;
import ec.edu.espe.dailyDev.utils.FileHandler;
import ec.edu.espe.dailyDev.utils.PasswordHandler;
import ec.edu.espe.dailyDev.view.Dashboard;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Team Number: 4 - CodingNinjas
 */
public class User {

    private final UUID id;
    @Expose
    @SerializedName("username")
    private String username;
    private final String encryptedPassword;
    private ArrayList<Task> assignedTasks;
    static User currentUser;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", encryptedPassword=" + encryptedPassword + ", assignedTasks=" + assignedTasks + '}';
    }

    public User(String username, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.encryptedPassword = PasswordHandler.encryptPassword(password);
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static UUID getCurrentUserId() {
        if (currentUser != null) {
            return currentUser.getId();
        }
        return null;
    }

    public static <T> ArrayList<T> getUsersFromFile(String userType) {

        String fileAddress = userType.equals("dev") ? "./db/devs.json" : "./db/admins.json";

        Type token = userType.equals("dev")
                ? new TypeToken<ArrayList<Developer>>() {
                }.getType()
                : new TypeToken<ArrayList<Administrator>>() {
                }.getType();

        return FileHandler.readFile(fileAddress, token);
    }

    public static User login(String username, String password, String userType) throws InvalidCredentialsException {
        if (userType.equals("dev")) {
//            System.out.println(loginDev(username, password));
            setCurrenUser(loginDev(username, password));
            Dashboard dboard = new Dashboard();
            dboard.setVisible(true);
            return loginDev(username, password);
        }
        return loginAdmin(username, password);
    }

    public static class InvalidCredentialsException extends Exception {

        public InvalidCredentialsException(String message) {
            super(message);
        }
    }

    public static void logout() {
        currentUser = null;
    }
    public static void setCurrenUser(User user){
        currentUser = user;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public ArrayList<Task> getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTasks(ArrayList<Task> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }
}
