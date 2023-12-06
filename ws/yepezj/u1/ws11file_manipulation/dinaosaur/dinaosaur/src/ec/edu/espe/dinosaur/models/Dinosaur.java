package ec.edu.espe.dinosaur.models;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, ESPE - DCCO
 */
public class Dinosaur {

    private int id;
    private String diet;
    private int weight;
    private String where;

    @Override
    public String toString() {
        return "Dinosaur{" + "id=" + id + ", diet=" + diet + ", weight=" + weight + ", where=" + where + '}';
    }

    public Dinosaur(int id, String diet, int weight, String where) {
        this.id = id;
        this.diet = diet;
        this.weight = weight;
        this.where = where;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }
    
    
}
