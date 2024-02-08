package ec.edu.espe.sportsExam.model;

/**
 *
 * @author Stefany Díaz
 */
public class Sport {
    private int id;
    private String name;
    private int players;

    @Override
    public String toString() {
        return "Sport{" + "id=" + id + ", name=" + name + ", players=" + players + '}';
    }

    public Sport(int id, String name, int players) {
        this.id = id;
        this.name = name;
        this.players = players;
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

    /**
     * @return the players
     */
    public int getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(int players) {
        this.players = players;
    }

}