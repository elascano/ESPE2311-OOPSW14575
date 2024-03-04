
package ec.edu.espe.FornitureSystem.model;
import java.util.Objects;

public class Forniture {
     private String name;
    private int id; 
    private double weight;

    public Forniture(String nombre, int cantidad) {
        this.name = nombre;
        this.id = cantidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aumenta(int incremento) {
        this.setId(this.getId() + incremento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Forniture suministro = (Forniture) o;
        return getId() == suministro.getId() &&
                Objects.equals(getName(), suministro.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + getName() + '\'' +
                ", weight=" + getId() +
                '}';
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}