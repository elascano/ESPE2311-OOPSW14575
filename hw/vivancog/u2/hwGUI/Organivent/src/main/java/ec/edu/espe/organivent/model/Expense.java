package ec.edu.espe.organivent.model;

import ec.edu.espe.organivent.utils.HandleInput;
import java.util.ArrayList;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Expense {
    private String type;
    private float costAmount;
    
    public static void createGeneralExpenses(ArrayList<Expense> generalExpenses){
        int option =1;
        do{
            generalExpenses.add(createExpense()); 
            System.out.println("Want to add another general expense?  1)Yes - 2)No");
            option=HandleInput.insertInteger();
        }while(option == 1);
        
    }
    
    private static Expense createExpense(){
        
        System.out.println("Enter the type of the expense:");
        String type = HandleInput.insertNonBlankString();
        
        System.out.println("Enter the cost of this expense:");
        float costAmount = HandleInput.insertPrice();

        return new Expense(type,costAmount);
    }
    
    public static float calculateTotalCost(ArrayList<Expense> expenseList){
        float individualExpenseCost=0;
        float totalGeneralExpenseCost=0;
        
        System.out.println("General Expenses:");
        for(Expense currentExpense:expenseList){
            individualExpenseCost = currentExpense.getCostAmount();
            System.out.println("   Type: " + currentExpense.getType() + " has a total cost = $ " + individualExpenseCost);
            totalGeneralExpenseCost += individualExpenseCost;
        }
        System.out.println(" Total General Expenses cost = $" + totalGeneralExpenseCost);
        
        return totalGeneralExpenseCost;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the costAmount
     */
    public float getCostAmount() {
        return costAmount;
    }

    /**
     * @param costAmount the costAmount to set
     */
    public void setCostAmount(float costAmount) {
        this.costAmount = costAmount;
    }

    public Expense(String type, float costAmount) {
        this.type = type;
        this.costAmount = costAmount;
    }
    
    public Expense(){}

    @Override
    public String toString() {
        return "Expense{" + "type=" + type + ", costAmount=" + costAmount + '}';
    }
}
