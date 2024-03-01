package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Lobster extends Crustaceans {

    private int antennaeLenght;

    public Lobster(int antennaeLenght, boolean aquatic, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(aquatic, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.antennaeLenght = antennaeLenght;
    }

    @Override
    public String toString() {
        return "Lobster{" + "antennaeLenght=" + getAntennaeLenght() + '}';
    }

    public void swim() {

    }

    /**
     * @return the antennaeLenght
     */
    public int getAntennaeLenght() {
        return antennaeLenght;
    }

    /**
     * @param antennaeLenght the antennaeLenght to set
     */
    public void setAntennaeLenght(int antennaeLenght) {
        this.antennaeLenght = antennaeLenght;
    }

}
