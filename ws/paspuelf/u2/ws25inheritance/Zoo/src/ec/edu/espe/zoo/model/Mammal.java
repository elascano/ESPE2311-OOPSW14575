
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public class Mammal extends Vertebrate {

    private int numberOfMammayGlands;

    public Mammal(int numberOfMammayGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.numberOfMammayGlands = numberOfMammayGlands;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + "numberOfMammayGlands=" + numberOfMammayGlands + '}';
    }

    public void breastFeed (){
        System.out.println("Breatfeed baby 1");
    }
    
    /**
     * @return the numberOfMammayGlands
     */
    public int getNumberOfMammayGlands() {
        return numberOfMammayGlands;
    }

    /**
     * @param numberOfMammayGlands the numberOfMammayGlands to set
     */
    public void setNumberOfMammayGlands(int numberOfMammayGlands) {
        this.numberOfMammayGlands = numberOfMammayGlands;
    }

}
