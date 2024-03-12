
package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Contact {
    int id;
    String lastName;
    String firstName;
    String cellPhoneNumber;
    Contact contactThatIntroduce;
    String type;
    Date birthDate;
    ArrayList <String> hobbies;
    char gender;
    String comments;
    int yearsOfFriendship;

    public Contact(int id, String lastName, String firstName, String cellPhoneNumber, Contact contactThatIntroduce, String type, Date birthDate, ArrayList<String> hobbies, char gender, String comments, int yearsOfFriendship) {
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

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", cellPhoneNumber=" + cellPhoneNumber + ", contactThatIntroduce=" + contactThatIntroduce + ", type=" + type + ", birthDate=" + birthDate + ", hobbies=" + hobbies + ", gender=" + gender + ", comments=" + comments + ", yearsOfFriendship=" + yearsOfFriendship + '}';
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

    public Contact getContactThatIntroduce() {
        return contactThatIntroduce;
    }

    public void setContactThatIntroduce(Contact contactThatIntroduce) {
        this.contactThatIntroduce = contactThatIntroduce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
