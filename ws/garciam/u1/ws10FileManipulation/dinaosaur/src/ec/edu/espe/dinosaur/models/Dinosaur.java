package ec.edu.espe.dinosaur.models;

/**
 *
 * @author mateo
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

    public  void prettieDinosaurPrint() {
        System.out.println("--------------------------------\n" + "id " + id + "\n diet: " + diet + "\n weight: " + weight + "\n where: " + where + "\n--------------------------------");
    }

    public Dinosaur(int id, String diet, int weight, String where) {
        this.id = id;
        this.diet = diet;
        this.weight = weight;
        this.where = where;
    }
}
