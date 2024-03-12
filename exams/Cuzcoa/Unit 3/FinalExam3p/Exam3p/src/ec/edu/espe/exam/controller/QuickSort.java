package ec.edu.espe.exam.controller;

/**
 * Implementación del algoritmo QuickSort para la interfaz SortingStrategy.
 * 
 * @author Criollo Sebastian
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        // Implementación del algoritmo QuickSort aquí
        sort(arr, 0, arr.length - 1);
        return arr; // No necesitas devolver el array aquí
    }

    @Override
    public int[] sort(int[] arr, int low, int high) {
        // Implementación del algoritmo QuickSort aquí
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }

        return arr; // No necesitas devolver el array aquí
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        // Implementación del método de partición aquí
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    
    // Puedes agregar otros métodos auxiliares si es necesario
}
