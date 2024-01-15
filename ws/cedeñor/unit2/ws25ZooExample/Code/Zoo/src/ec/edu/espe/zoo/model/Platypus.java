
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Platypus extends Mammal {
    private boolean poisoness;
    private int poisonGlands;

    public Platypus(boolean poisoness, int poisonGlands, int numberOfMammaryGland, int id, String scientificName, Date bornOnDate, int cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGland, id, scientificName, bornOnDate, cageId, spine, numberOfBones);
        this.poisoness = poisoness;
        this.poisonGlands = poisonGlands;
    }

 

    @Override
    public String toString() {
        return "Platypus{" + super.toString()+ "poisoness=" + poisoness + ", poisonGlands=" + poisonGlands + '}';
    }

    /**
     * @return the poisoness
     */
    public boolean isPoisoness() {
        return poisoness;
    }

    /**
     * @param poisoness the poisoness to set
     */
    public void setPoisoness(boolean poisoness) {
        this.poisoness = poisoness;
    }

    /**
     * @return the poisonGlands
     */
    public int getPoisonGlands() {
        return poisonGlands;
    }

    /**
     * @param poisonGlands the poisonGlands to set
     */
    public void setPoisonGlands(int poisonGlands) {
        this.poisonGlands = poisonGlands;
    }
    
    
}
