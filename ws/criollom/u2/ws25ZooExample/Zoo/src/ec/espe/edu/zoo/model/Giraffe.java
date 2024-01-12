
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Giraffe extends Mammal {

    public Giraffe(int numberOfMammaryGlands, String spine, int numberOfbones, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfbones, id, ciemtificName, bornOnDate, cageId);
    }

    @Override
    public String toString() {
        return "Giraffe{" + super.toString() +'}';
    }
    
    
}
