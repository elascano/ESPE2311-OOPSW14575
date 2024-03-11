
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Giraffe extends Mammal{
  
    @Override
    public void feed() {
        System.out.println("Feeding giraffe with grass");
    }
    
    public Giraffe(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String scientificName, Date borndateM, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfBones, id, scientificName, borndateM, cageId);
    }

    @Override
    public String toString() {
        return "Giraffe{" + super.toString()+ '}';
    }
    
}
