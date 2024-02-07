package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Mammal extends Vertebrate{
    private int numberOfdMammaryGlands;

    public void breastfeed(){
        System.out.println("Mammal breastfeed baby 1");
    }
    
    public Mammal(int numberOfdMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornOnDate, int cageId) {
        super(spine, numberOfBones, id, scientificName, bornOnDate, cageId);
        this.numberOfdMammaryGlands = numberOfdMammaryGlands;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + "numberOfdMammaryGlands=" + numberOfdMammaryGlands + '}';
    }

    /**
     * @return the numberOfdMammaryGlands
     */
    public int getNumberOfdMammaryGlands() {
        return numberOfdMammaryGlands;
    }

    /**
     * @param numberOfdMammaryGlands the numberOfdMammaryGlands to set
     */
    public void setNumberOfdMammaryGlands(int numberOfdMammaryGlands) {
        this.numberOfdMammaryGlands = numberOfdMammaryGlands;
    }
}
