package ec.edu.espe.organivent.model;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.UseMongoDB;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.conversions.Bson;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Bill {
    private int id;
    private float artistCost;
    private float venueCost;
    private float staffCost;
    private float equipmentCost;
    private float generalExpensesCost;
    private float penaltyFeesCost;
    private float totalAmount;
    
     public static MongoCollection<Bill> getFromDB(){
       Class classType = Bill.class;
        String collectionName = "Bill";
        
        MongoCollection<Bill> billInDB = UseMongoDB.getFromCollection(collectionName, classType);  
        
        return billInDB;
    }
    
    
    public static void saveBill(Bill tempBill){
        MongoCollection<Bill> billInDB = Bill.getFromDB();
        ArrayList<Bill> billList = new ArrayList<>();
        billInDB.find().into(billList);
        
        int searchId=tempBill.getId();
        boolean exists = searchForBill(searchId);
        
        
        
        if(exists==false){
            billInDB.insertOne(tempBill);
        }else{
            Bson filter = eq("_id",tempBill.getId());
            FindOneAndReplaceOptions returnDocAfterReplace = new FindOneAndReplaceOptions().returnDocument(ReturnDocument.AFTER);
            billInDB.findOneAndReplace(filter, tempBill, returnDocAfterReplace);
        }
    }
    
    private static boolean searchForBill(int id){
        MongoCollection<Bill> billInDB = Bill.getFromDB();
        ArrayList<Bill> billList = new ArrayList<>();
        billInDB.find().into(billList);
        
        boolean findBill=false;
        
        for(Bill currentBill : billList){
            if(currentBill.getId() == id){
                findBill=true;
                break;
            }
        }
        return findBill;
    }
    
    public static void seeForBillId(){
        MongoCollection<Bill> billInDB = Bill.getFromDB();
        ArrayList<Bill> billList = new ArrayList<>();
        billInDB.find().into(billList);
        
        System.out.println("Enter the Event Id to get it's bill:");
        int searchId = HandleInput.insertInteger();
        
        for(Bill currentBill : billList){
            if(currentBill.getId() == searchId){
                System.out.print("========[Bill from Event Id: " + searchId + " details]========");
                System.out.print(currentBill);
                break;
            }
        }
        
    }
    
    public static void deleteBill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Event Id to get it's bill:");
        int idToDelete = HandleInput.insertInteger();
        if(searchForBill(idToDelete)){
            System.out.println("Are you sure you want to delete this bill? Yes(1) or No(2)");
            int verificate = HandleInput.insertInteger();
            if(verificate == 1){
                deleteInDB(idToDelete);
            }else{
                System.out.println("The bill is not delete");
            }
        }else{
            System.out.println("The bill is not found");
        }       
    }
    
    private static void deleteInDB(int idToDelete){
        MongoCollection<Bill> billInDB = Bill.getFromDB();
        Bson filter = eq("_id", idToDelete);
        billInDB.deleteOne(filter);
        System.out.println("The bill is delete!");
    }

    @Override
    public String toString() {
        String message = "\n| Artist hiring cost               | $" + artistCost + " |";
        message += "\n| Venue hiring cost                | $" + venueCost + " |";
        message += "\n| Staff total cost                 | $" + staffCost + " |";
        message += "\n| Equipment total cost             | $" + equipmentCost + " |";
        message += "\n| General expenses total cost      | $" + generalExpensesCost + " |";
        message += "\n| Penalty fees total cost          | $" + penaltyFeesCost + " |";
        message += "\n------------------------------------------------\n";
        message += "         Total Amount: $"+ totalAmount;
        message += "\n------------------------------------------------\n";
        return   message;
    }
    
    public static float calculateIVA(float pureCost){
        float addedValue = pureCost * 0.12f;    
        return pureCost + addedValue;
    }

    public Bill(int id, float artistCost, float venueCost, float staffCost, float equipmentCost, float generalExpensesCost, float penaltyFeesCost, float totalAmount) {
        this.id = id;
        this.artistCost = artistCost;
        this.venueCost = venueCost;
        this.staffCost = staffCost;
        this.equipmentCost = equipmentCost;
        this.generalExpensesCost = generalExpensesCost;
        this.penaltyFeesCost = penaltyFeesCost;
        this.totalAmount = totalAmount;
    }
    
    public Bill(){}

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
     * @return the artistCost
     */
    public float getArtistCost() {
        return artistCost;
    }

    /**
     * @param artistCost the artistCost to set
     */
    public void setArtistCost(float artistCost) {
        this.artistCost = artistCost;
    }

    /**
     * @return the venueCost
     */
    public float getVenueCost() {
        return venueCost;
    }

    /**
     * @param venueCost the venueCost to set
     */
    public void setVenueCost(float venueCost) {
        this.venueCost = venueCost;
    }

    /**
     * @return the staffCost
     */
    public float getStaffCost() {
        return staffCost;
    }

    /**
     * @param staffCost the staffCost to set
     */
    public void setStaffCost(float staffCost) {
        this.staffCost = staffCost;
    }

    /**
     * @return the equipmentCost
     */
    public float getEquipmentCost() {
        return equipmentCost;
    }

    /**
     * @param equipmentCost the equipmentCost to set
     */
    public void setEquipmentCost(float equipmentCost) {
        this.equipmentCost = equipmentCost;
    }

    /**
     * @return the generalExpensesCost
     */
    public float getGeneralExpensesCost() {
        return generalExpensesCost;
    }

    /**
     * @param generalExpensesCost the generalExpensesCost to set
     */
    public void setGeneralExpensesCost(float generalExpensesCost) {
        this.generalExpensesCost = generalExpensesCost;
    }

    /**
     * @return the penaltyFeesCost
     */
    public float getPenaltyFeesCost() {
        return penaltyFeesCost;
    }

    /**
     * @param penaltyFeesCost the penaltyFeesCost to set
     */
    public void setPenaltyFeesCost(float penaltyFeesCost) {
        this.penaltyFeesCost = penaltyFeesCost;
    }

    /**
     * @return the totalAmount
     */
    public float getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
}
