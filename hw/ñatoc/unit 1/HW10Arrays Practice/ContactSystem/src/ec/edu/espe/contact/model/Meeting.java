/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
//Poner algo Meeting a usuarios
package ec.edu.espe.contact.model;

public class Meeting {

    private int id;
    private String title;
    private User[] user;

    public Meeting(int id, String title, User[] user) {
        this.id = id;
        this.title = title;
        this.user = user;
    }

    @Override
    public String toString() {
        String meeting;
        meeting = "Meeting{"
                + "id=" + id
                + ", title=" + title;

        for (User user : user) {

            meeting = meeting + user;
        }
        meeting = meeting + '}';
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
     * @return the user
     */
    public User[] getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User[] user) {
        this.user = user;
    }

}
