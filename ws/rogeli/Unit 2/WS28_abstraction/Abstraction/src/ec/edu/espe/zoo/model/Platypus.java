
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Platypus extends Mammal{
    
    private boolean poisoness;
    private int poisonGland;

      @Override
    public void feed() {
          System.out.println("Feeding platypus with small fish and worms");
    }
    
    public Platypus(boolean poisoness, int poisonGland, int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date borndateM, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfBones, id, scientificName, borndateM, cageId);
        this.poisoness = poisoness;
        this.poisonGland = poisonGland;
    }

    @Override
    public String toString() {
        return "Platypus{" +super.toString()+ "poisoness=" + poisoness + ", poisonGland=" + poisonGland + '}';
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
     * @return the poisonGland
     */
    public int getPoisonGland() {
        return poisonGland;
    }

    /**
     * @param poisonGland the poisonGland to set
     */
    public void setPoisonGland(int poisonGland) {
        this.poisonGland = poisonGland;
    }

}
