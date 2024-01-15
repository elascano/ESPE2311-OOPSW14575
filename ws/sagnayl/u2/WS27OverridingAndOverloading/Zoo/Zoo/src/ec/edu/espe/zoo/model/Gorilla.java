package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Gorilla extends Mammal{
    private boolean isAgresive;
    
    public void climbTrees(){
        System.out.println("The Gorilla is climbing the trees");
    }

    public Gorilla(boolean isAgresive, int numberOfMammaryGland, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGland, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.isAgresive = isAgresive;
    }

    @Override
    public String toString() {
        return "Gorilla{" +super.toString() + "isAgresive=" + isIsAgresive() + '}';
    }

    /**
     * @return the isAgresive
     */
    public boolean isIsAgresive() {
        return isAgresive;
    }

    /**
     * @param isAgresive the isAgresive to set
     */
    public void setIsAgresive(boolean isAgresive) {
        this.isAgresive = isAgresive;
    }

}
