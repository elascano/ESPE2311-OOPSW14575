
package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author JosuéG
 */
public class Contact {
    private int id;
    private String lastName;
    private String firstName;
    private String cellPhonenumber;
    private Contact contactThatIntroduce;
    private String type;
    private Date birthDate;
    private ArrayList<String> hobbies;
    private char gender;
    private String comments;
    private int yearOfFriendship;

    public Contact(int id, String lastName, String firstName, String cellPhonenumber, Contact contactThatIntroduce, String type, Date birthDate, ArrayList<String> hobbies, char gender, String comments, int yearOfFriendship) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cellPhonenumber = cellPhonenumber;
        this.contactThatIntroduce = contactThatIntroduce;
        this.type = type;
        this.birthDate = birthDate;
        this.hobbies = hobbies;
        this.gender = gender;
        this.comments = comments;
        this.yearOfFriendship = yearOfFriendship;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", cellPhonenumber=" + cellPhonenumber + ", contactThatIntroduce=" + contactThatIntroduce + ", type=" + type + ", birthDate=" + birthDate + ", hobbies=" + hobbies + ", gender=" + gender + ", comments=" + comments + ", yearOfFriendship=" + yearOfFriendship + '}';
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
     * @return the cellPhonenumber
     */
    public String getCellPhonenumber() {
        return cellPhonenumber;
    }

    /**
     * @param cellPhonenumber the cellPhonenumber to set
     */
    public void setCellPhonenumber(String cellPhonenumber) {
        this.cellPhonenumber = cellPhonenumber;
    }

    /**
     * @return the contactThatIntroduce
     */
    public Contact getContactThatIntroduce() {
        return contactThatIntroduce;
    }

    /**
     * @param contactThatIntroduce the contactThatIntroduce to set
     */
    public void setContactThatIntroduce(Contact contactThatIntroduce) {
        this.contactThatIntroduce = contactThatIntroduce;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the hobbies
     */
    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the yearOfFriendship
     */
    public int getYearOfFriendship() {
        return yearOfFriendship;
    }

    /**
     * @param yearOfFriendship the yearOfFriendship to set
     */
    public void setYearOfFriendship(int yearOfFriendship) {
        this.yearOfFriendship = yearOfFriendship;
    }
    
}
