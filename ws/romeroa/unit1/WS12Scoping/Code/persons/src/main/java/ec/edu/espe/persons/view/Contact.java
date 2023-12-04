package ec.edu.espe.persons.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import ec.edu.espe.persons.model.Person;

public class Contact {
    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        System.out.println("size at the beggining: " + things.size());

        things.add(1969);
        things.add("Hello from Andrés Romero");
        things.add(5000.25F);
        
        System.out.println(things);
        System.out.println("size at line 17: " + things.size());

        things.add(1969);
        System.out.println(things);
        System.out.println("size at line 21: " + things.size());

        Person me = new Person(0, "Andrés", "Romero", new Date("05/15/2004"));
        things.add(me);
        System.out.println(me);
        System.out.println("size at line 28: " + things.size());

        things.remove(300);
        System.out.println("size at line 32: " + things.size());
        things.remove(1969);
        System.out.println("size at line 34: " + things.size());


        // Part 2
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);

        Collection<Person> persons;
        persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            persons.add(new Person(i+1, "Andrés" + (i+1), "" + ((i+1)*1000), new Date()));
        }
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("persons size: " + persons.size());
    }
}
