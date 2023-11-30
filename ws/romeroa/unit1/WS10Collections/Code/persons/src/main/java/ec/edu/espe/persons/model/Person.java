package ec.edu.espe.persons.model;

import java.util.Date;

public class Person {
    @Override
    public String toString() {
        return "Person [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", birthDate=" + birthDate
                + "]";
    }

    private int id;
    private String firstname;
    private String lastName;
    private Date birthDate;

    public Person(int id, String firstname, String lastName, Date birthDate) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
