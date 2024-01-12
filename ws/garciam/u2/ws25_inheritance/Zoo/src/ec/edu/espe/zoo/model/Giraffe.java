
package ec.edu.espe.zoo.model;

import java.util.Date;

public class Giraffe extends Mammal{
    
    public Giraffe(int numberOfdMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfdMammaryGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
    }

    @Override
    public String toString() {
        return "Giraffe{" +  super.toString() + '}';
    }
    
    
    
}
