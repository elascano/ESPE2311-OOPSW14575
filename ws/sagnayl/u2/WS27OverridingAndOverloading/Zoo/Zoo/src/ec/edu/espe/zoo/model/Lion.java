package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Lion extends Mammal{
    private String maneColor;
    
    public void roar(){
        System.out.println("The Lion is roaring");
    }

    public Lion(String maneColor, int numberOfMammaryGland, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGland, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.maneColor = maneColor;
    }

    @Override
    public String toString() {
        return "Lion{" +super.toString() + "maneColor=" + getManeColor() + '}';
    }

    /**
     * @return the maneColor
     */
    public String getManeColor() {
        return maneColor;
    }

    /**
     * @param maneColor the maneColor to set
     */
    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

}
