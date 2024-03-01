package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO - ESPE
 */
public abstract class Mammal extends Vertebrate{
    private int numberOfMammaryGlands;
    
    public void breastfeed(){
        System.out.println("mammal breastfeed baby 1");
    }

    @Override
    public String toString() {
        return "Mammal{"+ super.toString() + "numberOfMammaryGlands=" + numberOfMammaryGlands + '}';
    }

    public Mammal(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.numberOfMammaryGlands = numberOfMammaryGlands;
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
