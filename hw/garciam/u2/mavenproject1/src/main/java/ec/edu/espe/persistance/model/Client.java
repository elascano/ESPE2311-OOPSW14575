package ec.edu.espe.persistance.model;

import ec.edu.espe.persistance.controller.MongoDB;

/**
 *
 * @author mateo
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person(0, "Mateo García", "Quito", 19);
        MongoDB mongodb = new MongoDB("mongodb+srv://mateo:mateo@cluster0.jp3jhno.mongodb.net/?retryWrites=true&w=majority", "test_collection");
        mongodb.create(person, "test_collection");

    }

}
