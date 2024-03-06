package ec.edu.espe.ws36contacts.model;

import java.util.ArrayList;
import java.util.Date;





/**
 *
 * @author Usuario
 */
public class Contact {

    private int id;
    private String lastName;
    private String firtName;
    private String cellPhoneNumber;
    private Contact contactThatIntroduce;
    private String type;
    private Date birtDate;
    private ArrayList<String> hobbies;
    private char gender;
    private String comments;
    private int yearsOfFriendsihp;

    public Contact(int id, String lastName, String firtName, String cellPhoneNumber, Contact contactThatIntroduce, String type, Date birtDate, ArrayList<String> hobbies, char gender, String comments, int yearsOfFriendsihp) {
        this.id = id;
        this.lastName = lastName;
        this.firtName = firtName;
        this.cellPhoneNumber = cellPhoneNumber;
        this.contactThatIntroduce = contactThatIntroduce;
        this.type = type;
        this.birtDate = birtDate;
        this.hobbies = hobbies;
        this.gender = gender;
        this.comments = comments;
        this.yearsOfFriendsihp = yearsOfFriendsihp;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", lastName=" + lastName + ", firtName=" + firtName + ", cellPhoneNumber=" + cellPhoneNumber + ", contactThatIntroduce=" + contactThatIntroduce + ", type=" + type + ", birtDate=" + birtDate + ", hobbies=" + hobbies + ", gender=" + gender + ", comments=" + comments + ", yearsOfFriendsihp=" + yearsOfFriendsihp + '}';
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
     * @return the firtName
     */
    public String getFirtName() {
        return firtName;
    }

    /**
     * @param firtName the firtName to set
     */
    public void setFirtName(String firtName) {
        this.firtName = firtName;
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
     * @return the birtDate
     */
    public Date getBirtDate() {
        return birtDate;
    }

    /**
     * @param birtDate the birtDate to set
     */
    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
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
     * @return the yearsOfFriendsihp
     */
    public int getYearsOfFriendsihp() {
        return yearsOfFriendsihp;
    }

    /**
     * @param yearsOfFriendsihp the yearsOfFriendsihp to set
     */
    public void setYearsOfFriendsihp(int yearsOfFriendsihp) {
        this.yearsOfFriendsihp = yearsOfFriendsihp;
    }
    
}
