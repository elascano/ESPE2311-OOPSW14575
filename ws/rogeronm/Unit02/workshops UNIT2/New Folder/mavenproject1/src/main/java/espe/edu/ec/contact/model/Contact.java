package espe.edu.ec.contact.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EDWARICHSNAKE
 */
public class Contact {
    int id;
    String lastName;
    String firstName;
    String cellphoneNumber;
    Contact contactThatIntroduce;
    String typeOfContact;
    Date birthdate;
    ArrayList<String> hobbies;
    char gender;
    String comments;
    int yearsOfFrienship;

    public Contact(int id, String lastName, String firstName, String cellphoneNumber, Contact contactThatIntroduce, String typeOfContact, Date birthdate, ArrayList<String> hobbies, char gender, String comments, int yearsOfFrienship) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cellphoneNumber = cellphoneNumber;
        this.contactThatIntroduce = contactThatIntroduce;
        this.typeOfContact = typeOfContact;
        this.birthdate = birthdate;
        this.hobbies = hobbies;
        this.gender = gender;
        this.comments = comments;
        this.yearsOfFrienship = yearsOfFrienship;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", cellphoneNumber=" + cellphoneNumber + ", contactThatIntroduce=" + contactThatIntroduce + ", typeOfContact=" + typeOfContact + ", birthdate=" + birthdate + ", hobbies=" + hobbies + ", gender=" + gender + ", comments=" + comments + ", yearsOfFrienship=" + yearsOfFrienship + '}';
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

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public Contact getContactThatIntroduce() {
        return contactThatIntroduce;
    }

    public void setContactThatIntroduce(Contact contactThatIntroduce) {
        this.contactThatIntroduce = contactThatIntroduce;
    }

    public String getTypeOfContact() {
        return typeOfContact;
    }

    public void setTypeOfContact(String typeOfContact) {
        this.typeOfContact = typeOfContact;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public int getYearsOfFrienship() {
        return yearsOfFrienship;
    }

    public void setYearsOfFrienship(int yearsOfFrienship) {
        this.yearsOfFrienship = yearsOfFrienship;
    }
    
    
    
}
