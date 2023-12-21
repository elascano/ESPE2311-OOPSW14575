package ec.edu.systemprofessor.model;

/**
 *
 * @author Antonio Revilla
 */

public class Professor {
    private int id;
    private String name;
    private int age;

    public Professor(int id, String name, int age, String departament) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Professor --> {" + " Id = " + getId() + ", Name = " + getName() + ", Age = " + getAge() + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
