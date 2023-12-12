package ec.edu.espe.array.model;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Event {
    private int id;
    private String startTime;
    private String endTime;
    private String artist;
    private float estimatedCost;
    private Staff[] staff;

    @Override
    public String toString() {
        String event;
        event = "\n Event: " + "\n - Id = " + id + "\n - StartTime = " + startTime + "\n - EndTime = " + endTime + "\n - Artist = " + artist + "\n - EstimatedCost = " + estimatedCost + "\n - Staff: "; 
            
                for(Staff staff : staff){
                event += staff;
            };
        return event;

    }

    public Event(int id, String startTime, String endTime, String artist, float estimatedCost, Staff[] eventPlace) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.artist = artist;
        this.estimatedCost = estimatedCost;
        this.staff = eventPlace;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the estimatedCost
     */
    public float getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * @param estimatedCost the estimatedCost to set
     */
    public void setEstimatedCost(float estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    /**
     * @return the eventPlace
     */
    public Staff[] getEventPlace() {
        return staff;
    }

    /**
     * @param eventPlace the eventPlace to set
     */
    public void setEventPlace(Staff[] eventPlace) {
        this.staff = eventPlace;
    }
    
    
}
