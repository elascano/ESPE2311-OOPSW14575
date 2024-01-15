package ec.edu.espe.zoo.model;

import java.util.Date;

public class Giraffe extends Mammal {

    public Giraffe(int numberOfdMammaryGlands, String spine, int numberOfBones, int id, String scientificName,
            Date bornDate, int cageId) {
        super(numberOfdMammaryGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
    }

    @Override
    public String toString() {
        return "Giraffe{" + super.toString() + '}';
    }

    public void brushNeck() {
        System.out.println("Brushing the neck of the giraffe...");
    }

    @Override
    public void breastFeed() {
        System.out.println("    This giraffe is breastfeeding");
    }

    public void breastFeed(int calf) {
        System.out.println("    This giraffe is breastfeeding it's " + calf + " calf");
    }

}
