
package ec.edu.espe.exam3.model;

import ec.edu.espe.exam3.controller.SortingStrategy;
import java.util.ArrayList;

/**
 *
 * @author Fréderick Tipán
 */
public class QuickSort implements SortingStrategy {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> data) {
        int tempVar =0;
        
        ArrayList<Integer> sortList = data;
        for (int i = 0; i < sortList.size()-1; i++){
            if(sortList.get(i) > sortList.get( i + 1)){
                tempVar = sortList.get( i + 1);
                sortList.set(i+1, sortList.get(i));
                sortList.set(i, tempVar);
            }
        } 
        return sortList;
    }
}
