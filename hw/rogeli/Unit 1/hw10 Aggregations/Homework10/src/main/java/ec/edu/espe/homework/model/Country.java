package ec.edu.espe.homework.model;

/**
 *
 * @author Ilhan
 */
public class Country {
    private String name;
    private int ecuadorianPopulation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public int getEcuadorianPopulation() {
        return ecuadorianPopulation;
    }

    public void setEcuadorianPopulation(int ecuadorianPopulation) {
        this.ecuadorianPopulation = ecuadorianPopulation;
    }

    public Country(String name, int ecuadorianPopulation) {
        this.name = name;
        this.ecuadorianPopulation = ecuadorianPopulation;
    }

    @Override
    public String toString() {
        return "Country = " + name + ", Ecuadorian Population = " + ecuadorianPopulation + '}';
    }
   
}
