package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Contact {
    private int id;
    private String lastName;
    private String firstName;
    private String cellPhoneNumber;
    private Contact contactThatIntroduce;
    private String typeOfContact;
    private Date birthDate;
    private ArrayList<String> hobbies;
    private char gender;
    private String comments;
    private int yearsOfFriendship;

    public Contact(int id, String lastName, String firstName, String cellPhoneNumber, Contact contactThatIntroduce, String typeOfContact, Date birthDate, ArrayList<String> hobbies, char gender, String comments, int yearsOfFriendship) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cellPhoneNumber = cellPhoneNumber;
        this.contactThatIntroduce = contactThatIntroduce;
        this.typeOfContact = typeOfContact;
        this.birthDate = birthDate;
        this.hobbies = hobbies;
        this.gender = gender;
        this.comments = comments;
        this.yearsOfFriendship = yearsOfFriendship;
    }
    
    public Contact() {
        this.id = 1;
        this.lastName = "Noboa";
        this.firstName = "Daniel";
        this.cellPhoneNumber = "098765563";
        this.contactThatIntroduce = null;
        this.typeOfContact = "Friend";
        this.birthDate = new Date();
        this.hobbies = new ArrayList();
        this.gender = 'M';
        this.comments = "";
        this.yearsOfFriendship = 3;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", \nlastName=" + lastName + ", \nfirstName=" + firstName + ", \ncellPhoneNumber=" + cellPhoneNumber + ", \ncontactThatIntroduce=" + contactThatIntroduce + ", \ntypeOfContact=" + typeOfContact + ", \nbirthDate=" + birthDate + ", \nhobbies=" + hobbies + ", \ngender=" + gender + ", \ncomments=" + comments + ", \nyearsOfFriendship=" + yearsOfFriendship + '}';
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
     * @return the typeOfContact
     */
    public String getTypeOfContact() {
        return typeOfContact;
    }

    /**
     * @param typeOfContact the typeOfContact to set
     */
    public void setTypeOfContact(String typeOfContact) {
        this.typeOfContact = typeOfContact;
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
