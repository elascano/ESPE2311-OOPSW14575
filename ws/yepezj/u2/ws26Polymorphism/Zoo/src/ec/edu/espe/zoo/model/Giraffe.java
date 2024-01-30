package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Giraffe extends Mammal{

    public Giraffe(int numberOfdMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornOnDate, int cageId) {
        super(numberOfdMammaryGlands, spine, numberOfBones, id, scientificName, bornOnDate, cageId);
    }
    @Override
    public void breastfeed(){
        System.out.println("Giraffe is breastfeeding");
    }
    
    public void breastfeed(int calf){
        System.out.println("Giraffe is breastfeeding its calf numbre --> " + calf);
    }
    
    @Override
    public String toString() {
        return "Giraffe{" + super.toString() + '}';
    }
    public void brushNeck(){
        System.out.println("brushing the neck of the giraffe");
    }
}
