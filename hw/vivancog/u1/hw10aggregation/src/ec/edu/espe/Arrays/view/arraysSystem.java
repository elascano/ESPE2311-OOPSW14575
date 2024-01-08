package ec.edu.espe.Arrays.view;
import ec.edu.espe.Arrays.model.Equipment;
import ec.edu.espe.Arrays.model.Staff;
import java.util.ArrayList;


/**
 *
 * @author Gabriel Vivanco
 */
public class arraysSystem {
    
    public static void main(String[] args){
       // Equipment[] equipments = new Equipment[2];
        ArrayList<Equipment> equipments = new ArrayList<>();
        Staff staff;
        
       // equipments[0]=new Equipment(1, "Security", 35, 2);
       // equipments[1]=new Equipment(2, "Readers", 35, 7);
       equipments.add(new Equipment(1, "Security", 35, 2));
       equipments.add(new Equipment(2, "Readers", 35, 2));
        
        staff = new Staff(1, "Group 1", equipments);
        
            
        System.out.println("Staff ---------" + staff);
        }
        
    
    }
