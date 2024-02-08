package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Bettafish extends Fish{
    private int finLenght;
    
    public void finDeployment(){
        System.out.println("The Bettafish is spreading its fins");
    }

    public Bettafish(int finLenght, boolean itHasScales, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(itHasScales, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.finLenght = finLenght;
    }

    @Override
    public String toString() {
        return "Bettafish{" +super.toString() + "finLenght=" + getFinLenght() + '}';
    }

    /**
     * @return the finLenght
     */
    public int getFinLenght() {
        return finLenght;
    }

    /**
     * @param finLenght the finLenght to set
     */
    public void setFinLenght(int finLenght) {
        this.finLenght = finLenght;
    }

}
