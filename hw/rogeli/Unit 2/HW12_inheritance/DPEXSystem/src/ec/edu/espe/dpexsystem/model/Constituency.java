package ec.edu.espe.dpexsystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NullPointerException
 */
public class Constituency {
    private String name;
    private ArrayList<Country> countries;
    private ArrayList<ConsularOffice> consularOffices;

    public Constituency(String name, ArrayList<Country> countries, ArrayList<ConsularOffice> consularOffices) {
        this.name = name;
        this.countries = countries;
        this.consularOffices = consularOffices;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
    
    public void addConsularOffice(ConsularOffice office){
        consularOffices.add(office);
    }
}
