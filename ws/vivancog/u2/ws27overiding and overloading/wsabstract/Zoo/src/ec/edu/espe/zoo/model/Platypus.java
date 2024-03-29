package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Platypus extends Mammal{
    private boolean poisoness;
    private int poisonGlands;
    
    @Override
    public void feed() {
        System.out.println("feeding platypus with small fish and wores");        
    }
    

    public Platypus(boolean poisoness, int poisonGlands, int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGlands, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.poisoness = poisoness;
        this.poisonGlands = poisonGlands;
    }

    @Override
    public String toString() {
        return "Platypus{"+super.toString() + "poisoness=" + poisoness + ", poisonGlands=" + poisonGlands + '}';
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

    @Override
    public void vocalization() {
        System.out.println("The platypus murmurs");
    }
    
}
