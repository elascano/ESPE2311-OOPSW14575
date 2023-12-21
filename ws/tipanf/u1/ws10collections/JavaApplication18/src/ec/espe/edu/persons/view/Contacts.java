package ec.espe.edu.persons.view;

import ec.espe.edu.persons.model.Person;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Frederick Tipan - Bit Coderz - DCCO ESPE
 */
public class Contacts {
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
    }
    
}
