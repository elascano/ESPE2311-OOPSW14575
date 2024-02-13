
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Platypus extends Mammal{
    private boolean poisoness;
    private int poisonGlands;

    public Platypus(boolean poisoness, int poisonGlands, int numberOfdMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfdMammaryGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.poisoness = poisoness;
        this.poisonGlands = poisonGlands;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Platypus{" + super.toString() + "poisoness=" + poisoness + ", poisonGlands=" + poisonGlands + '}';
    }
    
    

    public boolean isPoisoness() {
        return poisoness;
    }

    public void setPoisoness(boolean poisoness) {
        this.poisoness = poisoness;
    }

    public int getPoisonGlands() {
        return poisonGlands;
    }

    public void setPoisonGlands(int poisonGlands) {
        this.poisonGlands = poisonGlands;
    }
    
    
}
