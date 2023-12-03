package ec.edu.espe.dinosaurs.model;

/**
 *
 * @author Luis Sagnay
 */
public class Dinosaur {
    private int id;
    private String Name;
    private String Color;
    private String species;

    @Override
    public String toString() {
        return "Dinosaur{" + "id=" + getId() + ", Name=" + getName() + ", Color=" + getColor() + ", species=" + getSpecies() + '}';
    }

    public Dinosaur(int id, String Name, String Color, String species) {
        this.id = id;
        this.Name = Name;
        this.Color = Color;
        this.species = species;
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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }
    
    
}