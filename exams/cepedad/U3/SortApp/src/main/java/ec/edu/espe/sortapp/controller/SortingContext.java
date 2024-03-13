package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.BubbleSort;
import ec.edu.espe.sortapp.model.InsertionSort;
import ec.edu.espe.sortapp.model.QuickSort;

/**
 *
 * @author David
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public SortingStrategy setSortStrategy(int arraySize) {
        if( arraySize >0 && arraySize <= 3 ) {
            ss = new BubbleSort();} 
        else if ( arraySize > 3 && arraySize <= 7 ) {
            ss = new InsertionSort(); } 
        else if ( arraySize > 7 ) {
            ss = new QuickSort(); }
        
        return ss;
    }
    
    public int[ ] sort( int data[ ] ) {
        int size = data.length;
        ss = setSortStrategy(size);
        
        return ss.sort(data);
    }

    public SortingStrategy getSs() {
        return ss;
    }

}
