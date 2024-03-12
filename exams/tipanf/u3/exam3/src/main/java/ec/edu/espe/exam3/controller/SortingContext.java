
package ec.edu.espe.exam3.controller;

import ec.edu.espe.exam3.model.BubbleSort;
import ec.edu.espe.exam3.model.InsertionSort;
import ec.edu.espe.exam3.model.QuickSort;
import java.util.ArrayList;

/**
 *
 * @author Fréderick Tipán
 */
public class SortingContext {
    private SortingStrategy ss;
    private String algorithmType;
    
    public ArrayList<Integer> sort(ArrayList<Integer> data){
        int size = data.size();
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>=2 && n<=5){
            ss = new BubbleSort();
            algorithmType = "Bubble Sort";
        }
        
        if(n>=6 && n<=10){
            ss = new InsertionSort();
            algorithmType = "Insertion Sort";
        }
        
        if(n>=11){
            ss = new QuickSort();
            algorithmType = "Quick Sort";
        }
        
        return ss;
    }
    
    public String getAlgorithmType(){
        return algorithmType;
    }

}
