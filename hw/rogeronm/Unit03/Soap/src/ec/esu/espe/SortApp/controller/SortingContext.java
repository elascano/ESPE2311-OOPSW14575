package ec.esu.espe.SortApp.controller;

/**
 *
 * @author EDWARICHSNAKE
 */
public class SortingContext{
    
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>=2 && n<=5){
            ss = new BubbleSort();
        }if (n>=6 && n<=10){
            ss = new InsertionSort();
        }if(n>=11){
            ss = new QuickSort();
        }
        
        return ss;
    }
    
}
