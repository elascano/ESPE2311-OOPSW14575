package ec.edu.espe.exam.controller;

/**
 * Clase que gestiona la selección de estrategias de ordenamiento.
 * 
 * @author Criollo Sebastian
 */
public class SortingManager {

    private SortingStrategy strategy;

    public int[] sort(int data[]) {
        int size = data.length;
        strategy = determineSortStrategy(size);
        return strategy.sort(data);
    }

    public SortingStrategy determineSortStrategy(int n) {
        if (n > 0 && n <= 3) {
            strategy = new BubbleSort();
        } else if (n > 4 && n <= 7) {
            strategy = new InsertionSort();
        } else if (n > 7) {
            strategy = new QuickSort();
        } else {
            throw new IllegalArgumentException("Tamaño de datos no válido para selección de estrategia de ordenamiento.");
        }
        return strategy;
    }

    public String getSelectedSortMethodName(int n) {
        String selectedSortMethod = null;

        if (n > 0 && n <= 3) {
            selectedSortMethod = "BubbleSort";
        } else if (n > 4 && n <= 7) {
            selectedSortMethod = "InsertionSort";
        } else if (n > 7) {
            selectedSortMethod = "QuickSort";
        } else {
            throw new IllegalArgumentException("Tamaño de datos no válido para selección de método de ordenamiento.");
        }
        return selectedSortMethod;
    }
}
