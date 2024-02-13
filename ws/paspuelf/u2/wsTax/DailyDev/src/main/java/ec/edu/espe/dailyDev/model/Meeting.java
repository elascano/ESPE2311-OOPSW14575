package ec.edu.espe.dailyDev.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dailyDev.utils.MenuUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collectors;


/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Meeting {

        private static final Scanner consoleScanner = new Scanner(System.in);
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private static final Gson gson = new Gson();
    private UUID id;
    private String title;
    private Date startTime;
    private Date endTime;
    private List<User> participants;
    private static List<Meeting> meetingsList = loadMeetingsFromJson();
    private static final List<User> userList = new ArrayList<>();

    @Override
    public String toString() {
        return "Meeting{" + "id=" + id + ", title=" + title + ", startTime=" + startTime + ", endTime=" + endTime + ", participants=" + participants + '}';
    }

    private Meeting(String title, Date startTime, Date endTime, List<User> participants) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.participants = participants;

    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    private static List<Meeting> getMeetingsList() {
        return meetingsList;
    }

    private static List<User> getUserList() {
        return userList;
    }

    public static void create() {
        System.out.println("---Meeting register...");
        List<Meeting> meetings = new ArrayList<>();
        do {
            String title = getUserInput("title");
            Date startTime;
            Date endTime;

            do {
                startTime = getDateTimeInput("start time");
                endTime = getDateTimeInput("end Time");

                if (!isValidMeetingTime(startTime, endTime)) {
                    System.out.println("Invalid dates. Make sure the end time is after start time and start time is not in the past.");
                }
            } while (!isValidMeetingTime(startTime, endTime));

            List<User> participants = getParticipantsList();

            if (!participants.isEmpty()) {
                Meeting newMeeting = createMeeting(title, startTime, endTime, participants);
                System.out.println("Meeting registered successfully! ID: " + newMeeting.getId());
                meetings.add(newMeeting);
            } else {
                System.out.println("Make sure to have registered participants before creating a meeting.");
            }
            System.out.println("Do you want to add another meeting? (yes/no)");
            String addAnotherMeeting = consoleScanner.nextLine().trim().toLowerCase();

            if (!addAnotherMeeting.equals("yes")) {
                break;
            }
        } while (true);
        saveMeetingsListToJson(meetings);

        MenuUtils.backToMainMenu();

    }

    private static void saveMeetingsListToJson(List<Meeting> meetings) {

        String meetingJson = gson.toJson(meetings);

        try {

            FileWriter fileWriter = new FileWriter("meetings.json", true);


            fileWriter.write(meetingJson + System.lineSeparator());


            fileWriter.close();

            System.out.println("Meeting saved to file: meetings.json");
        } catch (IOException e) {
            System.out.println("Error writing to file: meetings.json");
            e.printStackTrace();
        }
    }

    private static List<User> getParticipantsList() {
        List<User> participants = new ArrayList<>();
        List<User> userList = getUserList();

        while (true) {
            System.out.println("Participants available:");
            for (int i = 0; i < userList.size(); i++) {
                System.out.println(i + 1 + ". " + userList.get(i).getUsername());
            }
            System.out.println("Select a participant by index (1-" + userList.size() + "):");
            int selectedIndex = getUserIndexInput(userList.size());
            // Verificar si el índice es válido
            if (selectedIndex >= 1 && selectedIndex <= userList.size()) {
                // Agregar el participante seleccionado a la lista de participantes
                participants.add(userList.get(selectedIndex - 1));
            } else {
                System.out.println("Invalid index. Please enter a valid index.");
            }

            System.out.println("Do you want to add another participant? (yes/no)");
            String addAnother = consoleScanner.nextLine().trim().toLowerCase();
            if (!addAnother.equals("yes")) {
                break;
            }
        }

        return participants;
    }

    private static int getUserIndexInput(int maxIndex) {
        while (true) {
            try {
                int userInput = Integer.parseInt(consoleScanner.nextLine());

                if (userInput >= 1 && userInput <= maxIndex) {
                    return userInput;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid index (1-" + maxIndex + ").");
            }
        }
    }

    public static String getUserInput(String message) {
        System.out.println("Enter " + message + ": ");
        return consoleScanner.nextLine();
    }

    public static Date getDateTimeInput(String message) {
        System.out.println("Enter " + message + " (format: DD/MM/YYYY HH:mm):");

        while (true) {
            try {
                String userInput = consoleScanner.nextLine();
                if (userInput.trim().isEmpty()) {
                    throw new ParseException("Empty input", 0);
                }

                Date date = DATE_FORMATTER.parse(userInput);

                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.DAY_OF_MONTH, 30);

                if (isValidDateTimeRange(date, cal.getTime())) {
                    return date;
                } else {
                    throw new ParseException("Invalid date/time. Maximum allowed range is 30 days from now.", 0);
                }
            } catch (ParseException e) {
                System.out.println("Invalid date/time format or out of range. Please enter the date/time in the correct format.");
            }
        }
    }

    private static boolean isValidDateTimeRange(Date date, Date maxDate) {
        return date.after(new Date()) && date.before(maxDate);
    }

    private static boolean isValidMeetingTime(Date startTime, Date endTime) {
        return !endTime.before(startTime) && startTime.after(new Date());
    }

    private static Meeting createMeeting(String title, Date startTime, Date endTime, List<User> participants) {
        Meeting newMeeting = new Meeting(title, startTime, endTime, participants);
        getMeetingsList().add(newMeeting);
        return newMeeting;
    }

    public static void show() {
        System.out.println("Showing meetings...");

        if (meetingsList.isEmpty()) {
            System.out.println("No meetings found.");
        } else {
          
            printFormattedMeetingHeader();

            for (Meeting meeting : meetingsList) {
                meeting.printFormattedMeeting();
            }

         
        }
    }

    private static List<Meeting> loadMeetingsFromJson() {
        List<Meeting> meetings = new ArrayList<>();

        
        String jsonFilePath = "meetings.json";

        
        File file = new File(jsonFilePath);
        if (!file.exists()) {
            try {
                // Intentar crear el archivo si no existe
                if (file.createNewFile()) {
                    System.out.println("Empty meetings.json created.");
                } else {
                    System.out.println("Failed to create meetings.json.");
                }
            } catch (IOException e) {
                System.out.println("Error creating meetings.json.");
                e.printStackTrace();
            }
        }

        try (Reader reader = new FileReader(jsonFilePath)) {
            Type type = new TypeToken<List<Meeting>>() {
            }.getType();
            meetings = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Error: meetings.json not found. Make sure the file exists in the correct location.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading from file: meetings.json");
            e.printStackTrace();
        }

        return meetings;
    }

    public static void printFormattedMeetingHeader() {
        String format = "| %-36s | %-20s | %-35s | %-15s | %-15s | %-10s |%n";
        System.out.format(format, "ID", "Title", "Start Time", "End Time", "Participants", "Participants Count");
    }

    public void printFormattedMeeting() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        String format = "| %-36s | %-20s | %-35s | %-15s | %-15s | %-10s |%n";
        System.out.format(format, getId(), getTitle(), sdf.format(getStartTime()), sdf.format(getEndTime()), getParticipantsAsString(), getParticipants().size());
    }

    private String getParticipantsAsString() {
       
        return getParticipants().stream().map(User::getUsername).collect(Collectors.joining(", "));

    }

    public static void update() {
        System.out.println("Updating a meeting...");


        listMeetings();

        System.out.println("Enter the index  of the meeting you want to update:");
        int selectedIndex = getUserIndexInput(meetingsList.size());

        if (selectedIndex >= 1 && selectedIndex <= meetingsList.size()) {
  
            Meeting meetingToUpdate = meetingsList.get(selectedIndex - 1);

     
            showMeetingDetails(meetingToUpdate);

            System.out.println("Enter new information for the meeting:");
            String newTitle = getUserInput("New title");
            Date newStartTime = getDateTimeInput("New start time");
            Date newEndTime = getDateTimeInput("New end time");

 
            updateMeetingInfo(meetingToUpdate, newTitle, newStartTime, newEndTime);

  
            saveMeetingsToJson(meetingsList);

            System.out.println("Meeting updated successfully!");

            show();
        } else {
            System.out.println("Invalid index. Meeting not updated.");
        }

        MenuUtils.backToMainMenu();
    }

    private static void showMeetingDetails(Meeting meeting) {
        System.out.println("Meeting details:");
        meeting.printFormattedMeeting();
    }

    private static void updateMeetingInfo(Meeting meeting, String newTitle, Date newStartTime, Date newEndTime) {
        meeting.setTitle(newTitle);
        meeting.setStartTime(newStartTime);
        meeting.setEndTime(newEndTime);
    }

    private static void saveMeetingsToJson(List<Meeting> meetings) {
        try (Writer writer = new FileWriter("meetings.json")) {
            gson.toJson(meetings, writer);
            System.out.println("Meetings saved to file: meetings.json");
        } catch (IOException e) {
            System.out.println("Error writing to file: meetings.json");
            e.printStackTrace();
        }
    }

    private static void listMeetings() {
        System.out.println("Meeting List:");
        for (Meeting meeting : meetingsList) {
            System.out.println("ID: " + meeting.getId() + ", Title: " + meeting.getTitle());
        }
    }

    private static Meeting findMeetingById(UUID id) {
        for (Meeting meeting : meetingsList) {
            if (meeting.getId().equals(id)) {
                return meeting;
            }
        }
        return null;
    }

    public static void delete() {
        System.out.println("Deleting a meeting...");


        listMeetings();

        System.out.println("Enter the index of the meeting you want to delete:");
        int selectedIndex = getUserIndexInput(meetingsList.size());


        if (selectedIndex >= 1 && selectedIndex <= meetingsList.size()) {
         
            Meeting meetingToDelete = meetingsList.get(selectedIndex - 1);

            showMeetingDetails(meetingToDelete);

          
            deleteMeeting(meetingToDelete);

       
            saveMeetingsToJson(meetingsList);

            System.out.println("Meeting deleted successfully!");

     
            show();
        } else {
            System.out.println("Invalid index. Meeting not deleted.");
        }

        MenuUtils.backToMainMenu();
    }

    private static void deleteMeeting(Meeting meeting) {
        meetingsList.remove(meeting);
    }

}
