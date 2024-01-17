package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Kangaroo extends Mammal{
    private int legLength;

    public Kangaroo(int legLength, int numberOfMammaryGland, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGland, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.legLength = legLength;
    }

    @Override
    public String toString() {
        return "Kangaroo{" +super.toString() + "legLength=" + legLength + '}';
    }
    
    @Override
    public void breastfeed(){
        System.out.println("Kangaroo is breastfeeding ");
    }
    
    public void breastfeed(int calf){
        System.out.println("Kangaroo is breastfeeding its babe number --> " + calf);
    }
    
    @Override
    public void run (){
        System.out.println("The Kangaroo is jumping");
    }
    
    public void run (int speed){
        System.out.println("The Kangaroo is jumping at --> " +speed +" km/h");
    }
    
    /**
     * @return the legLength
     */
    public int getLegLength() {
        return legLength;
    }

    /**
     * @param legLength the legLength to set
     */
    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }
    
}
