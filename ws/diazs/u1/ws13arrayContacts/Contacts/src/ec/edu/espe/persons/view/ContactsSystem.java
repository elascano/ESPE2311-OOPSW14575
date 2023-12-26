package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class ContactsSystem {
    int addend1 = 2;
    int addend2 = 3;
    int id = 0;
    String name = "Stefy";
    String phoneNumber = "0962140626";
    String email = "stefany152005@gmail.com";
    
            

    public static void main(String[] args) {
        
        int addend1 = 20;
        int addend2 = 30;
        int id = 1;
        int addition;
        String name = "Stefany";
        String phoneNumber = "0968606550";
        String email = "smdiazespe.edu.ec";
        Person person;
        person = new Person(id, name, phoneNumber, email);
        
        System.out.println("Id of the class -->" + id);
        addition = add(addend1, addend2);
        System.out.println("Addition of --> " + addend1 + " and " +  addend2 + " is --> " + addition);
        
        System.out.println("Person before --> " + person);
        registerContact(id, name, phoneNumber, email, person);
        System.out.println("Person after --> " + person);

        
        System.out.println("Printing from the main " + id + " , " + name + " , " + phoneNumber + " , " + email);

        
    } 
    
    public static int add(int addend1, int addend2){
        int addition;
        addend1 = 50;
        addition = addend1 + addend2;
        return addition;
    }
    
    public static void registerContact(int id, String name, String phoneNumber, String email, Person person){
        id = 20;
        name = "Maricela";
        
        System.out.println("Saving(inside the method " + id + " , " + name + " , " + phoneNumber + " , " + email);
        person.setName("Maricela");
        System.out.println("Person inside " + person);

    }
    
    
}
        
        /**Collection things;
        things = new ArrayList();
        Person myself = new Person(1, "Stefy", "Diaz", new Date(2005, 2, 15));
        System.out.println("size at the beginning:" + things.size());

        things.add(600);
        things.add("Hello from Stefany Diaz");
        things.add(5000.25F);
        things.add(2005);
        things.remove(5000.25F);
        System.out.println("size at the end:" + things.size());

        System.out.println("Array" + things);
        things.add(myself);
        System.out.println(things);
        things.remove(300);
        System.out.println(things.size());
        things.remove(600);
        System.out.println(things.size());

        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);

        Collection<Person> persons;
        persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            persons.add(new Person((i + 1), "Pablo" + (i + 1),  "Lascano", new Date()));
            
        
        }
        
        for(Person person : persons){
            System.out.println(person);        
        }
        System.out.println(persons.size());
    }

}*/
