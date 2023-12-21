package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class ContactSystem {

    public static void main(String[] args) {

        Collection things;
        things = new ArrayList();
        System.out.println("size " + things.size());

        things.add(71);
        things.add("Rony");
        things.add(66.66F);
        System.out.println(things);
        System.out.println("size " + things.size());
        things.add(71);
        System.out.println(things);

        Date birthday = new Date();

        Person person = new Person(1, "Rony", "Cedeño", birthday);
        things.add(person);
        System.out.println("size " + things.size());

        things.remove(71);
        System.out.println("size " + things.size());

        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);

        Collection<Person> persons;
        persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            persons.add(new Person(i, "Rony", "Cedeño", birthday));
        }

        System.out.println("size -->" + things.size());
        persons.forEach((p) -> {
            System.out.println("Person --> " + p);
        });
    }

}
