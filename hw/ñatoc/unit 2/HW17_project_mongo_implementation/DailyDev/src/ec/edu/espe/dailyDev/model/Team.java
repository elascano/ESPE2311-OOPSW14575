package ec.edu.espe.dailyDev.model;

import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dailyDev.utils.FileHandler;
import ec.edu.espe.dailyDev.utils.MenuUtils;
import java.util.ArrayList;

/**
 *
 * @author Team Number: 4 - CodingNinjas
 */
public class Team {

    private User[] users;
    private String name;

    public static ArrayList<Team> getTeamsFromFile() {
        return FileHandler.readFile("teams.json", new TypeToken<ArrayList<Team>>() {
        }.getType());
    }

    public Team(User[] users, String name) {
        this.users = users;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" + "users=" + users + ", name=" + name + '}';
    }

    /**
     * @return the users
     */
    public User[] getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(User[] users) {
        this.users = users;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
