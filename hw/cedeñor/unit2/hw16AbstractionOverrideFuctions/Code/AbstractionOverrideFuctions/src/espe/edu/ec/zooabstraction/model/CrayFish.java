package espe.edu.ec.zooabstraction.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public class CrayFish extends Crustaceans {

    private String streamPreference;

    public CrayFish(String streamPreference, boolean aquatic, String id, String scientificName, Date bornOnDate, int cageId, String exoskeletonType) {
        super(aquatic, id, scientificName, bornOnDate, cageId, exoskeletonType);
        this.streamPreference = streamPreference;
    }

    @Override
    public String toString() {
        return "CrayFish{" + "streamPreference=" + getStreamPreference() + '}';
    }

    @Override
    public void move() {
        System.out.println("The cray Fics is moves with style");
    }

    public void hideUnderRocks() {

    }

    /**
     * @return the streamPreference
     */
    public String getStreamPreference() {
        return streamPreference;
    }

    /**
     * @param streamPreference the streamPreference to set
     */
    public void setStreamPreference(String streamPreference) {
        this.streamPreference = streamPreference;
    }

}
