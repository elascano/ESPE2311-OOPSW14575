
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Mammal extends Vertebrate{
    private int numberOfdMammaryGlands;
    
    public void breastfeed(){
            System.out.println("breastfeed baby 1");
        
    }

    public Mammal(int numberOfdMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.numberOfdMammaryGlands = numberOfdMammaryGlands;
    }
    
    

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + "numberOfdMammaryGlands=" + numberOfdMammaryGlands + '}';
    }
    
    

    public int getNumberOfdMammaryGlands() {
        return numberOfdMammaryGlands;
    }

    public void setNumberOfdMammaryGlands(int numberOfdMammaryGlands) {
        this.numberOfdMammaryGlands = numberOfdMammaryGlands;
    }
    
}
