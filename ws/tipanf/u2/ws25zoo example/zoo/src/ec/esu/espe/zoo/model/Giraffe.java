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
    public String toString() {
        return "Giraffe{" + super.toString() + '}';
    }
    
    
    
}
