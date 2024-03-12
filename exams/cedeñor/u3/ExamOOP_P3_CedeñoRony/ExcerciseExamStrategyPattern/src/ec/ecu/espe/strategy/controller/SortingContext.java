
package ec.ecu.espe.strategy.controller;

public class SortingContext {
    private SortingStrategy sortStrategy;

    public int[] sort(int data[]) {

        int size = data.length;

        setSortStrategy(setSortStrategy(size));
        
        return getSortStrategy().sort(data);

    }
    
    public SortingStrategy setSortStrategy(int n) {

        if (n > 1 && n < 6) {
            setSortStrategy(new BubbleSort());
        }

        if (n >= 6 && n < 11) {
            setSortStrategy(new InsertionSort());
        }

        if (n >= 11) {
            setSortStrategy(new QuickSort());
        }

        return getSortStrategy();

    }

    public SortingStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortStrategy(SortingStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
