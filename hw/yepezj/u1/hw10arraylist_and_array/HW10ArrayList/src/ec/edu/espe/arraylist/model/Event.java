package ec.edu.espe.arraylist.model;

import java.util.ArrayList;

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
    private ArrayList<Employee> employees;

    @Override
    public String toString() {
        return "\n Event: " + "\n - Id = " + id + "\n - StartTime = " + startTime + "\n - EndTime = " + endTime + "\n - Artist = " + artist + "\n - EstimatedCost = " + estimatedCost + "\n - Employees: \n" + employees ;
    }

    public Event(int id, String startTime, String endTime, String artist, float estimatedCost, ArrayList<Employee> employees) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.artist = artist;
        this.estimatedCost = estimatedCost;
        this.employees = employees;
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
     * @return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    
}
