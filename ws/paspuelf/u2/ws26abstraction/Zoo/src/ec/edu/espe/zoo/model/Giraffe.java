package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public class Giraffe extends Mammal {

    private int height;

    @Override
    public void feed() {
        System.out.println("Feeding giraffe with leaves and twigs of acacia");
    }

    @Override
    public void move() {
        System.out.println("The giraffe is walking gracefully with its long legs.");
    }

    public Giraffe(int height, int numberOfMammayGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammayGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.height = height;
    }

    @Override
    public void breastFeed() {

        System.out.println("A giraffe is breastfeeding  ");

    }

    public void breastFeed(int id) {
        System.out.println("A giraffe is breatfeeding calf with id: " + id);

    }

    public void brushNeck() {
        System.out.println("Brushing the neck of the giraffe");
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

}
