
package ec.edu.espe.model;

/**
 *
 * @author Sebastian Criollo
 */
public class Furniture {
    String name;
    String id;
    String date;
    String description;

    @Override
    public String toString() {
        return "Furniture{" + "name=" + name + ", id=" + id + ", date=" + date + ", description=" + description + '}';
    }

    public Furniture(String name, String id, String date, String description) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
