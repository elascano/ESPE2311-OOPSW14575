package ec.edu.espe.dino.model;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class Dino {

    private int id;
    private String name;
    private String color;
    private int age;

    @Override
    public String toString() {
        return "Dino{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + '}';
    }

    public Dino(int id, String name, String color, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
