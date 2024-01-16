package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class Giraffe extends Mammal {

    public Giraffe(int numberOfMammaryGland, int id, String scientificName, Date bornOnDate, int cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGland, id, scientificName, bornOnDate, cageId, spine, numberOfBones);
    }

    @Override
    public void feed() {
        System.out.println("Feeding giraffe with grass");
    }

    @Override
    public void breastFeed() {
        System.out.println("giraffe is breastFeeding");
    }

    public void breastFeed(int calf) {
        System.out.println("giraffe is breastfedding its calf number: " + calf);
    }

    @Override
    public String toString() {
        return "Girrafe{" + super.toString() + '}';
    }

    public void brushNeck() {
        System.out.println("brusging the neck of the giraffe");
    }

}
