package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Platypus extends Mammal{
    private boolean poisoness;
    private int poisonGlands;
    
    
    public Platypus(boolean poisoness, int poisonGlands, int numberOfMammaryGland, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGland, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.poisoness = poisoness;
        this.poisonGlands = poisonGlands;
    }

    @Override
    public String toString() {
        return "Platypus{" +super.toString() + "poisoness=" + poisoness + ", poisonGlands=" + poisonGlands + '}';
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
    public void feed() {
        System.out.println("feeding Platypus whith algas");
    }
}
