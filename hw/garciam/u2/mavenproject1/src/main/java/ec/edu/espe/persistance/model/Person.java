
package ec.edu.espe.persistance.model;

/**
 *
 * @author mateo
 */
public class Person {
    private int id;
    private String fullname;
    private String address;
    private int age;

    public Person(int id, String fullname, String address, int age) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullname=" + fullname + ", address=" + address + ", age=" + age + '}';
    }
    
    
}
