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

    public static void create() {
        System.out.println("Creating a new team...");
        // Lógica para crear un equipo
        System.out.println("Team created!");
    }

    public static void show() {
        System.out.println("Showing teams...");
        // Lógica para mostrar equipos
        System.out.println("No teams found.");  // Ajusta según tu lógica real
        MenuUtils.backToMainMenu();
    }

    public static void update() {
        System.out.println("Updating a team...");
        // Lógica para la actualización de equipos
        System.out.println("Team updated!");
        MenuUtils.backToMainMenu();
    }

    public static void complete() {
        System.out.println("Completing a team...");
        // Lógica para completar equipos
        System.out.println("Team completed!");
        MenuUtils.backToMainMenu();
    }

    public static void delete() {
        System.out.println("Deleting a team...");
        // Lógica para eliminar equipos
        System.out.println("Team deleted!");
        MenuUtils.backToMainMenu();
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


