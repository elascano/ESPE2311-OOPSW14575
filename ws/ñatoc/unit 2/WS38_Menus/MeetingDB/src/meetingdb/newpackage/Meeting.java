package meetingdb.newpackage;

//import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Meeting {

    private String title;
    private String startTime;
    private String endTime;
    private List<String> participants;

    public Meeting(String title, String startTime, String endTime, List<String> participants) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Meeting{" + "title=" + title + ", startTime=" + startTime + ", endTime=" + endTime + ", participants=" + participants + '}';
    }
     

    public Document toDocument() {

        Document newMeetingDocument = new Document()
                .append("title", getTitle() != null ? getTitle() : "")
                .append("startTime", getStartTime() != null ? getStartTime() : "")
                .append("endTime", getEndTime() != null ? getEndTime() : "");
        
        return newMeetingDocument;
    }

    public static Meeting fromDocument(Document document) {
        String title = document.getString("title");
        String startTime = document.getString("startTime");
        String endTime = document.getString("endTime");
    
 
        return new Meeting(title, startTime, endTime,);
    }
    
    
    
    
//    public static void printMeeting() {
//        System.out.println("*=======================================*");
//        System.out.println("Meeting Option");
//        System.out.println("1. Register new meeting");
//        System.out.println("2. View all meeting");
//        System.out.println("3. Delete meeting by title");
//        System.out.println("4. Update meeting by title");
//        System.out.println("0. Exit");
//    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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
     * @return the participants
     */

}
