package espe.edu.ec.model;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Dinosaur {
    int id;
    String name;
    String age;
    String size;

    @Override
    public String toString() {
        return "Dinosaur{" + "id=" + id + ", name=" + name + ", age=" + age + ", size=" + size + '}';
    }

    public Dinosaur(int id, String name, String age, String size) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    
}