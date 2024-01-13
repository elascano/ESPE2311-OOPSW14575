package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Mammal extends Vertebrate {

    private int numberOfMammaryGland;

    public Mammal(int numberOfMammaryGland, int id, String scientificName, Date bornOnDate, int cageId, String spine, int numberOfBones) {
        super(id, scientificName, bornOnDate, cageId, spine, numberOfBones);
        this.numberOfMammaryGland = numberOfMammaryGland;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + "numberOfMammaryGland=" + getNumberOfMammaryGland() + '}';
    }
    
    public void breastFeed(){
        System.out.println("mammal breast feend baby 1");    
    }
    
    /**
     * @return the numberOfMammaryGland
     */
    public int getNumberOfMammaryGland() {
        return numberOfMammaryGland;
    }

    /**
     * @param numberOfMammaryGland the numberOfMammaryGland to set
     */
    public void setNumberOfMammaryGland(int numberOfMammaryGland) {
        this.numberOfMammaryGland = numberOfMammaryGland;
    }

}
