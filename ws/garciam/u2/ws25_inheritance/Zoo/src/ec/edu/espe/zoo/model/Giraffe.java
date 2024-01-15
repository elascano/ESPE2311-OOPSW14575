
package ec.edu.espe.zoo.model;

import java.util.Date;

public class Giraffe extends Mammal{
    
    public Giraffe(int numberOfdMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfdMammaryGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
    }
    
    @Override
    public void breastfeed(){
        System.out.println("giraffe is breastfeeding 1");
    }
    
    public void breastfeed(int calf){
        System.out.println("giraffe is breastfeeding its babe number --> " + calf);
    }
    
    public void brushNeck(){
        System.out.println("burshing the neck of the giraffe ");
    }

    @Override
    public String toString() {
        return "Giraffe{" +  super.toString() + '}';
    }
    
    
    
}
