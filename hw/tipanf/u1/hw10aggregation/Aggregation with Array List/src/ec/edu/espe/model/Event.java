package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Frederick
 */
public class Event {
    private int id;
    private String place;
    private String artist;
    private ArrayList<Equipment> equipment;

    @Override
    public String toString() {
        return "Event: " + "\n id ---> " + id + "\n place ---> " + place + "\n artist ---> " + artist + "\n Equipment:" + equipment;
    }
    
    

    public Event(int id, String place, String artist, ArrayList<Equipment> equipment) {
        this.id = id;
        this.place = place;
        this.artist = artist;
        this.equipment = equipment;
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
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
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
     * @return the equipment
     */
    public ArrayList<Equipment> getEquipment() {
        return equipment;
    }

    /**
     * @param equipment the equipment to set
     */
    public void setEquipment(ArrayList<Equipment> equipment) {
        this.equipment = equipment;
    }
    
    
    
}
