package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Contact {
    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        System.out.println("size at the begginning:" + things.size());
        things.add(999);
        things.add("Luis");
        things.add(10.22F);
        
        System.out.println("size " +things.size());
        System.out.println(things);
        
        things.add(999);
        System.out.println(things);
        
        Date birthday = new Date();
        Person person = new Person(1, "Luis", "Sagnay", birthday);
        things.add(person);
        
        things.remove(684864);
        System.out.println("size " +things.size());
        things.remove(999);
        System.out.println("size " +things.size());
        
        Collection<Integer>integers = new ArrayList<>();
        integers.add(1);
        
        Collection<Person>persons;
        persons = new ArrayList<>();
        
        for(int i=0; i<5; i++){
            persons.add(new Person(i, "Luis"+(i+1), "Sagnay"+(i+1),birthday));
        }
        System.out.println("Person size: " +persons.size());
        
        persons.forEach((p)->{
            System.out.println("Person" +p);
        });
    }
   
}