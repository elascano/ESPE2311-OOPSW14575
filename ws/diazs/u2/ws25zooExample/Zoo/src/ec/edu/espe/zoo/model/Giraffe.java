package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class Giraffe extends Mammal{
    
    public Giraffe(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
    }
    
    @Override
    public void breastfeed(){
        System.out.println("Giraffe is breastfeeding");
    }
    
    public void breastfeed(int calf){
        System.out.println("Giraffe is brestfeeding its calf number -->" + calf);
    }
            
    @Override
    public String toString() {
        return "Giraffe{" + super.toString() + '}';
    }
    public void brushNeck(){
        System.out.println("Brushing the neck of the giraffe");
    }
}
