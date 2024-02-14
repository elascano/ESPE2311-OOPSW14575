package ec.edu.espe.dailyDev.model;

import java.util.UUID;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Message {
    private UUID id;
    private String title;
    private String description;

    public Message(UUID id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", title=" + title + ", description=" + description + '}';
    }
        
    /**
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
