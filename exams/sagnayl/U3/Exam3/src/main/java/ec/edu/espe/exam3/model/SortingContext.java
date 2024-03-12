package ec.edu.espe.exam3.model;

/**
 *
 * @author Luis Sagnay
 */
public class SortingContext {

    private SortingStrategy strategy;

    public int[] sort(int data[]) {
        int size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 1 && n <= 5) {
            strategy = new BubbleSort();
        }
        if (n > 5 && n <= 10) {
            strategy = new InsertionSort();
        }
        if (n > 10) {
            strategy = new QuickSort();
        }
        return strategy;
    }
    public String selectedSortMethod(int n) {
        
        String selectedSortMethod = null;
        
        if (n > 1 && n <= 5) {
            selectedSortMethod = "BubbleSort";
        }
        if (n > 5 && n <= 10) {
            selectedSortMethod = "InsertionSort";
        }
        if (n > 10) {
            selectedSortMethod = "QuickSort";
        }
        return selectedSortMethod;
    }
}
