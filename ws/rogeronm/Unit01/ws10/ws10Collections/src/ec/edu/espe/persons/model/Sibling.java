package ec.edu.espe.persons.model;



/**
 *
 * @author mate-
 */
public class Sibling {
    private String name;
    private int age;
    private String hobby;
    private int phone;

    public Sibling(String name, int age, String hobby, int phone) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Sibling{" + "name=" + name + ", age=" + age + ", hobby=" + hobby + ", phone=" + phone + '}';
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

    /**
     * @return the hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby the hobby to set
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
