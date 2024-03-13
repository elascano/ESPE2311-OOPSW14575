package ec.edu.espe.sortapp.model;

import ec.edu.espe.sortapp.controller.SortingStrategy;

/**
 *
 * @author David
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int[] data) {
        int i, j, temp;
        boolean swapped;
        int n = data.length;
        
        for (i = 0; i < n - 1; i++){
            swapped = false;
            
            for (j = 0; j < n - i - 1; j++){
               
                if (data[j] > data[j + 1]) {
                    
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
             
            if (swapped == false)
                break;
        }
        
        return data;
    }
}