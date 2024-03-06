
package ec.espe.edu.ZOO1.model;
import ec.espe.edu.ZOOM1.model.Animal;
/**
 *
 * @author Sebastian Criollo
 */
import java.util.Date;

public class Mammal extends Animal {
    private String gender;

    public Mammal(int id, String scientificName, Date bornDate, int cageId, String name, int age, String gender) {
        super(id, scientificName, bornDate, cageId, name, age);
        this.gender = gender;
    }

    public void eat() {
        System.out.println(getName() + " está comiendo");
    }

    public void sleep() {
        System.out.println(getName() + " está durmiendo");
    }

    @Override
    public void breed() {
        System.out.println(getName() + " está reproduciéndose");
    }

    @Override
    public void getOlder() {
        super.getOlder(); // Llama al método de la clase base (Animal) para envejecer
        System.out.println(getName() + " ha envejecido un año como mamífero");
    }

    // Getters y setters para el atributo específico de Mammal

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;   
    }
}
