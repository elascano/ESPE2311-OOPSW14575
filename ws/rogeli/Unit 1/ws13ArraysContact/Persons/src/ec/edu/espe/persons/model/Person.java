package ec.edu.espe.persons.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Person {
    private int id;
    private String firstName;
    private int phoneNumber;
    private Date birthDate;

    @Override
    public String toString() {
        return "Person{" + "id=" + getId() + ", firstName=" + getFirstName() + ", phonenumber=" + getphoneNumber() + ", birthDate=" + getBirthDate() + '}';
    }
    
    public Person(int id, String firstName, String lastName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(int getphoneNumber) {
        this.phoneNumber = getphoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}