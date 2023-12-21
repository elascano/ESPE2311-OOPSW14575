package ec.espe.edu.persons.view;

import ec.espe.edu.persons.model.Person;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Frederick Tipan - Bit Coderz - DCCO ESPE
 */
public class ContactSystem {
    
    public static void main(String[] args) {
        
        int adendo1=20;
        int adendo2=30;
        int addition;
        
        int id=1;
        String name="Frederick";
        String phoneNumber="0982679344";
        String email="fredericktimo@gmail.com";
        
        Person person;
        person = new Person(id,name,phoneNumber,new Date(2023,12,4));
        
        System.out.println("Id of the class " + id);
        
        addition = add(adendo1,adendo2);
        System.out.println("The sum of " + adendo1 + " and " + adendo2 + " = " + addition );
        
        System.out.println("Adden " + adendo1);
        
        registerContact(id,name,phoneNumber,email);
        System.out.println("Printing from the main: " + id + " , " + name + " , " + phoneNumber + " , " + email);
        
        registerContact(id,name,phoneNumber,email,person);
        System.out.println("Printing person from the main: " + person);
        
    }
    
    public static int add(int adendo1, int adendo2){
        int addition;
        adendo1=50;
        addition = adendo1 + adendo2;
        return addition;
    }
    
    public static void registerContact(int id, String name, String phoneNumber, String email){
        id=20;
        name="Santiago";
        System.out.println("Saving inside the mothod: " + id + " , " + name + " , " + phoneNumber + " , " + email);
    }
    
    public static void registerContact(int id, String name, String phoneNumber, String email, Person person){
        id=20;
        name="Santiago";
        System.out.println("Saving inside the mothod: " + id + " , " + name + " , " + phoneNumber + " , " + email);
        
        person.setFirstName("Edgar");
        System.out.println("Person inside method: " + person);
        
    }
    
    
    
    /*
    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        System.out.println("size at the begining " + things.size());
        
        things.add(4027);
        things.add("Hello Frederick");
        things.add(500.014F);
        System.out.println("size " + things.size());
        
        System.out.println(things);
        
        things.add(4027);
        
        System.out.println(things);
        
        Person person = new Person(1,"Frederick","Tipan",new Date(2004,3,2004));
        things.add(person);
        System.out.println("size:" + things.size());
        
        things.remove(1234.5F);
        
        System.out.println(things);
        System.out.println("size:" + things.size());
        
        things.remove(4027);
        System.out.println("size:" + things.size());
        
        
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        
        Collection<Person> persons;
        persons = new ArrayList<>();
        
        for(int i=0;i<5;i++){
            persons.add(new Person(2,"Samantha","Tipan",new Date(2008,10,21)));
        }
        
        
        System.out.println("Person Size --> " + persons.size());   
    }*/
    
}
