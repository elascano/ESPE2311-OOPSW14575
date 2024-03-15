package ec.edu.espe.sortapp.controller;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class SortAppController {
  public static int[] convertStringToArray(String line){
        String[] data;
        int [] numbers;
        int dataSize;
        
        data = line.split(",");
        dataSize = data.length;
        numbers = new int[dataSize];
        
        for(int i = 0; i < dataSize; i++){
            numbers[i] = Integer.parseInt(data[i]);
        }
        
        return numbers;
    }
    
    public static void detectWrongInput(char c, Frame frame){
        if((c != KeyEvent.VK_BACK_SPACE) && !(Character.isDigit(c)) && (c != KeyEvent.VK_COMMA)){
            JOptionPane.showMessageDialog(frame, c + " is not accepted here.",
                    "warning imput data",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public static String getUsedSortingMethod(SortingStrategy ss){
        String[] aux;
        String usedMethod;
       
        aux = ss.getClass().toString().replace(" ", "").split("\\.");
        usedMethod = aux[aux.length-1];
        
        return usedMethod;
    }  
}
