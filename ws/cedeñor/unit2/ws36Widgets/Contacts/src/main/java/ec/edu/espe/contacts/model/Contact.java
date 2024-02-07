package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Contact {

    private int id;
    private String lastName;
    private String firstName;
    private String cellPhoneNumber;
    private String contactThatIntroduce;
    private String type;
    private Date birthDate;
    private ArrayList<String> hobbies;
    private char gender;
    private String comments;
    private int yearsOfFriendship;

    public Contact(int id, String lastName, String firstName, String cellPhoneNumber, String contactThatIntroduce, String type, Date birthDate, ArrayList<String> hobbies, char gender, String comments, int yearsOfFriendship) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cellPhoneNumber = cellPhoneNumber;
        this.contactThatIntroduce = contactThatIntroduce;
        this.type = type;
        this.birthDate = birthDate;
        this.hobbies = hobbies;
        this.gender = gender;
        this.comments = comments;
        this.yearsOfFriendship = yearsOfFriendship;
    }

    public Contact() {
        int id = 1 ;
        String lastName = "Cedeño";
        String firstName = "Rony";
        String cellPhoneNumber = "0984927610";
        String contactThatIntroduce = "Gustavo";
        String type = "Family";
        Date birthDate = new Date();
        ArrayList<String> hobbies = new ArrayList<String>();
        char gender = 'M';
        String comments = "none";
        int yearsOfFriendship = 0;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", cellPhoneNumber=" + cellPhoneNumber + ", contactThatIntroduce=" + contactThatIntroduce + ", type=" + type + ", birthDate=" + birthDate + ", hobbies=" + hobbies + ", gender=" + gender + ", comments=" + comments + ", yearsOfFriendship=" + yearsOfFriendship + '}';
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
     * @return the contactThatIntroduce
     */
    public String getContactThatIntroduce() {
        return contactThatIntroduce;
    }

    /**
     * @param contactThatIntroduce the contactThatIntroduce to set
     */
    public void setContactThatIntroduce(String contactThatIntroduce) {
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
     * @return the yearsOfFriendship
     */
    public int getYearsOfFriendship() {
        return yearsOfFriendship;
    }

    /**
     * @param yearsOfFriendship the yearsOfFriendship to set
     */
    public void setYearsOfFriendship(int yearsOfFriendship) {
        this.yearsOfFriendship = yearsOfFriendship;
    }

}
