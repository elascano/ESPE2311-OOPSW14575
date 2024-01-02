package ec.espe.edu.persons.view;

import ec.espe.edu.persons.model.Person;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Vivanco - Bit Coderz - DCCO ESPE
 */

public class ContactSystem {
    public static void main(String[] args) {
        int adendo1 =20;
        int adendo2 =30;
        int addition;
        
        int id =1;
        String name = "Gabriel";
        String phoneNumber = "0984237004";
        String email = "gnvivanco1@espe.edu.ec";
        
        Person person;
        person = new Person(id, name, phoneNumber);
        
        System.out.println("Id of the class " +id);
        
        addition=add(adendo1,adendo2);
        System.out.println("The sum of "+adendo1+" and "+adendo2+" = "+addition );
        
        System.out.println("Adden "+adendo1);
        registerContact(id, name, phoneNumber, email);
        System.out.println("Printing from the main: " + id + " , " + name+" , "+phoneNumber+" , "+email);

        registerContact(id, name, phoneNumber, email, person);
        System.out.println("Printing from the main: " + person);        
    }
    
    public static int add(int adendo1, int adendo2){
        int addition;
        adendo1 =50;
        addition= adendo1 + adendo2;
        return addition;
    }
    
    public static void registerContact(int id, String name, String phoneNumber, String email){
        id=20;
        name = "Nicolas";
        System.out.println("Saving inside the method: "+ id+" , "+name+" , "+phoneNumber+" , "+email);
    }
    
    public static void registerContact(int id, String name, String phoneNumber, String email, Person person){
        id=20;
        name="Nicolas";
        System.out.println("Saving inside the method: "+person);
        person.setFirstName("Edgar");
    }
}
