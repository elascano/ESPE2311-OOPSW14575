package ec.edu.espe.organivent.model;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.UseMongoDB;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.conversions.Bson;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class EventPlace {

    private String name;
    private String adress;
    private float rentCost;
    private int capacity;
    
    public static MongoCollection<EventPlace> getFromDB(){
       Class classType = EventPlace.class;
        String collectionName = "EventPlace";
        
        MongoCollection<EventPlace> eventPlaceInDB = UseMongoDB.getFromCollection(collectionName, classType);  
        
        return eventPlaceInDB;
    }
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        int option;
        do {
            System.out.println("---------- Event Place Manager ------------");
            System.out.println("-------------------------------------------");
            System.out.println("|    1.- See the current event places     |");
            System.out.println("|    2.- Add a new event place            |");
            System.out.println("|    3.- Update a event place             |");
            System.out.println("|    4.- Delete a event place             |");
            System.out.println("|    5.- Return                           |");
            System.out.println("___________________________________________");
            System.out.println("Select an option (1-5): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    seeEventPlaces();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 2:
                    addEventPlace();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 3:
                    updateEventPlace();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    
                    break;
                case 4:
                    deleteEventPlace();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 5:
                    
                    break;
                    
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 5);
    }
    
    private static void addEventPlace(){
        MongoCollection<EventPlace> eventPlaceInDB = EventPlace.getFromDB();
        
        System.out.println("Enter the place's name:");
        String name = HandleInput.insertNonBlankString();
        System.out.println("Enter the place's adress:");
        String adress = HandleInput.insertNonBlankString();
        System.out.println("Enter the place's rent cost:");
        float rentCost = HandleInput.insertPrice();
        System.out.println("Enter the place's capacity:");
        int capacity = HandleInput.insertInteger();
        
        EventPlace generatedEventPlace = new EventPlace(name, adress, rentCost, capacity);
        
        eventPlaceInDB.insertOne(generatedEventPlace);
    }
    
    
    private static void seeEventPlaces(){
        MongoCollection<EventPlace> eventPlaceInDB = EventPlace.getFromDB();
        ArrayList<EventPlace> eventPlaceList = new ArrayList<>();
        eventPlaceInDB.find().into(eventPlaceList);
        
        System.out.println("===================================== Event Places List ====================================");
        System.out.println("             Name             |            Adress            |  Rent Cost | Capacity (seats)");
        System.out.println("============================================================================================");
         for(EventPlace currentEventPlace : eventPlaceList) {
            System.out.println(currentEventPlace);
        }
    }
    
    private static void updateEventPlace(){
        EventPlace eventPlaceToChange = searchForPlace();
        String changeFromThisName = eventPlaceToChange.getName();
        
        MongoCollection<EventPlace> eventPlaceInDB = EventPlace.getFromDB();
        Bson filter = eq("name", changeFromThisName);
        Bson updateField;
        
        int option;
        do {
            System.out.println("-------------------------------------");
            System.out.println("|  Event adress : " + eventPlaceToChange.getAdress());
            System.out.println("|  Event capacity: " + eventPlaceToChange.getCapacity());
            System.out.println("|  Event name: " + eventPlaceToChange.getName());
            System.out.println("|  Event rent cost: $" + eventPlaceToChange.getRentCost());
            System.out.println("");
            System.out.println("|    1.- Update adress              |");
            System.out.println("|    2.- Update capacity            |");
            System.out.println("|    3.- Update name                |");
            System.out.println("|    4.- Update rent cost           |");
            System.out.println("|    5.- Return                     |");
            System.out.println("-------------------------------------");
            System.out.println("Select an option (1-5): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    System.out.println("Enter the event address:");
                    eventPlaceToChange.setAdress(HandleInput.insertNonBlankString());
                    updateField = set("adress", eventPlaceToChange.getAdress());
                    
                    eventPlaceInDB.updateOne(filter, updateField);
               
                    break;
                case 2:
                    System.out.println("Enter the capacity of the event:");
                    eventPlaceToChange.setCapacity(HandleInput.insertInteger());
                    updateField = set("capacity", eventPlaceToChange.getCapacity());
                    
                    eventPlaceInDB.updateOne(filter, updateField);
                    
                    break;
                case 3:
                    System.out.println("Enter the name of the event place:");
                    eventPlaceToChange.setName(HandleInput.insertNonBlankString());
                    updateField = set("name", eventPlaceToChange.getName());
                    
                    eventPlaceInDB.updateOne(filter, updateField);
                    break;
                case 4:
                    System.out.println("Enter the rent cost of the event:");
                    eventPlaceToChange.setRentCost(HandleInput.insertFloat());
                    updateField = set("rentCost", eventPlaceToChange.getRentCost());
                    
                    eventPlaceInDB.updateOne(filter, updateField);
                    
                    break;
                case 5:
                    
                    break;
                    
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 5);
       
    }
    
    private static void deleteEventPlace(){        
        EventPlace eventPlaceToSearch = searchForPlace();
        String nameEventToDelete = eventPlaceToSearch.getName();
        
        deleteInDB(nameEventToDelete);
        
    }
    
    private static void deleteInDB(String nameEventToDelete){
        MongoCollection<EventPlace> artistInDB = EventPlace.getFromDB();
        
        Bson filter = eq("name", nameEventToDelete);
        artistInDB.deleteOne(filter);
    }
    
    public static EventPlace searchForPlace(){
        MongoCollection<EventPlace> eventPlaceInDB = EventPlace.getFromDB();
        ArrayList<EventPlace> eventPlaceList = new ArrayList<>();
        eventPlaceInDB.find().into(eventPlaceList);
        
        EventPlace eventPlace=null;
        String searchName;
        String textToCompare;
        boolean passed=false;
        int sizeCount=0;
        
        do{
            sizeCount=0;
            System.out.println("Enter the place where the event is going to be:");
            searchName = HandleInput.insertNonBlankString().toLowerCase();
            
            for(EventPlace currentEventPlace : eventPlaceList) {
                textToCompare=currentEventPlace.getName().toLowerCase();
                if(textToCompare.contains(searchName)){
                    eventPlace = currentEventPlace;
                    passed=true;
                    break;
                }
                sizeCount++;
            }
            
            if(sizeCount==eventPlaceList.size()){
                System.out.println("The place: " + searchName + " was not found");
            }
        }while(passed==false);
        
        
        return eventPlace;
    }

    @Override
    public String toString() {
        return String.format("%-30s|%-30s|$ %-10.2f|%-14d", name,adress,rentCost,capacity);
    }
    
    public EventPlace(){}

    public EventPlace(String name, String adress, float rentCost, int capacity) {
        this.name = name;
        this.adress = adress;
        this.rentCost = rentCost;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public float getRentCost() {
        return rentCost;
    }

    public void setRentCost(float rentCost) {
        this.rentCost = rentCost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
}
