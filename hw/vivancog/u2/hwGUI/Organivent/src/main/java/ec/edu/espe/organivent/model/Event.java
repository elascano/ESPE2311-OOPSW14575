package ec.edu.espe.organivent.model;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.UseMongoDB;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Event {

    private int id;
    private Artist artist;
    private EventPlace place;
    private Schedule startTime;
    private Schedule endTime;
    private ArrayList<Staff> staff;
    private ArrayList<Equipment> equipment;
    private ArrayList<Expense> generalExpenses;
    private ArrayList<PenaltyFee> penaltyFees;
    
    public static MongoCollection<Event> getFromDB(){
       Class classType = Event.class;
        String collectionName = "Event";
        
        MongoCollection<Event> eventInDB = UseMongoDB.getFromCollection(collectionName, classType);  
        
        return eventInDB;
    }
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        int option;
        do {
            System.out.println("--------------------- Event Manager ---------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("|     1.- Display general information from an Event     |");
            System.out.println("|     2.- Add a new Event                               |");
            System.out.println("|     3.- Calculate the cost from an Event              |");
            System.out.println("|     4.- See the Bill from an Event                    |");
            System.out.println("|     5.- Delete the Bill from an Event                    |");
            System.out.println("|     6.- Return                                        |");
            System.out.println("_________________________________________________________");
            System.out.println("Select an option (1-6): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    searchAnEvent();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 2:
                    addEvent();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 3:
                    searchEventIdToCalculate();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 4:
                    Bill.seeForBillId();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 5:   
                   Bill.deleteBill();
                   System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 6);
    
    }
    
    private static void addEvent(){
        MongoCollection<Event> eventInDB = Event.getFromDB();
        ArrayList<Event> eventList = new ArrayList<>();
        eventInDB.find().into(eventList);
        
        int asignId = eventList.size() + 1;
        int option=0;
        
        System.out.println("Enter the event start time:");
        Schedule starTime = Schedule.createEntrySchedule();
        System.out.println("Enter the event end time:");
        Schedule endTime = Schedule.createDepartureSchedule(starTime);
        
        Artist artist = Artist.searchForArtist();
        EventPlace eventPlace = EventPlace.searchForPlace();
        ArrayList<Staff> staffInEvent = Staff.enterStaff();
        ArrayList<Equipment> equipmentInEvent = Equipment.enterEquipment();
        
        ArrayList<Expense> generalExpenses = new ArrayList<>();
        Expense.createGeneralExpenses(generalExpenses);
        
        ArrayList<PenaltyFee> penaltyFees = new ArrayList<>();

        System.out.println("Enter Penalty Fees?  1)Yes - 2)No");
        option = HandleInput.insertInteger();
        if(option==1){
            PenaltyFee.createPenaltyFees(penaltyFees);
        }
        
        Event generatedEvent = new Event(asignId,artist,eventPlace,starTime, 
                endTime, staffInEvent, equipmentInEvent,generalExpenses,penaltyFees); 
        eventInDB.insertOne(generatedEvent);
        
    }
    
    private static void searchAnEvent(){
        MongoCollection<Event> eventInDB = Event.getFromDB();
        ArrayList<Event> eventList = new ArrayList<>();
        eventInDB.find().into(eventList);
        
         System.out.println("Enter the Event Id:");
         int id = HandleInput.insertInteger();
         int sizeCount=0;
        
         for(Event currentEvent : eventList) {
             if(id == currentEvent.getId()){
                seeEvent(currentEvent);
                break;
            }
            sizeCount++;
        }
        if(sizeCount==eventList.size()){
            System.out.println("The Id: " + id + " was not found");
        }
         
    }
    
    private static void seeEvent(Event currentEvent){
        String message = "\n--------------------------------------\nEvent Id: " + currentEvent.getId();
        message += "\nArtist: " + currentEvent.getArtist().getName();
        message += "\nEvent Place: " + currentEvent.getPlace().getName();
        message += "\n--------------------------------------\nStart Time: " + currentEvent.getStartTime();
        message += "\nEnd Time:" +  currentEvent.getEndTime();
        message += "\n--------------------------------------\nAsgigned Staff IDs: [";
        
        for(Staff currentStaff:currentEvent.getStaff()){
            message += currentStaff.getId();
            message += ",";
        }
        message += "] \nUsed Equipment: [";
        
        for(Equipment currentEquipment:currentEvent.getEquipment()){
            message += currentEquipment.getType();
            message += ",";
        }
         message += "] \n--------------------------------------\n";
        
        System.out.print(message);
    }
    

    private static void searchEventIdToCalculate(){
        MongoCollection<Event> eventInDB = Event.getFromDB();
        ArrayList<Event> eventList = new ArrayList<>();
        eventInDB.find().into(eventList);
        
         System.out.println("Enter the Event Id:");
         int id = HandleInput.insertInteger();
         int sizeCount=0;
        
         for(Event currentEvent : eventList) {
             if(id == currentEvent.getId()){
                calculateEventCost(currentEvent);
                break;
            }
            sizeCount++;
        }
        if(sizeCount==eventList.size()){
            System.out.println("The Id: " + id + " was not found");
        }
    }
    
    private static void calculateEventCost(Event currentEvent){
        float estimatedEventCost=0;
        float totalStaffCost=0;
        float totalEquipmentCost=0;
        float individualEquipmentCost=0;
        
        float artistHiringCost=currentEvent.getArtist().getWage();
        float placeRentCost=currentEvent.getPlace().getRentCost();
        
        
        System.out.println("===========[Event " + currentEvent.getId() + " cost details]===========");
        System.out.println("Artist hiring cost of: $" + currentEvent.getArtist().getWage());
        artistHiringCost = Bill.calculateIVA(artistHiringCost);
        estimatedEventCost += artistHiringCost;
        System.out.println("------------------------------------------------------");
        
        System.out.println("Event Place rent cost of: $" + currentEvent.getPlace().getRentCost());
        placeRentCost += Bill.calculateIVA(placeRentCost);
        estimatedEventCost += placeRentCost;
        System.out.println("------------------------------------------------------");
        
        System.out.println("Asigned Staff:");
        for(Staff currentStaff:currentEvent.getStaff()){
            System.out.println("   Id [" + currentStaff.getId()+ "]: " + "'" + currentStaff.getType() + "'" + " has a total cost of: $ " + currentStaff.getTotalStaffCost());
            totalStaffCost += currentStaff.getTotalStaffCost();
        }
        System.out.println(" Total Staff Cost = $" + totalStaffCost);
        estimatedEventCost += totalStaffCost;
        System.out.println("------------------------------------------------------");
        
        System.out.println("Used Equipment:");
        for(Equipment currentEquipment:currentEvent.getEquipment()){
            individualEquipmentCost=Equipment.getIndividualEquipmentCost(currentEquipment);
            System.out.println("   Type: " + currentEquipment.getType() + " has a total cost of: $ " + individualEquipmentCost);
            totalEquipmentCost += individualEquipmentCost;
        }
        System.out.println(" Total equipment cost = $" + totalEquipmentCost);
        estimatedEventCost += totalEquipmentCost;
        
        System.out.println("------------------------------------------------------");
        float totalGeneralExpenseCost=Expense.calculateTotalCost(currentEvent.getGeneralExpenses());
        estimatedEventCost += totalGeneralExpenseCost;
        
        System.out.println("------------------------------------------------------");
        float totalPenaltyFeeCost=PenaltyFee.calculateTotalPenaltyFeeCost(currentEvent.getPenaltyFees());
        estimatedEventCost += totalPenaltyFeeCost;
        
        System.out.println("------------------------------------------------------\n");
        System.out.println("     Event final cost = $" + estimatedEventCost);
        
        Bill tempBill = new Bill(currentEvent.getId(),artistHiringCost,placeRentCost,totalStaffCost,totalEquipmentCost,totalGeneralExpenseCost,totalPenaltyFeeCost,estimatedEventCost);
        Bill.saveBill(tempBill);
        System.out.println(" The cost information has been saved in a Bill");
        
    }

    public Event(int id, Artist artist, EventPlace place, Schedule startTime, Schedule endTime, ArrayList<Staff> staff, ArrayList<Equipment> equipment, ArrayList<Expense> generalExpenses, ArrayList<PenaltyFee> penaltyFees) {
        this.id = id;
        this.artist = artist;
        this.place = place;
        this.startTime = startTime;
        this.endTime = endTime;
        this.staff = staff;
        this.equipment = equipment;
        this.generalExpenses = generalExpenses;
        this.penaltyFees = penaltyFees;
    }
    
    public Event(){}

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
     * @return the artist
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * @return the place
     */
    public EventPlace getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(EventPlace place) {
        this.place = place;
    }

    /**
     * @return the startTime
     */
    public Schedule getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Schedule startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Schedule getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Schedule endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the staff
     */
    public ArrayList<Staff> getStaff() {
        return staff;
    }

    /**
     * @param staff the staff to set
     */
    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
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

    /**
     * @return the generalExpenses
     */
    public ArrayList<Expense> getGeneralExpenses() {
        return generalExpenses;
    }

    /**
     * @param generalExpenses the generalExpenses to set
     */
    public void setGeneralExpenses(ArrayList<Expense> generalExpenses) {
        this.generalExpenses = generalExpenses;
    }

    /**
     * @return the penaltyFees
     */
    public ArrayList<PenaltyFee> getPenaltyFees() {
        return penaltyFees;
    }

    /**
     * @param penaltyFees the penaltyFees to set
     */
    public void setPenaltyFees(ArrayList<PenaltyFee> penaltyFees) {
        this.penaltyFees = penaltyFees;
    }
     
}
