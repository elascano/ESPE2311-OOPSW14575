package ec.edu.espe.dinosaursys.model;

public class Dinosaur {
    private int id;
    private long deathYear;
    private String phylum;
    private String species;

    public Dinosaur(int id, long deathYear, String phylum, String species) {
        this.id = id;
        this.deathYear = deathYear;
        this.phylum = phylum;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(long deathYear) {
        this.deathYear = deathYear;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Dinosaur [id=" + id + ", deathYear=" + deathYear + ", phylum=" + phylum + ", species=" + species + "]";
    }
}
