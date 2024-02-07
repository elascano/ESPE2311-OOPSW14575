package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Arthropod extends Invertebrate{
    private boolean developsMetamorphosis;
    private int numberOfArticulations;

    public Arthropod(boolean developsMetamorphosis, int numberOfArticulations, float size, String habitat, int id, String scientificName, Date bornDate, int cageId) {
        super(size, habitat, id, scientificName, bornDate, cageId);
        this.developsMetamorphosis = developsMetamorphosis;
        this.numberOfArticulations = numberOfArticulations;
    }

    @Override
    public String toString() {
        return "Arthropod{"+ super.toString() + "developsMetamorphosis=" + developsMetamorphosis + ", numberOfArticulations=" + numberOfArticulations + '}';
    }
    
    public void shedExoskeleton(){
        System.out.println("Arthropod is sheding it's exoskeleton");
    }

    /**
     * @return the developsMetamorphosis
     */
    public boolean isDevelopsMetamorphosis() {
        return developsMetamorphosis;
    }

    /**
     * @param developsMetamorphosis the developsMetamorphosis to set
     */
    public void setDevelopsMetamorphosis(boolean developsMetamorphosis) {
        this.developsMetamorphosis = developsMetamorphosis;
    }

    /**
     * @return the numberOfArticulations
     */
    public int getNumberOfArticulations() {
        return numberOfArticulations;
    }

    /**
     * @param numberOfArticulations the numberOfArticulations to set
     */
    public void setNumberOfArticulations(int numberOfArticulations) {
        this.numberOfArticulations = numberOfArticulations;
    }
    
    
    
}
