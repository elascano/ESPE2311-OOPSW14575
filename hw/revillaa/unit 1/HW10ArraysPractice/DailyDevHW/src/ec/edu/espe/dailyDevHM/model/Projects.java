package ec.edu.espe.dailyDevHM.model;

/**
 *
 * @author Antonio Revilla
 */
public class Projects {
    private int id;
    private int numberOfParticipants;
    private String name;

    public Projects(int id, int numberOfParticipants, String name) {
        this.id = id;
        this.numberOfParticipants = numberOfParticipants;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Projects{" + "id=" + id + ", numberOfParticipants=" + numberOfParticipants + ", name=" + name + '}';
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
     * @return the numberOfParticipants
     */
    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    /**
     * @param numberOfParticipants the numberOfParticipants to set
     */
    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
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
