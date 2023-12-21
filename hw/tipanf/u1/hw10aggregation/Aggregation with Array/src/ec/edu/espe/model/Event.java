package ec.edu.espe.model;

/**
 *
 * @author Frederick
 */
public class Event {
    
    private int id;
    private String place;
    private String artist;
    private Ticket[] tickets;

    @Override
    public String toString() {
        String messageDisplay=null;
        messageDisplay = "Event:" + "\n id ---> " + id + "\n place ---> " + place + "\n artist ---> " + artist + "\n Tickets:";
        
        for(Ticket currentTicket :tickets ){
            messageDisplay = messageDisplay + currentTicket;
        }
        
        return messageDisplay;
        //return "Event:" + "\n id ---> " + id + "\n place ---> " + place + "\n artist ---> " + artist + "\n Tickets:" + tickets;
    }
    
    

    public Event(int id, String place, String artist, Ticket[] tickets) {
        this.id = id;
        this.place = place;
        this.artist = artist;
        this.tickets = tickets;
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
     * @return the tickets
     */
    public Ticket[] getTickets() {
        return tickets;
    }

    /**
     * @param tickets the tickets to set
     */
    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }
    
    
    
}
