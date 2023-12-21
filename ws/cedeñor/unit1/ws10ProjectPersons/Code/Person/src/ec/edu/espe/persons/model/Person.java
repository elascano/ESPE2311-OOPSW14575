package ec.edu.espe.persons.model;

import java.util.Date;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class Person {

    private int id;

    public Person(int id, String firstName, String lastName, Date BirthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.BirthDate = BirthDate;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", BirthDate=" + BirthDate + '}';
    }
    private String firstName;
    private String lastName;
    private Date BirthDate;

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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
     * @return the BirthDate
     */
    public Date getBirthDate() {
        return BirthDate;
    }

    /**
     * @param BirthDate the BirthDate to set
     */
    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }
}
