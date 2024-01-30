package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Octopus extends Mollusk {
    private float tentacleLenght;
    private int numberOfTentacles;
    
    @Override
    public void reproduce() {
        System.out.println("The octopus is reproducing sexually");
    }

    public Octopus(float tentacleLenght, int numberOfTentacles, boolean hasShell, String muscularFootType, float size, String habitat, int id, String scientificName, Date bornDate, int cageId) {
        super(hasShell, muscularFootType, size, habitat, id, scientificName, bornDate, cageId);
        this.tentacleLenght = tentacleLenght;
        this.numberOfTentacles = numberOfTentacles;
    }

    @Override
    public String toString() {
        return "Octopus{"+ super.toString() + "tentacleLenght=" + tentacleLenght + ", numberOfTentacles=" + numberOfTentacles + '}';
    }
    

    /**
     * @return the tentacleLenght
     */
    public float getTentacleLenght() {
        return tentacleLenght;
    }

    /**
     * @param tentacleLenght the tentacleLenght to set
     */
    public void setTentacleLenght(float tentacleLenght) {
        this.tentacleLenght = tentacleLenght;
    }

    /**
     * @return the numberOfTentacles
     */
    public int getNumberOfTentacles() {
        return numberOfTentacles;
    }

    /**
     * @param numberOfTentacles the numberOfTentacles to set
     */
    public void setNumberOfTentacles(int numberOfTentacles) {
        this.numberOfTentacles = numberOfTentacles;
    }
    
    
    
}
