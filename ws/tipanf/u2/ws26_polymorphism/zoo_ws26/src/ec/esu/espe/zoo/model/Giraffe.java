package ec.esu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Giraffe extends Mammal{

    public Giraffe(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
    }
    @Override
    public void breastFeed(){
        System.out.println("Giraffe is breast feeding");
    }
    
    public void breastFeed(int calf){
        System.out.println("Giraffe is breast feeding it's calf number ---> " + calf);
    }

    @Override
    public String toString() {
        return "Giraffe{" + super.toString() + '}';
    }
    
    public void brushNeck(){
        System.out.println("Brushing the neck of the giraffe");
    }
    
    
    
}
