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
public class Equipment {
    
    private String type;
    private float cost;
    private int quantity;
    
    public static MongoCollection<Equipment> getFromDB(){
       Class classType = Equipment.class;
        String collectionName = "Equipment";
        
        MongoCollection<Equipment> equipmentInDB = UseMongoDB.getFromCollection(collectionName, classType);  
        
        return equipmentInDB;
    }
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("-------- Equipment Manager --------");
            System.out.println("-----------------------------------");
            System.out.println("| 1.- See the current equipment   |");
            System.out.println("| 2.- Add a new equipment         |");
            System.out.println("| 3.- Return                      |");
            System.out.println("___________________________________");
            System.out.println("Select an option (1-3): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    seeEquipment();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 2:
                    addEquipment();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 3);
    
    }
    
    public static void addEquipment(){
        MongoCollection<Equipment> equipmentInDB = Equipment.getFromDB();

        System.out.println("Enter the type of equipment:");
        String type = HandleInput.insertNonBlankString();
        System.out.println("Enter the cost of the equipment:");
        float cost = HandleInput.insertPrice();
        System.out.println("Enter the quantity of equipment:");
        int quantity = HandleInput.insertInteger();
        
        Equipment generatedEquipment = new Equipment(type, cost, quantity);
        
        equipmentInDB.insertOne(generatedEquipment);
    }
    
    
    private static void seeEquipment(){
        MongoCollection<Equipment> equipmentInDB = Equipment.getFromDB();
        ArrayList<Equipment> equipmentList = new ArrayList<>();
        equipmentInDB.find().into(equipmentList);
        
        System.out.println("============== Equipment List ===============");
        System.out.println("         Type        | Unit Cost | Quantity |");
        System.out.println("=============================================");
         for(Equipment currentEquipment : equipmentList) {
            System.out.println(currentEquipment);
        }
    }
    
    public static ArrayList<Equipment> enterEquipment(){
        ArrayList<Equipment> equipmentInEvent = new ArrayList<>();
        
        String searchName;
        int addMore=1;
        boolean passed=false;
        int sizeCount=0;
        String textToCompare="";
        
        do{
            sizeCount=0;
            System.out.println("Insert the Equipment Type to add");
            searchName = HandleInput.insertNonBlankString().toLowerCase();
            
            for(Equipment currentEquipment : equipmentInEvent) {
                textToCompare=currentEquipment.getType().toLowerCase();
                if(textToCompare.contains(searchName)){
                    System.out.println("The type: " + searchName + " is already in this event");
                    passed=false;
                    break;
                }
                sizeCount++;
            }
            if(sizeCount==equipmentInEvent.size()){
                addMore = addEquipmentInEvent(equipmentInEvent,searchName);
            }
        }while(passed==false && addMore == 1);
        
        return equipmentInEvent;
    }
    
    public static int addEquipmentInEvent(ArrayList<Equipment> equipmentInEvent, String searchName){
        
        MongoCollection<Equipment> equipmentInDB = Equipment.getFromDB();
        ArrayList<Equipment> equipmentList = new ArrayList<>();
        equipmentInDB.find().into(equipmentList);
        
        int addMore=1;
        boolean passed=false;
        int sizeCount=0;
        String textToCompare;
        
        do{
            sizeCount=0;
            for(Equipment currentEquipment : equipmentList) {
                textToCompare=currentEquipment.getType().toLowerCase();
                if(textToCompare.contains(searchName)){
                    equipmentInEvent.add(currentEquipment);
                    passed=true;
                    System.out.println("Want to add another Equipment? 1) Yes - 2) No");
                    addMore = HandleInput.insertInteger();
                    break;
                }
                sizeCount++;
            }
            if(sizeCount==equipmentList.size()){
                System.out.println("The type: " + searchName + " was not found");
                passed=true;
            }
        }while(passed==false && addMore == 1);
        
        return addMore;
    }
    
    public static float getIndividualEquipmentCost(Equipment currentEquipment){
        return currentEquipment.getCost()*currentEquipment.getQuantity();
    }
    
    public static float calculateTotalEquipmentCost(ArrayList<Equipment> equipmentInEvent){
        float totalCost=0;
        
        for(Equipment currentEquipment : equipmentInEvent) {
            totalCost += ((currentEquipment.getCost()) * (currentEquipment.getQuantity()));
        }
        
        return totalCost;
    }

    @Override
    public String toString() {   
        return String.format("%-20s |$ %-9.2f| %-8d |", type, cost, quantity);
    }

    public Equipment(String type, float cost, int quantity) {
        this.type = type;
        this.cost = cost;
        this.quantity = quantity;
    }
    
    public Equipment(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
