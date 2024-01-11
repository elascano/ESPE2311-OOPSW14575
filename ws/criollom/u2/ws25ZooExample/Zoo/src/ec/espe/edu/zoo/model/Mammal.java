
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Mammal extends Vertebrate{
    private int numberOfMammaryGlands;

    public Mammal(int numberOfMammaryGlands, String spine, int numberOfbones, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(spine, numberOfbones, id, ciemtificName, bornOnDate, cageId);
        this.numberOfMammaryGlands = numberOfMammaryGlands;
    }

    
    
    
    @Override
    public String toString() {
        return "Mammal{" + super.toString()+"numberOfMammaryGlands=" + numberOfMammaryGlands + '}';
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
