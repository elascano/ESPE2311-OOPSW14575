package espe.edu.ec.view;
import espe.edu.ec.model.Person;
//package espe.edu.ec.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class ContactSystem {
  
    public static void main(String[] args) {   
        
        
        
        Collection things;
        things = new ArrayList();
        System.out.println("size at the beggining: " + things.size());

        things.add(2000);
        
        things.add("Hello Alex Cuzco");
        things.add(5000F);
        
        System.out.println(things);
        System.out.println("size at line 17: " + things.size());
     
      
        things.add(2000);
        System.out.println(things);
        System.out.println("size at line 21: " + things.size());

        Person me = new Person(0, "Alex", "Cuzco", new Date("27/07/2004"));
        things.add(me);
        System.out.println(me);
        System.out.println("size at line 28: " + things.size());

        things.remove(5000);
        System.out.println("size at line 32: " + things.size());
        things.remove(2000);
        System.out.println("size at line 34: " + things.size());


        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);

        Collection<Person> persons;
        persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            persons.add(new Person(i+1, "Alex" + (i+1), "" + ((i+1)*1000), new Date()));
        }
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("persons size: " + persons.size());
        
    }
}  
    

