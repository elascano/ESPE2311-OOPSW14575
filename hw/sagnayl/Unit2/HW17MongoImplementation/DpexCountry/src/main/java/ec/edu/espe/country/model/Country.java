package ec.edu.espe.country.model;

/**
 *
 * @author Luis Sagnay
 */
public class Country {
    private String name;
    private int ecuadorianPopulation;
    private String consularOffice;

    public Country(String name, int ecuadorianPopulation, String consularOffice) {
        this.name = name;
        this.ecuadorianPopulation = ecuadorianPopulation;
        this.consularOffice = consularOffice;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ecuadorianPopulation
     */
    public int getEcuadorianPopulation() {
        return ecuadorianPopulation;
    }

    /**
     * @param ecuadorianPopulation the ecuadorianPopulation to set
     */
    public void setEcuadorianPopulation(int ecuadorianPopulation) {
        this.ecuadorianPopulation = ecuadorianPopulation;
    }

    /**
     * @return the consularOffice
     */
    public String getConsularOffice() {
        return consularOffice;
    }

    /**
     * @param consularOffice the consularOffice to set
     */
    public void setConsularOffice(String consularOffice) {
        this.consularOffice = consularOffice;
    }
    
}
