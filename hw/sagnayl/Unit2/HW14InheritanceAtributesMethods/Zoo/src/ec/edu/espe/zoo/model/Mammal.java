package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Mammal extends Vertebrate{
    private int numberOfMammaryGland;
    
    public void breastfeed(){
        System.out.println("mammal breastfeed baby 1");
    }
    
    public void run(){
        System.out.println("The mammal is running");
    }

    /**
     * @return the numberOfMammaryGland
     */
    public int getNumberOfMammaryGland() {
        return numberOfMammaryGland;
    }

    /**
     * @param numberOfMammaryGland the numberOfMammaryGland to set
     */
    public void setNumberOfMammaryGland(int numberOfMammaryGland) {
        this.numberOfMammaryGland = numberOfMammaryGland;
    }

    public Mammal(int numberOfMammaryGland, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.numberOfMammaryGland = numberOfMammaryGland;
    }

    @Override
    public String toString() {
        return "Mammal{" +super.toString() + "numberOfMammaryGland=" + numberOfMammaryGland + '}';
    }
    
}
