package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Mammal extends Vertebrate {
    private int numberOfMammaryGlands;
    
    public void breastfeed(){ 
        System.out.println("mammal breasfeed baby 1");
    }
    
    public void isClimbing() {
        System.out.println("mammal climb things");
    }

    public Mammal(int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.numberOfMammaryGlands = numberOfMammaryGlands;
    }

    @Override
    public String toString() {
        return "Mammal{"+ super.toString() + "numberOfMammaryGlands=" + numberOfMammaryGlands + '}';
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
