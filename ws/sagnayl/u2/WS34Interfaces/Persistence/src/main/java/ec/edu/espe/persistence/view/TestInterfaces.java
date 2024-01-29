package ec.edu.espe.persistence.view;

import ec.edu.espe.persistence.controller.MongoManager;
import ec.edu.espe.persistence.model.Country;

/**
 *
 * @author Luis Sagnay
 */
public class TestInterfaces {
    public static void main(String[] args) {
        Country country = new Country("Argentina", 8900, "Buenos Aires");
        MongoManager mongodb = new MongoManager("mongodb+srv://luis:luis22@cluster0.h5n9yna.mongodb.net/?retryWrites=true&w=majority", "DPEXSystemDB");
        mongodb.create(country, "Country");

    }
}