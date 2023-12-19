package ec.edu.espe.persons.view;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
import ec.edu.espe.persons.model.Person;

public class Contacts {

    public static void main(String[] args) {
        int addend1 = 20;
        int addend2 = 30;
        int addition;
        int id = 1;
        String name = "Rony";
        String phoneNumber = "098492761";
        String email = "ronycedeno558@gmail.com";
        Person person;
        person = new Person(id, name, phoneNumber, email);

        System.out.println("id of the class -------> " + id);
        System.out.println("addition of -> " + addend1 + " + " + addend2 + " is -->" + (addend1 + addend2));

        System.out.println("print after entering the function add");
        addition = add(addend1, addend2);
        System.out.println("addition of -> " + addend1 + " + " + addend2 + " is -->" + addition);

        System.out.println("Print before entering the function registerContact");
        System.out.println("id: " + id + ", name: " + name + ", " + phoneNumber + ", " + email);
        person.setName("Changed Name");
        System.out.println("Person before ---> " + person);

        registerContact(id, name, phoneNumber, email, person);
        System.out.println("Print after entering the function registerContact");
        System.out.println("id: " + id + ", name: " + name + ", " + phoneNumber + ", " + email);
        System.out.println("Person before ------> " + person);
    }

    public static int add(int addend1, int addend2) {
        int addition;
        addend1 = 50;
        addition = addend1 + addend2;
        return addition;
    }

    public static void registerContact(int id, String name, String phoneNumber, String email, Person person) {
        id = 20;
        name = "Stiven";
        System.out.println("id: " + id + ", name: " + name + ", " + phoneNumber + ", " + email);
        person.setName("Stiven");
        System.out.println("Person inside --> " + person);
    }
}
