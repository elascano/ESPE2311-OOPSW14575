package ec.edu.espe.persons.view;

import java.util.Date;

import ec.edu.espe.persons.model.Person;

public class ContactSystem {
    public static void main(String[] args) {
        int addend1 = 20;
        int addend2 = 30;
        int id = 1;
        String name = "Andrés";
        String phoneNumber = "0958331234";
        String email = "andres@komodroid.com";

        System.out.println("Name before run: " + name);
        
        Person person = new Person(id, name, name, new Date());
        System.out.println("ID -> " + id);

        System.out.println("Addition of " + addend1 + "+" + addend2 + " is: " + add(addend1, addend2));
        registerContact(id, name, phoneNumber, email, person);

        System.out.println("Name after run: " + name);
    }

    public static int add(int addend1, int addend2) {
        addend1 = 50;
        return addend1 + addend2;
    }

    public static void registerContact(int id, String name, String phoneNumber, String email, Person person) {
        id = 20;
        name = "Pablo";
        System.out.println("Saving contact: " + id + ", " + name + ", " + phoneNumber + ", " + email + ", " + person);
    }
}
