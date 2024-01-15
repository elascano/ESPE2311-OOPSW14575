package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Giraffe extends Mammal{
    private String colorOfSports;

    public Giraffe(String colorOfSports, int numberOfMammaryGland, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGland, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.colorOfSports = colorOfSports;
    }
    
    @Override
    public void breastfeed(){
        System.out.println("giraffe is breastfeeding ");
    }
    
    public void breastfeed(int calf){
        System.out.println("giraffe is breastfeeding its babe number --> " + calf);
    }
    
    public void brushNeck(){
        System.out.println("burshing the neck of the giraffe ");
    }

    @Override
    public String toString() {
        return "Giraffe{" +super.toString() + "colorOfSports=" + getColorOfSports() + '}';
    }

    /**
     * @return the colorOfSports
     */
    public String getColorOfSports() {
        return colorOfSports;
    }

    /**
     * @param colorOfSports the colorOfSports to set
     */
    public void setColorOfSports(String colorOfSports) {
        this.colorOfSports = colorOfSports;
    }

    
    
    
    
}