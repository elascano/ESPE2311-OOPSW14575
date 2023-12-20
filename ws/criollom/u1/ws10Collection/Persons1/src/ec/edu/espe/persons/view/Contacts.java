
package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MateoCriollo/InterByte/DCCO-ESPE
 */
public class Contacts {
    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        System.out.println("size at the beginning: "+things.size());
        things.add(15042004);
        things.add("hello Mateo");
        things.add(5000.25F);
        System.out.println("size at the beginning: "+things.size());
        System.out.println("things-->: "+things);
        things.add(15042004);
        System.out.println("things-->: "+things);
        
        Person person=new Person();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        person.setFirstName(scan.nextLine());
        things.add(person);
        System.out.println("things-->: "+things);
        System.out.println("size at the beginning: "+things.size());
        things.remove(5000.25F);
        System.out.println("things-->: "+things);
        System.out.println("size at the beginning: "+things.size());
        things.remove(5000);
        System.out.println("things-->: "+things);
        System.out.println("size at the beginning: "+things.size());
        
        
        Collection<Person>persons;
        persons=new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            persons.add(new Person(1, "Mateo", "Criollo", new Date()));
        }
        
        for (Person c : persons){
            System.out.println(c);
        }
        
        System.out.println("size at the beginning: "+persons.size());
        
        
    }
    
    
}
