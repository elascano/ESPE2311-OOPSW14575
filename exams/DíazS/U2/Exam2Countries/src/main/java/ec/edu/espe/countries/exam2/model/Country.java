package ec.edu.espe.countries.exam2.model;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class Country {
    private int id;
    private String name;
    private int totalPopulation;
    private int foreignPopulation;

    public Country(int id, String name, int totalPopulation, int foreignPopulation) {
        this.id = id;
        this.name = name;
        this.totalPopulation = totalPopulation;
        this.foreignPopulation = foreignPopulation;
    }
    
    public double calculateForeignPercentage(){
        return((double)getForeignPopulation()/getTotalPopulation())*100;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", name=" + name + ", totalPopulation=" + totalPopulation + ", foreignPopulation=" + foreignPopulation + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the totalPopulation
     */
    public int getTotalPopulation() {
        return totalPopulation;
    }

    /**
     * @param totalPopulation the totalPopulation to set
     */
    public void setTotalPopulation(int totalPopulation) {
        this.totalPopulation = totalPopulation;
    }

    /**
     * @return the foreignPopulation
     */
    public int getForeignPopulation() {
        return foreignPopulation;
    }

    /**
     * @param foreignPopulation the foreignPopulation to set
     */
    public void setForeignPopulation(int foreignPopulation) {
        this.foreignPopulation = foreignPopulation;
    }

    

}
