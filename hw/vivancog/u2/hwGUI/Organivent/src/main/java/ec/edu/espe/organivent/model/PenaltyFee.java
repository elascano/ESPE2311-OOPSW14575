package ec.edu.espe.organivent.model;

import ec.edu.espe.organivent.utils.HandleInput;
import java.util.ArrayList;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class PenaltyFee extends Expense{
    private String description;
    
    public static void createPenaltyFees(ArrayList<PenaltyFee> penaltyFees){
        int option =1;
        
        do{
            penaltyFees.add(createPenaltyFee());
            System.out.println("Want to add another penalty fee?  1)Yes - 2)No");
            option=HandleInput.insertInteger();
        }while(option == 1);
         
    }
    
    private static PenaltyFee createPenaltyFee(){
        
        System.out.println("Enter the type of the penalty fee:");
        String type = HandleInput.insertNonBlankString();
        
        System.out.println("Enter a brief description about this penalty fee:");
        String description = HandleInput.insertNonBlankString();
        
        System.out.println("Enter the cost of this penalty fee:");
        float cost = HandleInput.insertPrice();
        
        return new PenaltyFee(description, type, cost);
    }
    
    public static float calculateTotalPenaltyFeeCost(ArrayList<PenaltyFee> penaltyFeeList){
        float individualPenaltyFeeCost=0;
        float totalPenaltyFeeCost=0;
        
        System.out.println("Penalty Fees:");
        if(!penaltyFeeList.isEmpty()){
            for(PenaltyFee currentpenaltyFee:penaltyFeeList){
                individualPenaltyFeeCost = currentpenaltyFee.getCostAmount();
                System.out.println("   Type: " + currentpenaltyFee.getType() + " has a cost of: $ " + individualPenaltyFeeCost);
                totalPenaltyFeeCost += individualPenaltyFeeCost;
            }
        }else{
            System.out.println("This event doesn't have any penalty fee");
            totalPenaltyFeeCost=0;
        }
        System.out.println(" Total Penalty Fees cost = $" + totalPenaltyFeeCost);
        
        
        return totalPenaltyFeeCost;
    }

    public PenaltyFee(String description, String type, float costAmount) {
        super(type, costAmount);
        this.description = description;
    }
    
    public PenaltyFee(){}

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
