package ec.edu.espe.model;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Constituency() {
        this.countries = new ArrayList<>();
        this.consularOffices = new ArrayList<>();
    }

    public void addCountry(Country country) {
        this.countries.add(country);
    }

    public void addConsularOffice(ConsularOffice consularOffice) {
        this.consularOffices.add(consularOffice);
    }
}
