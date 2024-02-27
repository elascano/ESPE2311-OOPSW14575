
package ec.espe.edu.ZOO1.model;



/**
 *
 * @author Sebastian Criollo
 */
import java.util.Date;

public class Jaguar extends Animal {
    private String color;
    private boolean stains;

    public Jaguar(int id, String scientificName, Date bornDate, int cageId, String name, int age, String gender, String color, boolean stains) {
        super(id, scientificName, bornDate, cageId, name, age, gender);
        this.color = color;
        this.stains = stains;
    }

    public void rugir() {
        System.out.println(getName() + " está rugiendo");
    }

    public void cazar() {
        System.out.println(getName() + " está cazando");
    }

    @Override
    public void comer() {
        System.out.println(getName() + " está cazando y comiendo");
    }

    // Getters y setters para los atributos específicos de Jaguar

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean tieneManchas() {
        return stains;
    }

    public void setStains(boolean stains) {
        this.stains = stains;
    }
}


