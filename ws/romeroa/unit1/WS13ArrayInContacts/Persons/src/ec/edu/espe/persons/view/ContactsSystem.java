package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class ContactsSystem {
    
    int addend1=20;
    int addend2=30;
    int id=1;
    String name="Andrés";
    String phoneNumber="0968855639";
    String email="aromero13@espe.edu.ec";
   
    public static void main(String[] args) {
         int addend1=20;
         int addend2=30;
         int id=1;
         String name="Andrés";
         String phoneNumber="0968855639";
         String email="aromero13@espe.edu.ec";
         
         Person person;
         person = new Person(id, name, phoneNumber, email);
         
         System.out.println("Id of the class ---> " + id);
         System.out.println("Addition of ---> " + addend1 + " and " + addend2 + " in ---> " + add(addend1 , addend2) );
         
         System.out.println("Person before --->" + person);
         
         registerContact(id, name, phoneNumber, email, person);
         
         System.out.println("Person after --->" + person);
         
         System.out.println("Saving (printing from the main) " + id + " , " + name + " , " + phoneNumber + " , " + email);
     }
    public static int add(int addend1,int addend2){
        
        int addition;
        addend1 = 50;
        addition = addend1+addend2;
        
        return addition;
    }
    public static void registerContact(int id, String name, String phoneNumber, String email, Person person){
        id = 20;
        name="Gustavo";
        System.out.println("Saving (inside the method) " + id + " , " + name + " , " + phoneNumber + " , " + email);
        person.setName("Gustavo");
        System.out.println("Person ---> " + person);
    }
}     
    
   