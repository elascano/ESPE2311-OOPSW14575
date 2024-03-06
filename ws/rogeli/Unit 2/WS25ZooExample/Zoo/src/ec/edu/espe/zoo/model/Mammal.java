
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Mammal extends Vertebrate{
    
    private int numberOfMammaryGlands;

    public Mammal(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date borndateM, int cageId) {
        super(spine, numberOfBones, id, scientificName, borndateM, cageId);
        this.numberOfMammaryGlands = numberOfMammaryGlands;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString()+ "numberOfMammaryGlands=" + numberOfMammaryGlands + '}';
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
