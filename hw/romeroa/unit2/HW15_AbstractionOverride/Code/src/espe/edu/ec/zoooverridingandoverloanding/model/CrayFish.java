package espe.edu.ec.zoooverridingandoverloanding.model;

import java.util.Date;

/**
 *
 * @author Andrés Romero - DCCO
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
