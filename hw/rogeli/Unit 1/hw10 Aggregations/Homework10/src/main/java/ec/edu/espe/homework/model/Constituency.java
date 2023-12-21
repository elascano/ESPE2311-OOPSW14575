package ec.edu.espe.homework.model;

import java.util.ArrayList;

/**
 *
 * @author Ilhan
 */
public class Constituency {
    private String name;
    private Country country;
    //private ConsularOffice[] consularOffices; 
    private ArrayList <ConsularOffice> consularOffices;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public Country getCountry() {
        return country;
    }
     public void setCountry(Country country) {
        this.country = country;
    }
     
    public ArrayList <ConsularOffice> getConsularOffices() {
        return consularOffices;
    }

    public void setConsularOffices(ArrayList <ConsularOffice> consularOffices) {
        this.consularOffices = consularOffices;
    }

    public Constituency(String name, Country country, ArrayList<ConsularOffice> consularOffices) {
        this.name = name;
        this.country = country;
        this.consularOffices = consularOffices;
    }

    @Override
    public String toString() {
        return "Constituency { name=" + name + ", country=" + country + ", consularOffices=" + consularOffices + '}';
    }
  
}