package ec.esu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public abstract class Mammal extends Vertebrate {
    private int numberOfMammaryGlands;

    public Mammal(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.numberOfMammaryGlands = numberOfMammaryGlands;
    }

    @Override
    public String toString() {
        return "Mammal{"+ super.toString() + "numberOfMammaryGlands=" + numberOfMammaryGlands + '}';
    }
    
    public void breastFeed(){
        System.out.println("Mammal breast feed baby 1");
    }
    

    /**
     * @return the numberOfMammaryGlands
     */
    public int getNumberOfMammaryGlands() {
        return numberOfMammaryGlands;
    }

    /**
     * @param numberOfMammaryGlands the numberOfMammaryGlands to set
     */
    public void setNumberOfMammaryGlands(int numberOfMammaryGlands) {
        this.numberOfMammaryGlands = numberOfMammaryGlands;
    }
    
    
}
