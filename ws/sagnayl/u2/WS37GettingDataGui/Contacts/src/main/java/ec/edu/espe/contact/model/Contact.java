package ec.edu.espe.contact.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mateo
 */
public class Contact {
    private int id;
    private String lastName;
    private String firstName;
    private String cellPhoneNumber;
    private String contactThatIntroduce;
    private String type;
    private Date birthDay;
    private ArrayList<String> hobbies;
    private char gender;
    private String comments;
    private int yearsOfFriendship;

    public Contact(int id, String lastName, String firstName, String cellPhoneNumber, String contactThatIntroduce, String type, Date birthDay, ArrayList<String> hobbies, char gender, String comments, int yearsOfFriendship) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cellPhoneNumber = cellPhoneNumber;
        this.contactThatIntroduce = contactThatIntroduce;
        this.type = type;
        this.birthDay = birthDay;
        this.hobbies = hobbies;
        this.gender = gender;
        this.comments = comments;
        this.yearsOfFriendship = yearsOfFriendship;
    }
    
    public Contact() {
        id = 1;
        lastName = "";
        firstName = "";
        cellPhoneNumber = "";
        contactThatIntroduce = "";
        type = "";
        birthDay = new Date();
        hobbies = new ArrayList();
        gender = 'M';
        comments = "";
        yearsOfFriendship = 5;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", cellPhoneNumber=" + cellPhoneNumber + ", contactThatIntroduce=" + contactThatIntroduce + ", type=" + type + ", birthDay=" + birthDay + ", hobbies=" + hobbies + ", gender=" + gender + ", comments=" + comments + ", yearsOfFriendship=" + yearsOfFriendship + '}';
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getContactThatIntroduce() {
        return contactThatIntroduce;
    }

    public void setContactThatIntroduce(String contactThatIntroduce) {
        this.contactThatIntroduce = contactThatIntroduce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getYearsOfFriendship() {
        return yearsOfFriendship;
    }

    public void setYearsOfFriendship(int yearsOfFriendship) {
        this.yearsOfFriendship = yearsOfFriendship;
    }
   
}
