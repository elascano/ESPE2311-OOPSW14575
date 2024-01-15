package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Elephant extends Mammal{
    private int trunkLenght;
    private int fangLength;
    
    public void useTrunk(){
        System.out.println("the elephant is using its trunk to feed");
    }

    public Elephant(int trunkLenght, int fangLength, int numberOfMammaryGland, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGland, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.trunkLenght = trunkLenght;
        this.fangLength = fangLength;
    }

    @Override
    public String toString() {
        return "Elephant{" +super.toString() + "trunkLenght=" + trunkLenght + ", fangLength=" + fangLength + '}';
    }
    
    /**
     * @return the trunkLenght
     */
    public int getTrunkLenght() {
        return trunkLenght;
    }

    /**
     * @param trunkLenght the trunkLenght to set
     */
    public void setTrunkLenght(int trunkLenght) {
        this.trunkLenght = trunkLenght;
    }

    /**
     * @return the fangLength
     */
    public int getFangLength() {
        return fangLength;
    }

    /**
     * @param fangLength the fangLength to set
     */
    public void setFangLength(int fangLength) {
        this.fangLength = fangLength;
    }
    
    
}
