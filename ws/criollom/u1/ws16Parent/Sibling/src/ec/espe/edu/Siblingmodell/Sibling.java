
package ec.espe.edu.Siblingmodell;

/**
 *
 * @author MateoCriollo
 */
public class Sibling {
    private String name;
    private int age;
    private String lastName;
    private String address;

    public Sibling(String name, int age, String lastName, String address) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sibling{" + "name=" + getName() + ", age=" + getAge() + ", lastName=" + getLastName() + ", address=" + getAddress() + '}';
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
