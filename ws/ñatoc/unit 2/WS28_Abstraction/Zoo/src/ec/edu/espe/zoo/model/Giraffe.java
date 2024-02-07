package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato
 */
public class Giraffe extends Mammal {

    public Giraffe(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
    }
    
    @Override
    public void breastfeed(){
    System.out.println("giraffe is breastfeeding");
}
   public void breastfeed(int calf){
       System.out.println("giraffe is breastfeeding its babe number --> " + calf);
   }

    @Override
    public String toString() {
        return "Giraffe{" + super.toString() + '}';
    }
    
    public void brushNeck(){
        System.out.println("brushing the neck of the giraffe");
    }

    @Override
    public void feed() {
        System.out.println("Feeding giraffe with grass");    }
}
