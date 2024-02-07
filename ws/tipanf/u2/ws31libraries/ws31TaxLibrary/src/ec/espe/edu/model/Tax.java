package ec.espe.edu.model;

/**
 *
 * @author Frederick
 */
public class Tax {
    public static float calculateTotalPrice(float initialCost){
        System.out.println(" ------- IVA -----");
        System.out.println("Initial price value: " + initialCost);
        float taxValue=calculateIVA(initialCost);
        
        System.out.println("Final price value: " + (initialCost+taxValue));
        
        return taxValue + initialCost;
    }
    
    private static float calculateIVA(float initialCost){        
        System.out.println("IVA value: " + initialCost*0.12f);
        return initialCost * 0.12f;
    }
    
}
