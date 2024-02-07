
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Platypus extends Mammal{
    private boolean poisones;
    private int poisonGlands;

    public Platypus(boolean poisones, int poisonGlands, int numberOfMammaryGlands, String spine, int numberOfbones, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfbones, id, ciemtificName, bornOnDate, cageId);
        this.poisones = poisones;
        this.poisonGlands = poisonGlands;
    }

    @Override
    public String toString() {
        return "Platypus{" + super.toString()+"poisones=" + poisones + ", poisonGlands=" + poisonGlands + '}';
    }
    
    
    
    

    /**
     * @return the poisones
     */
    public boolean isPoisones() {
        return poisones;
    }

    /**
     * @param poisones the poisones to set
     */
    public void setPoisones(boolean poisones) {
        this.poisones = poisones;
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
