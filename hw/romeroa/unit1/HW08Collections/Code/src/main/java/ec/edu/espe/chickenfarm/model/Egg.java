package ec.edu.espe.chickenfarm.model;

public class Egg {
    @Override // Annotation
    public String toString() {
        return "Egg [id=" + id + "]";
    }

    public Egg(int id) {
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
