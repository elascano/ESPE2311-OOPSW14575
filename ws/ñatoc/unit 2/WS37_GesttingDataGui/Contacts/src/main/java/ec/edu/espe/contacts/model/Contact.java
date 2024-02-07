
package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Contact {
    private int id;
    private String lastName;
    private String firstName;
    private String cellPhoneNumber;
    private Contact contactThatIntoduce;
    private String type;
    private Date birthDate;
    private ArrayList<String> hobbies;
    private char gender;
    private String comments;
    private int yearOfFriendshid;

    public Contact(int id, String lastName, String firstName, String cellPhoneNumber, Contact contactThatIntoduce, String type, Date birthDate, ArrayList<String> hobbies, char gender, String comments, int yearOfFriendshid) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cellPhoneNumber = cellPhoneNumber;
        this.contactThatIntoduce = contactThatIntoduce;
        this.type = type;
        this.birthDate = birthDate;
        this.hobbies = hobbies;
        this.gender = gender;
        this.comments = comments;
        this.yearOfFriendshid = yearOfFriendshid;
    }

    @Override
    public String toString() {
        return "HelloWord{" + "id=" + getId() + ", lastName=" + getLastName() + ", firstName=" + getFirstName() + ", cellPhoneNumber=" + getCellPhoneNumber() + ", contactThatIntoduce=" + getContactThatIntoduce() + ", type=" + getType() + ", birthDate=" + getBirthDate() + ", hobbies=" + getHobbies() + ", gender=" + getGender() + ", comments=" + getComments() + ", yearOfFriendshid=" + getYearOfFriendshid() + '}';
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
     * @return the cellPhoneNumber
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * @param cellPhoneNumber the cellPhoneNumber to set
     */
    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    /**
     * @return the contactThatIntoduce
     */
    public Contact getContactThatIntoduce() {
        return contactThatIntoduce;
    }

    /**
     * @param contactThatIntoduce the contactThatIntoduce to set
     */
    public void setContactThatIntoduce(Contact contactThatIntoduce) {
        this.contactThatIntoduce = contactThatIntoduce;
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
     * @return the yearOfFriendshid
     */
    public int getYearOfFriendshid() {
        return yearOfFriendshid;
    }

    /**
     * @param yearOfFriendshid the yearOfFriendshid to set
     */
    public void setYearOfFriendshid(int yearOfFriendshid) {
        this.yearOfFriendshid = yearOfFriendshid;
    }
    
    

    
    
}
