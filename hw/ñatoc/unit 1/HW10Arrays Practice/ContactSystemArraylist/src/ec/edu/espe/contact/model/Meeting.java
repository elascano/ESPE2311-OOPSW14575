package ec.edu.espe.contact.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */

public class Meeting {
    private int id;
    private String title;
    private ArrayList<User> users;

    
    public Meeting(int id, String title, ArrayList<User> users) {
    this.id = id;
    this.title = title;
    this. users = users;
    }


    @Override
    public String toString() {
        String meeting; 
        meeting= "Meeting{" + 
                "id=" + getId() + 
                ", title=" + getTitle() +
                ", user= " + getUsers() +"}";
        
        return meeting;
    

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the users
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
}


